package com.watchforstock.evohome.status;

public class SetPointStatus {
	private float targetTemperature;
	private String setpointMode;

	public float getTargetTemperature() {
		return targetTemperature;
	}

	public void setTargetTemperature(float targetTemperature) {
		this.targetTemperature = targetTemperature;
	}

	public String getSetpointMode() {
		return setpointMode;
	}

	public void setSetpointMode(String setpointMode) {
		this.setpointMode = setpointMode;
	}

}
