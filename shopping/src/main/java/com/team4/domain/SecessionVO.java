package com.team4.domain;

public class SecessionVO {
	private int secession_idx;
	private String secession_txt;
	private int user_idx;
	
	public int getSecession_idx() {
		return secession_idx;
	}
	public void setSecession_idx(int secession_idx) {
		this.secession_idx = secession_idx;
	}
	public String getSecession_txt() {
		return secession_txt;
	}
	public void setSecession_txt(String secession_txt) {
		this.secession_txt = secession_txt;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	@Override
	public String toString() {
		return "SecessionVO [secession_idx=" + secession_idx + ", secession_txt=" + secession_txt + ", user_idx="
				+ user_idx + "]";
	}
}
