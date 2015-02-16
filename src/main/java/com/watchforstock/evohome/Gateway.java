package com.watchforstock.evohome;

import java.util.List;

import com.watchforstock.evohome.status.ControlSystemStatus;
import com.watchforstock.evohome.status.GatewayStatus;

public class Gateway {
	private GatewayInfo gatewayInfo;
	private List<TempControlSystem> temperatureControlSystems;

	public GatewayInfo getGatewayInfo() {
		return gatewayInfo;
	}

	public void setGatewayInfo(GatewayInfo gatewayInfo) {
		this.gatewayInfo = gatewayInfo;
	}

	public List<TempControlSystem> getTemperatureControlSystems() {
		return temperatureControlSystems;
	}

	public void setTemperatureControlSystems(
			List<TempControlSystem> temperatureControlSystems) {
		this.temperatureControlSystems = temperatureControlSystems;
	}

	public void updateStatus(GatewayStatus status) {
		for (TempControlSystem system : temperatureControlSystems) {
			for (ControlSystemStatus tempStatus : status
					.getTemperatureControlSystems()) {
				if (system.getSystemId().equals(tempStatus.getSystemId())) {
					system.updateStatus(tempStatus);
				}
			}
		}
	}

}
