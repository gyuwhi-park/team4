package com.team4.domain;

public class Div3VO {
	private String div1_idx;
	private String div1_name;
	
	private String div2_idx;
	private String div2_name;
	
	private String div3_idx;
	private String div3_name;
	
	
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
	public String getDiv2_name() {
		return div2_name;
	}
	public void setDiv2_name(String div2_name) {
		this.div2_name = div2_name;
	}
	public String getDiv2_idx() {
		return div2_idx;
	}
	public void setDiv2_idx(String div2_idx) {
		this.div2_idx = div2_idx;
	}
	public String getDiv3_idx() {
		return div3_idx;
	}
	public void setDiv3_idx(String div3_idx) {
		this.div3_idx = div3_idx;
	}
	public String getDiv3_name() {
		return div3_name;
	}
	public void setDiv3_name(String div3_name) {
		this.div3_name = div3_name;
	}
	@Override
	public String toString() {
		return "Div3VO [div1_idx=" + div1_idx + ", div1_name=" + div1_name + ", div2_idx=" + div2_idx + ", div2_name="
				+ div2_name + ", div3_idx=" + div3_idx + ", div3_name=" + div3_name + "]";
	}
		
}
