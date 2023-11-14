package com.team4.domain;

public class UserVO {
	private	int user_idx;
	private String user_name;
	private String user_phone;
	private String user_birth;
	
	private String user_id;
	private String user_pass;
	private String user_mail;
	private String user_gender;
	
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	@Override
	public String toString() {
		return "UserVO [user_idx=" + user_idx + ", user_name=" + user_name + ", user_phone=" + user_phone
				+ ", user_birth=" + user_birth + ", user_id=" + user_id + ", user_pass=" + user_pass + ", user_mail="
				+ user_mail + ", user_gender=" + user_gender + "]";
	}


	
}
