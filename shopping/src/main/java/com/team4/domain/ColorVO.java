package com.team4.domain;

public class ColorVO {
	private int color_idx;
	private String color_name;
	private String product_idx;
	
	public int getColor_idx() {
		return color_idx;
	}
	public void setColor_idx(int color_idx) {
		this.color_idx = color_idx;
	}
	public String getColor_name() {
		return color_name;
	}
	public void setColor_name(String color_name) {
		this.color_name = color_name;
	}
	public String getProduct_idx() {
		return product_idx;
	}
	public void setProduct_idx(String product_idx) {
		this.product_idx = product_idx;
	}
	
	@Override
	public String toString() {
		return "ColorVO [color_idx=" + color_idx + ", color_name=" + color_name + ", product_idx=" + product_idx + "]";
	}
	

}
