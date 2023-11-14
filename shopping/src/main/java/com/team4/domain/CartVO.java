package com.team4.domain;

public class CartVO {
   private int cart_idx;
   private int cart_count;
   private String product_idx;
   private String product_name;
   private int product_price;
   
   private int user_idx;
   
   private int color_idx;
   private String color_name;
   
   private int size_idx;
   private String size_val;
   
   public int getCart_idx() {
      return cart_idx;
   }
   public void setCart_idx(int cart_idx) {
      this.cart_idx = cart_idx;
   }
   public int getCart_count() {
      return cart_count;
   }
   public void setCart_count(int cart_count) {
      this.cart_count = cart_count;
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
   public int getUser_idx() {
      return user_idx;
   }
   public void setUser_idx(int user_idx) {
      this.user_idx = user_idx;
   }
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
   @Override
   public String toString() {
      return "CartVO [cart_idx=" + cart_idx + ", cart_count=" + cart_count + ", product_idx=" + product_idx
            + ", product_name=" + product_name + ", product_price=" + product_price + ", user_idx=" + user_idx
            + ", color_idx=" + color_idx + ", color_name=" + color_name + ", size_idx=" + size_idx + ", size_val="
            + size_val + "]";
   }
   
   
}