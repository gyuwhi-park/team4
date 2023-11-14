package com.team4.domain;

public class SearchVO {
	private int search_idx;
	private String search_time;
	private String search_content;
	private int user_idx;
	
	public int getSearch_idx() {
		return search_idx;
	}
	public void setSearch_idx(int search_idx) {
		this.search_idx = search_idx;
	}
	public String getSearch_time() {
		return search_time;
	}
	public void setSearch_time(String search_time) {
		this.search_time = search_time;
	}
	public String getSearch_content() {
		return search_content;
	}
	public void setSearch_content(String search_content) {
		this.search_content = search_content;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	@Override
	public String toString() {
		return "SearchVO [search_idx=" + search_idx + ", search_time=" + search_time + ", search_content="
				+ search_content + ", user_idx=" + user_idx + "]";
	}
	
	
}
