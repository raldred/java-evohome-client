package com.watchforstock.evohome;

public class SystemMode {

	private String systemMode;
	private boolean canBePermanent;
	private boolean canBeTemporary;
	private String maxDuration;
	private String timingResolution;
	private String timingMode;

	public String getSystemMode() {
		return systemMode;
	}

	public void setSystemMode(String systemMode) {
		this.systemMode = systemMode;
	}

	public boolean isCanBePermanent() {
		return canBePermanent;
	}

	public void setCanBePermanent(boolean canBePermanent) {
		this.canBePermanent = canBePermanent;
	}

	public boolean isCanBeTemporary() {
		return canBeTemporary;
	}

	public void setCanBeTemporary(boolean canBeTemporary) {
		this.canBeTemporary = canBeTemporary;
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

	public String getTimingMode() {
		return timingMode;
	}

	public void setTimingMode(String timingMode) {
		this.timingMode = timingMode;
	}

}
