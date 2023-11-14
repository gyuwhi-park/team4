package com.team4.domain;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class ProductVO {
	private	String product_idx;
	private String product_name;
	private int product_price;
	private int product_count;
	private int product_option;
	private String brand_idx;
	private String div3_idx;
	private String brand_name;
	private List<String> product_colorList;
	private List<String> product_sizeList;
	
	
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
	public int getProduct_option() {
		return product_option;
	}
	public void setProduct_option(int product_option) {
		this.product_option = product_option;
	}
	public String getBrand_idx() {
		return brand_idx;
	}
	public void setBrand_idx(String brand_idx) {
		this.brand_idx = brand_idx;
	}
	public String getDiv3_idx() {
		return div3_idx;
	}
	public void setDiv3_idx(String div3_idx) {
		this.div3_idx = div3_idx;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public List<String> getProduct_colorList() {
		return product_colorList;
	}
	public void setProduct_colorList(List<String> product_colorList) {
		this.product_colorList = product_colorList;
	}
	public List<String> getProduct_sizeList() {
		return product_sizeList;
	}
	public void setProduct_sizeList(List<String> product_sizeList) {
		this.product_sizeList = product_sizeList;
	}
	
	@Override
	public String toString() {
		return "ProductVO [product_idx=" + product_idx + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_count=" + product_count + ", product_option=" + product_option
				+ ", brand_idx=" + brand_idx + ", div3_idx=" + div3_idx + ", brand_name=" + brand_name
				+ ", product_colorList=" + product_colorList + ", product_sizeList=" + product_sizeList + "]";
	}
}