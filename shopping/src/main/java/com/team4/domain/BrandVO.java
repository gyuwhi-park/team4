package com.team4.domain;

public class BrandVO {
	private String brand_idx;
	private String brand_name;
	
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
		return "BrandVO [brand_idx=" + brand_idx + ", brand_name=" + brand_name + "]";
	}
	
	
}
