package com.watchforstock.evohome;

import java.util.List;

public class SetPointCapabilities {
	private float maxHeatSetpoint;
	private float minHeatSetpoint;
	private float valueResolution;
	private List<String> allowedSetpointModes;
	private String maxDuration;
	private String timingResolution;

	public float getMaxHeatSetpoint() {
		return maxHeatSetpoint;
	}

	public void setMaxHeatSetpoint(float maxHeatSetpoint) {
		this.maxHeatSetpoint = maxHeatSetpoint;
	}

	public float getMinHeatSetpoint() {
		return minHeatSetpoint;
	}

	public void setMinHeatSetpoint(float minHeatSetpoint) {
		this.minHeatSetpoint = minHeatSetpoint;
	}

	public float getValueResolution() {
		return valueResolution;
	}

	public void setValueResolution(float valueResolution) {
		this.valueResolution = valueResolution;
	}

	public List<String> getAllowedSetpointModes() {
		return allowedSetpointModes;
	}

	public void setAllowedSetpointModes(List<String> allowedSetpointModes) {
		this.allowedSetpointModes = allowedSetpointModes;
	}

	public String getMaxDuration() {
		return maxDuration;
	}

	public void setMaxDuration(String maxDuration) {
		this.maxDuration = maxDuration;
	}

	public String getTimingResolution() {
		return timingResolution;
	}

	public void setTimingResolution(String timingResolution) {
		this.timingResolution = timingResolution;
	}

}
