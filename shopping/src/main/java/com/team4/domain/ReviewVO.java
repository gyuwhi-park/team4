package com.team4.domain;

public class ReviewVO {
	private int review_idx;
	private int review_score;
	private String review_content;
	private String review_date;
	private String product_idx;
	private int user_idx;
	private String user_id;
	private String product_name;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getReview_idx() {
		return review_idx;
	}
	public void setReview_idx(int review_idx) {
		this.review_idx = review_idx;
	}
	public int getReview_score() {
		return review_score;
	}
	public void setReview_score(int review_score) {
		this.review_score = review_score;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public String getReview_date() {
		return review_date;
	}
	public void setReview_date(String review_date) {
		this.review_date = review_date;
	}
	public String getProduct_idx() {
		return product_idx;
	}
	public void setProduct_idx(String product_idx) {
		this.product_idx = product_idx;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	@Override
	public String toString() {
		return "ReviewVO [review_idx=" + review_idx + ", review_score=" + review_score + ", review_content="
				+ review_content + ", review_date=" + review_date + ", product_idx=" + product_idx + ", user_idx="
				+ user_idx + ", user_id=" + user_id + ", product_name=" + product_name + "]";
	}

	
	
}
