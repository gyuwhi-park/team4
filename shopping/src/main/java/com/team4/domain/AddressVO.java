package com.team4.domain;

public class AddressVO {
	private int addr_idx;
	private String addr_addr;
	private String addr_post;
	private int user_idx;
	
	public int getAddr_idx() {
		return addr_idx;
	}
	public void setAddr_idx(int addr_idx) {
		this.addr_idx = addr_idx;
	}
	public String getAddr_addr() {
		return addr_addr;
	}
	public void setAddr_addr(String addr_addr) {
		this.addr_addr = addr_addr;
	}
	public String getAddr_post() {
		return addr_post;
	}
	public void setAddr_post(String addr_post) {
		this.addr_post = addr_post;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	@Override
	public String toString() {
		return "AddressVO [addr_idx=" + addr_idx + ", addr_addr=" + addr_addr + ", addr_post=" + addr_post
				+ ", user_idx=" + user_idx + "]";
	}
	
	
}
