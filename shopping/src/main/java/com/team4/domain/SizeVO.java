package com.team4.domain;

public class SizeVO {
	private int size_idx;
	private String size_val;
	private String product_idx;
	
	public int getSize_idx() {
		return size_idx;
	}
	public void setSize_idx(int size_idx) {
		this.size_idx = size_idx;
	}
	public String getSize_val() {
		return size_val;
	}
	public void setSize_val(String size_val) {
		this.size_val = size_val;
	}
	public String getProduct_idx() {
		return product_idx;
	}
	public void setProduct_idx(String product_idx) {
		this.product_idx = product_idx;
	}
	
	@Override
	public String toString() {
		return "SizeVO [size_idx=" + size_idx + ", size_val=" + size_val + ", product_idx=" + product_idx + "]";
	}
	
}
