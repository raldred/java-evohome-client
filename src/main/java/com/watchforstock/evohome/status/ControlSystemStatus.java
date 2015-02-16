package com.watchforstock.evohome.status;

import java.util.List;

public class ControlSystemStatus {
	private String systemId;
	private List<ZoneStatus> zones;
	private DHWStatus dhw;
	private List<String> activeFaults;
	private SystemModeStatus systemModeStatus;

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public List<ZoneStatus> getZones() {
		return zones;
	}

	public void setZones(List<ZoneStatus> zones) {
		this.zones = zones;
	}

	public DHWStatus getDhw() {
		return dhw;
	}

	public void setDhw(DHWStatus dhw) {
		this.dhw = dhw;
	}

	public List<String> getActiveFaults() {
		return activeFaults;
	}

	public void setActiveFaults(List<String> activeFaults) {
		this.activeFaults = activeFaults;
	}

	public SystemModeStatus getSystemModeStatus() {
		return systemModeStatus;
	}

	public void setSystemModeStatus(SystemModeStatus systemModeStatus) {
		this.systemModeStatus = systemModeStatus;
	}

}
