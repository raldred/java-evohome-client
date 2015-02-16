package com.watchforstock.evohome;

import java.util.List;

import com.watchforstock.evohome.status.ControlSystemStatus;
import com.watchforstock.evohome.status.ZoneStatus;

public class TempControlSystem {
	private String systemId;
	private String modelType;
	private List<Zone> zones;
	private HotWater dhw;
	private List<SystemMode> allowedSystemModes;

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public HotWater getDhw() {
		return dhw;
	}

	public void setDhw(HotWater dhw) {
		this.dhw = dhw;
	}

	public List<SystemMode> getAllowedSystemModes() {
		return allowedSystemModes;
	}

	public void setAllowedSystemModes(List<SystemMode> allowedSystemModes) {
		this.allowedSystemModes = allowedSystemModes;
	}

	public void updateStatus(ControlSystemStatus tempStatus) {
		for (Zone zone : zones) {
			for (ZoneStatus status : tempStatus.getZones()) {
				if (zone.getZoneId().equals(status.getZoneId())) {
					zone.setZoneStatus(status);
				}
			}
		}

	}

}
