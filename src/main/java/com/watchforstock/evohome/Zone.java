package com.watchforstock.evohome;

import com.watchforstock.evohome.status.ZoneStatus;

public class Zone {
	private String zoneId;
	private String modelType;
	private SetPointCapabilities heatSetpointCapabilities;
	private ScheduleCapabilities scheduleCapabilities;
	private String name;
	private String zoneType;
	private ZoneStatus zoneStatus;

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public SetPointCapabilities getHeatSetpointCapabilities() {
		return heatSetpointCapabilities;
	}

	public void setHeatSetpointCapabilities(
			SetPointCapabilities heatSetpointCapabilities) {
		this.heatSetpointCapabilities = heatSetpointCapabilities;
	}

	public ScheduleCapabilities getScheduleCapabilities() {
		return scheduleCapabilities;
	}

	public void setScheduleCapabilities(
			ScheduleCapabilities scheduleCapabilities) {
		this.scheduleCapabilities = scheduleCapabilities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZoneType() {
		return zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}

	public ZoneStatus getZoneStatus() {
		return zoneStatus;
	}

	public void setZoneStatus(ZoneStatus zoneStatus) {
		this.zoneStatus = zoneStatus;
	}

}
