package com.team4.domain;

public class AccessVO {
	private int access_idx;
	private String access_ip;
	private String access_date;
	private int access_count;
	private int user_idx;
	
	
	
	public int getAccess_count() {
		return access_count;
	}
	public void setAccess_count(int access_count) {
		this.access_count = access_count;
	}
	public int getAccess_idx() {
		return access_idx;
	}
	public void setAccess_idx(int access_idx) {
		this.access_idx = access_idx;
	}
	public String getAccess_ip() {
		return access_ip;
	}
	public void setAccess_ip(String access_ip) {
		this.access_ip = access_ip;
	}
	public String getAccess_date() {
		return access_date;
	}
	public void setAccess_date(String access_date) {
		this.access_date = access_date;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	@Override
	public String toString() {
		return "AccessVO [access_idx=" + access_idx + ", access_ip=" + access_ip + ", access_date=" + access_date
				+ ", access_count=" + access_count + ", user_idx=" + user_idx + "]";
	}
	
}
