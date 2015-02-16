package com.watchforstock.evohome;

public class LocationInfo {
	private String locationId;
	private String name;
	private String streetAddress;
	private String city;
	private String country;
	private String postcode;
	private String locationType;
	private boolean useDaylightSaveSwitching;
	private TimeZone timeZone;
	private LocationOwner locationOwner;

	public LocationOwner getLocationOwner() {
		return locationOwner;
	}

	public void setLocationOwner(LocationOwner locationOwner) {
		this.locationOwner = locationOwner;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public boolean isUseDaylightSaveSwitching() {
		return useDaylightSaveSwitching;
	}

	public void setUseDaylightSaveSwitching(boolean useDaylightSaveSwitching) {
		this.useDaylightSaveSwitching = useDaylightSaveSwitching;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

}
