package com.watchforstock.evohome;

import java.util.List;

public class DHWStateCapabilities {
	private List<String> allowedStates;
	private List<String> allowedModes;
	private String maxDuration;
	private String timingResolution;

	public List<String> getAllowedStates() {
		return allowedStates;
	}

	public void setAllowedStates(List<String> allowedStates) {
		this.allowedStates = allowedStates;
	}

	public List<String> getAllowedModes() {
		return allowedModes;
	}

	public void setAllowedModes(List<String> allowedModes) {
		this.allowedModes = allowedModes;
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
