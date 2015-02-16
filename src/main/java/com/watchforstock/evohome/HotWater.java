package com.watchforstock.evohome;

public class HotWater {

	private String dhwId;
	private DHWStateCapabilities dhwStateCapabilitiesResponse;
	private ScheduleCapabilities scheduleCapabilitiesResponse;

	public String getDhwId() {
		return dhwId;
	}

	public void setDhwId(String dhwId) {
		this.dhwId = dhwId;
	}

	public DHWStateCapabilities getDhwStateCapabilitiesResponse() {
		return dhwStateCapabilitiesResponse;
	}

	public void setDhwStateCapabilitiesResponse(
			DHWStateCapabilities dhwStateCapabilitiesResponse) {
		this.dhwStateCapabilitiesResponse = dhwStateCapabilitiesResponse;
	}

	public ScheduleCapabilities getScheduleCapabilitiesResponse() {
		return scheduleCapabilitiesResponse;
	}

	public void setScheduleCapabilitiesResponse(
			ScheduleCapabilities scheduleCapabilitiesResponse) {
		this.scheduleCapabilitiesResponse = scheduleCapabilitiesResponse;
	}

}
