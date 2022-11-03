package com.kh.product.model.vo;

public class Product {

	// 필드부 선언
	private String pName;
	private int price;
	private String brand;
	
	// setter 메소드
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// getter 메소드
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
}
