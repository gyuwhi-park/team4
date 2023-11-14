package com.team4.domain;

public class VisitorVO {
	private int visitor_idx;
	private String visit_date;
	private int visit_count;
	private String product_idx;
	
	public int getVisitor_idx() {
		return visitor_idx;
	}
	public void setVisitor_idx(int visitor_idx) {
		this.visitor_idx = visitor_idx;
	}
	public String getVisit_date() {
		return visit_date;
	}
	public void setVisit_date(String visit_date) {
		this.visit_date = visit_date;
	}
	public int getVisit_count() {
		return visit_count;
	}
	public void setVisit_count(int visit_count) {
		this.visit_count = visit_count;
	}
	public String getProduct_idx() {
		return product_idx;
	}
	public void setProduct_idx(String product_idx) {
		this.product_idx = product_idx;
	}
	
	@Override
	public String toString() {
		return "VisitorVO [visitor_idx=" + visitor_idx + ", visit_date=" + visit_date + ", visit_count=" + visit_count
				+ ", product_idx=" + product_idx + "]";
	}
	
}
