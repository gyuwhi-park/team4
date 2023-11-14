package com.team4.domain;

public class ImageVO {
	private int image_idx;
	private String image_name;
	private String image_path;
	private String product_idx;
	
	
	public int getImage_idx() {
		return image_idx;
	}
	public void setImage_idx(int image_idx) {
		this.image_idx = image_idx;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public String getProduct_idx() {
		return product_idx;
	}
	public void setProduct_idx(String product_idx) {
		this.product_idx = product_idx;
	}
	@Override
	public String toString() {
		return "ImageVO [image_idx=" + image_idx + ", image_name=" + image_name + ", image_path=" + image_path
				+ ", product_idx=" + product_idx + "]";
	}
	
}
