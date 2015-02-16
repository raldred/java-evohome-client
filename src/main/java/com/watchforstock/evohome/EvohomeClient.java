package com.watchforstock.evohome;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jackson.JacksonFeature;

import com.watchforstock.AuthInfo;
import com.watchforstock.MyObjectMapperProvider;
import com.watchforstock.evohome.status.LocationStatus;

public class EvohomeClient {

	private AuthInfo authInfo = null;
	private static WebTarget webTarget = null;
	private static WebTarget mainApi = null;
	private UserInfo userInfo = null;
	private List<Location> locations = null;

	static {
		Client client = ClientBuilder.newClient();
		client.register(MyObjectMapperProvider.class);
		client.register(JacksonFeature.class);
		webTarget = client
				.target("https://rs.alarmnet.com:443/TotalConnectComfort/");

		Client client2 = ClientBuilder.newClient();
		client2.register(JacksonFeature.class);

		WebTarget webTarget2 = client2
				.target("https://rs.alarmnet.com:443/TotalConnectComfort/");

		mainApi = webTarget2.path("WebAPI").path("emea").path("api").path("v1");
	}

	public void init(String username, String password) {
		authInfo = login(username, password);
		userInfo = userInfo();
		locations = installation();

		for (Location location : locations) {
			LocationStatus locStatus = getLocationStatus(location);
			location.updateStatus(locStatus);
		}
	}

	private LocationStatus getLocationStatus(Location location) {
		WebTarget status = mainApi.path("location")
				.path(location.getLocationInfo().getLocationId())
				.path("status")
				.queryParam("includeTemperatureControlSystems", "True");

		Builder builder = getBuilder(status);

		return builder.get().readEntity(LocationStatus.class);
	}

	private Builder getBuilder(WebTarget target) {
		Invocation.Builder invocationBuilder = target
				.request(MediaType.APPLICATION_JSON_TYPE);

		invocationBuilder.header("applicationId",
				"b013aa26-9724-4dbd-8897-048b9aada249");
		invocationBuilder.header("Authorization",
				"bearer " + authInfo.getAccessToken());
		return invocationBuilder;
	}

	private AuthInfo login(String username, String password) {

		WebTarget authTarget = webTarget.path("Auth");
		WebTarget tokenTarget = authTarget.path("OAuth").path("Token");

		Invocation.Builder invocationBuilder = tokenTarget
				.request(MediaType.APPLICATION_JSON_TYPE);

		invocationBuilder
				.header("Authorization",
						"Basic YjAxM2FhMjYtOTcyNC00ZGJkLTg4OTctMDQ4YjlhYWRhMjQ5OnRlc3Q=");

		MultivaluedHashMap<String, String> formData = new MultivaluedHashMap<String, String>();
		formData.putSingle("grant_type", "password");
		formData.putSingle("scope",
				"EMEA-V1-Basic EMEA-V1-Anonymous EMEA-V1-Get-Current-User-Account");
		formData.putSingle("Username", username);
		formData.putSingle("Password", password);
		Response response = invocationBuilder.post(Entity.form(formData));

		AuthInfo info = response.readEntity(AuthInfo.class);

		return info;
	}

	private UserInfo userInfo() {
		WebTarget userTarget = mainApi.path("userAccount");

		Builder builder = getBuilder(userTarget);

		Response response = builder.get();

		// System.out.println(response.readEntity(String.class));
		// return null;
		return response.readEntity(UserInfo.class);

	}

	private List<Location> installation() {
		// r =
		// requests.get('https://rs.alarmnet.com:443/TotalConnectComfort/WebAPI/emea/api/v1/location/installationInfo?userId=%s&includeTemperatureControlSystems=True'
		// % self.account_info['userId'], headers=self.headers)

		WebTarget installation = mainApi.path("location")
				.path("installationInfo")
				.queryParam("userId", userInfo.getUserId())
				.queryParam("includeTemperatureControlSystems", "True");

		Builder builder = getBuilder(installation);

		// System.out.println(builder.get().readEntity(String.class));
		return builder.get().readEntity(new GenericType<List<Location>>() {
		});

	}

	private void getSomething() {
		// 'Authorization': 'bearer ' + self.access_token,
		// 'applicationId': 'b013aa26-9724-4dbd-8897-048b9aada249',

	}
}
