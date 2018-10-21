package com.unicom.engine_three.model;

public class UserInvoice {
	private String user_id;
	private String start_date;
	private String start_time;
	private int call_duration;
	private String jizhan;
	private String location;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public int getCall_duration() {
		return call_duration;
	}
	public void setCall_duration(int call_duration) {
		this.call_duration = call_duration;
	}
	public String getJizhan() {
		return jizhan;
	}
	public void setJizhan(String jizhan) {
		this.jizhan = jizhan;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
