package com.watchforstock.evohome.status;

import java.util.List;

public class LocationStatus {
	private String locationId;
	private List<GatewayStatus> gateways;

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public List<GatewayStatus> getGateways() {
		return gateways;
	}

	public void setGateways(List<GatewayStatus> gateways) {
		this.gateways = gateways;
	}

}
