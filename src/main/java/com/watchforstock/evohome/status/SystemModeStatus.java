package com.watchforstock.evohome.status;

public class SystemModeStatus {
	private String mode;
	private String timeUntil;
	private boolean isPermanent;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getTimeUntil() {
		return timeUntil;
	}

	public void setTimeUntil(String timeUntil) {
		this.timeUntil = timeUntil;
	}

	public boolean getIsPermanent() {
		return isPermanent;
	}

	public void setIsPermanent(boolean isPermanant) {
		this.isPermanent = isPermanant;
	}

}
