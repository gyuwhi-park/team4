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
	private String div1_idx;
	private String div1_name;
	private String div2_idx;
	private String div2_name;
	private String div3_name;
	private String div3_idx;
	private String brand_name;
	
	
	public String getDiv2_name() {
		return div2_name;
	}
	public void setDiv2_name(String div2_name) {
		this.div2_name = div2_name;
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
	public String getDiv1_idx() {
		return div1_idx;
	}
	public void setDiv1_idx(String div1_idx) {
		this.div1_idx = div1_idx;
	}
	public String getDiv1_name() {
		return div1_name;
	}
	public void setDiv1_name(String div1_name) {
		this.div1_name = div1_name;
	}
	public String getDiv2_idx() {
		return div2_idx;
	}
	public void setDiv2_idx(String div2_idx) {
		this.div2_idx = div2_idx;
	}
	public String getDiv3_name() {
		return div3_name;
	}
	public void setDiv3_name(String div3_name) {
		this.div3_name = div3_name;
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
	@Override
	public String toString() {
		return "ProductVO [product_idx=" + product_idx + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_count=" + product_count + ", product_option=" + product_option
				+ ", brand_idx=" + brand_idx + ", div1_idx=" + div1_idx + ", div1_name=" + div1_name + ", div2_idx="
				+ div2_idx + ", div3_name=" + div3_name + ", div3_idx=" + div3_idx + ", brand_name=" + brand_name + "]";
	}
	
}