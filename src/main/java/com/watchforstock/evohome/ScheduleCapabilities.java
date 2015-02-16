package com.watchforstock.evohome;

public class ScheduleCapabilities {
	private int maxSwitchpointsPerDay;
	private int minSwitchpointsPerDay;
	private String timingResolution;
	private float setpointValueResolution;

	public int getMaxSwitchpointsPerDay() {
		return maxSwitchpointsPerDay;
	}

	public void setMaxSwitchpointsPerDay(int maxSwitchpointsPerDay) {
		this.maxSwitchpointsPerDay = maxSwitchpointsPerDay;
	}

	public int getMinSwitchpointsPerDay() {
		return minSwitchpointsPerDay;
	}

	public void setMinSwitchpointsPerDay(int minSwitchpointsPerDay) {
		this.minSwitchpointsPerDay = minSwitchpointsPerDay;
	}

	public String getTimingResolution() {
		return timingResolution;
	}

	public void setTimingResolution(String timingResolution) {
		this.timingResolution = timingResolution;
	}

	public float getSetpointValueResolution() {
		return setpointValueResolution;
	}

	public void setSetpointValueResolution(float setpointValueResolution) {
		this.setpointValueResolution = setpointValueResolution;
	}

}
