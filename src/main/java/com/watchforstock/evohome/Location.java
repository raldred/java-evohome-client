package com.watchforstock.evohome;

import java.util.List;

import com.watchforstock.evohome.status.GatewayStatus;
import com.watchforstock.evohome.status.LocationStatus;

public class Location {
	private LocationInfo locationInfo;
	private List<Gateway> gateways;

	public LocationInfo getLocationInfo() {
		return locationInfo;
	}

	public void setLocationInfo(LocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public List<Gateway> getGateways() {
		return gateways;
	}

	public void setGateways(List<Gateway> gateways) {
		this.gateways = gateways;
	}

	public void updateStatus(LocationStatus locStatus) {
		for (Gateway gateway : gateways) {
			for (GatewayStatus status : locStatus.getGateways()) {
				if (gateway.getGatewayInfo().getGatewayId()
						.equals(status.getGatewayId())) {
					gateway.updateStatus(status);
				}
			}
		}
	}

}
