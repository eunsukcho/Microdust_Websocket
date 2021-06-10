package com.microdust.socket.vo;

public class AircleanerStatusVo {

	int powerStatus;
	int activeMode;
	int personExist;
	
	public AircleanerStatusVo() {}
	public AircleanerStatusVo(int powerStatus, int activeMode, int personExist) {
		this.powerStatus = powerStatus;
		this.activeMode = activeMode;
		this.personExist = personExist;
	}
	
	public int getPowerStatus() {
		return powerStatus;
	}
	public void setPowerStatus(int powerStatus) {
		this.powerStatus = powerStatus;
	}
	public int getActiveMode() {
		return activeMode;
	}
	public void setActiveMode(int activeMode) {
		this.activeMode = activeMode;
	}
	public int getPersonExist() {
		return personExist;
	}
	public void setPersonExist(int personExist) {
		this.personExist = personExist;
	}
	
	
}
