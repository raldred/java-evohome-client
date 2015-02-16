package com.watchforstock.evohome.status;

import java.util.List;

public class ZoneStatus {
	private String zoneId;
	private TemperatureStatus temperatureStatus;
	private List<String> activeFaults;
	private SetPointStatus heatSetpointStatus;
	private String name;

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public TemperatureStatus getTemperatureStatus() {
		return temperatureStatus;
	}

	public void setTemperatureStatus(TemperatureStatus temperatureStatus) {
		this.temperatureStatus = temperatureStatus;
	}

	public List<String> getActiveFaults() {
		return activeFaults;
	}

	public void setActiveFaults(List<String> activeFaults) {
		this.activeFaults = activeFaults;
	}

	public SetPointStatus getHeatSetpointStatus() {
		return heatSetpointStatus;
	}

	public void setHeatSetpointStatus(SetPointStatus heatSetpointStatus) {
		this.heatSetpointStatus = heatSetpointStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
