package com.watchforstock.evohome.status;

import java.util.List;

public class GatewayStatus {
	private String gatewayId;
	private List<ControlSystemStatus> temperatureControlSystems;
	private List<String> activeFaults;

	public String getGatewayId() {
		return gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public List<ControlSystemStatus> getTemperatureControlSystems() {
		return temperatureControlSystems;
	}

	public void setTemperatureControlSystems(
			List<ControlSystemStatus> temperatureControlSystems) {
		this.temperatureControlSystems = temperatureControlSystems;
	}

	public List<String> getActiveFaults() {
		return activeFaults;
	}

	public void setActiveFaults(List<String> activeFaults) {
		this.activeFaults = activeFaults;
	}

}
