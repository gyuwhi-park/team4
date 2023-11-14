package com.team4.domain;

public class MarkVO {
	private int mark_idx;
	private int user_idx;
	private String product_idx;
	private String product_name;
	private int product_price;
	private int product_count;
	private String c;
	
	private String brand_idx;
	private String brand_name;
	
	public int getMark_idx() {
		return mark_idx;
	}
	public void setMark_idx(int mark_idx) {
		this.mark_idx = mark_idx;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getProduct_idx() {
		return product_idx;
	}
	public void setProduct_idx(String product_idx) {
		this.product_idx = product_idx;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getBrand_idx() {
		return brand_idx;
	}
	public void setBrand_idx(String brand_idx) {
		this.brand_idx = brand_idx;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	@Override
	public String toString() {
		return "MarkVO [mark_idx=" + mark_idx + ", user_idx=" + user_idx + ", product_idx=" + product_idx
				+ ", product_name=" + product_name + ", product_price=" + product_price + ", product_count="
				+ product_count + ", c=" + c + ", brand_idx=" + brand_idx + ", brand_name=" + brand_name + "]";
	}
	

	
}
