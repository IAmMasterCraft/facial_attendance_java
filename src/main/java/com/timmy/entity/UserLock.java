package com.timmy.entity;

public class UserLock {

	private int enrollId;
	private int weekZone;
	private int group;
	
	private String deviceSn;
	
	
	public int getEnrollId() {
		return enrollId;
	}
	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
	}
	public int getWeekZone() {
		return weekZone;
	}
	public void setWeekZone(int weekZone) {
		this.weekZone = weekZone;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public String getDeviceSn() {
		return deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
	@Override
	public String toString() {
		return "UserLock [enrollId=" + enrollId + ", weekZone=" + weekZone + ", group=" + group + ", deviceSn="
				+ deviceSn + "]";
	}
	
	
	
}
