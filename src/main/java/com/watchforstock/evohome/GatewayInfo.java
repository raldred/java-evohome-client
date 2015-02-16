package com.watchforstock.evohome;

public class GatewayInfo {
	private String gatewayId;
	private String mac;
	private String crc;
	private boolean isWiFi;

	public String getGatewayId() {
		return gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getCrc() {
		return crc;
	}

	public void setCrc(String crc) {
		this.crc = crc;
	}

	public boolean getIsWiFi() {
		return isWiFi;
	}

	public void setIsWiFi(boolean isWifi) {
		this.isWiFi = isWifi;
	}

}
