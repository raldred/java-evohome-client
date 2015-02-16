package com.watchforstock.evohome;

public class TimeZone {
	private String timeZoneId;
	private String displayName;
	private int offsetMinutes;
	private int currentOffsetMinutes;
	private boolean supportsDaylightSaving;

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getOffsetMinutes() {
		return offsetMinutes;
	}

	public void setOffsetMinutes(int offsetMinutes) {
		this.offsetMinutes = offsetMinutes;
	}

	public int getCurrentOffsetMinutes() {
		return currentOffsetMinutes;
	}

	public void setCurrentOffsetMinutes(int currentOffsetMinutes) {
		this.currentOffsetMinutes = currentOffsetMinutes;
	}

	public boolean isSupportsDaylightSaving() {
		return supportsDaylightSaving;
	}

	public void setSupportsDaylightSaving(boolean supportsDaylightSaving) {
		this.supportsDaylightSaving = supportsDaylightSaving;
	}

}
