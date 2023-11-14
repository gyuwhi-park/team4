package com.team4.domain;

public class PurchaseVO {
	private int purchase_idx;
	private int purchase_number;
	private String purchase_date;
	private int purchase_count;
	private int purchase_option;
	private int purchase_price;
	private String purchase_state;
	private int user_idx;
	private String product_idx;
	private String color_name;
	private String size_val;
	private int addr_idx;
	private String user_name;
	private String user_phone;
	private String product_name;
	
	private String addr_addr;

	public int getPurchase_idx() {
		return purchase_idx;
	}

	public void setPurchase_idx(int purchase_idx) {
		this.purchase_idx = purchase_idx;
	}

	public int getPurchase_number() {
		return purchase_number;
	}

	public void setPurchase_number(int purchase_number) {
		this.purchase_number = purchase_number;
	}

	public String getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}

	public int getPurchase_count() {
		return purchase_count;
	}

	public void setPurchase_count(int purchase_count) {
		this.purchase_count = purchase_count;
	}

	public int getPurchase_option() {
		return purchase_option;
	}

	public void setPurchase_option(int purchase_option) {
		this.purchase_option = purchase_option;
	}

	public int getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(int purchase_price) {
		this.purchase_price = purchase_price;
	}

	public String getPurchase_state() {
		return purchase_state;
	}

	public void setPurchase_state(String purchase_state) {
		this.purchase_state = purchase_state;
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

	public String getColor_name() {
		return color_name;
	}

	public void setColor_name(String color_name) {
		this.color_name = color_name;
	}

	public String getSize_val() {
		return size_val;
	}

	public void setSize_val(String size_val) {
		this.size_val = size_val;
	}

	public int getAddr_idx() {
		return addr_idx;
	}

	public void setAddr_idx(int addr_idx) {
		this.addr_idx = addr_idx;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getAddr_addr() {
		return addr_addr;
	}

	public void setAddr_addr(String addr_addr) {
		this.addr_addr = addr_addr;
	}

	@Override
	public String toString() {
		return "PurchaseVO [purchase_idx=" + purchase_idx + ", purchase_number=" + purchase_number + ", purchase_date="
				+ purchase_date + ", purchase_count=" + purchase_count + ", purchase_option=" + purchase_option
				+ ", purchase_price=" + purchase_price + ", purchase_state=" + purchase_state + ", user_idx=" + user_idx
				+ ", product_idx=" + product_idx + ", color_name=" + color_name + ", size_val=" + size_val
				+ ", addr_idx=" + addr_idx + ", user_name=" + user_name + ", user_phone=" + user_phone
				+ ", product_name=" + product_name + ", addr_addr=" + addr_addr + "]";
	}


}
