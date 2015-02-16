package com.watchforstock.evohome.status;

import java.util.List;

public class DHWStatus {
	private String dhwId;
	private TemperatureStatus temperatureStatus;
	private StateStatus stateStatus;
	private List<String> activeFaults;

	public String getDhwId() {
		return dhwId;
	}

	public void setDhwId(String dhwId) {
		this.dhwId = dhwId;
	}

	public TemperatureStatus getTemperatureStatus() {
		return temperatureStatus;
	}

	public void setTemperatureStatus(TemperatureStatus temperatureStatus) {
		this.temperatureStatus = temperatureStatus;
	}

	public StateStatus getStateStatus() {
		return stateStatus;
	}

	public void setStateStatus(StateStatus stateStatus) {
		this.stateStatus = stateStatus;
	}

	public List<String> getActiveFaults() {
		return activeFaults;
	}

	public void setActiveFaults(List<String> activeFaults) {
		this.activeFaults = activeFaults;
	}

}
