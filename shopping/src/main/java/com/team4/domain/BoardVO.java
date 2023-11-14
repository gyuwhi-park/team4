package com.team4.domain;

public class BoardVO {
	private int board_idx;
	private String board_type;
	private String board_title;
	private String board_content;
	private String board_pass;
	private String board_date;
	private int board_option;
	private int user_idx;
	
	
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}

	public int getBoard_idx() {
		return board_idx;
	}
	
	public String getBoard_type() {
		return board_type;
	}
	public void setBoard_type(String board_type) {
		this.board_type = board_type;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_pass() {
		return board_pass;
	}
	public void setBoard_pass(String board_pass) {
		this.board_pass = board_pass;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public int getBoard_option() {
		return board_option;
	}
	public void setBoard_option(int board_option) {
		this.board_option = board_option;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	@Override
	public String toString() {
		return "BoardVO [board_idx=" + board_idx + ", board_type=" + board_type + ", board_title=" + board_title
				+ ", board_content=" + board_content + ", board_pass=" + board_pass + ", board_date=" + board_date
				+ ", board_option=" + board_option + ", user_idx=" + user_idx + "]";
	}
	
	
}
