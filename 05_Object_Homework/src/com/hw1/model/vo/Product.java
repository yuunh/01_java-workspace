package com.hw1.model.vo;

public class Product { // 클래스 시작

	// 필드부
	private String productld; // 상품아이디
	private String productName; // 상품명
	private String productArea; // 생산지
	private int price; // 가격
	private double tax; // 부가세비율
	
	// 생성자부
	// 기본생성자
	public Product() {}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productld = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	// 메소드부
	// getter setter
	
	public void setProductId(String productId) {
		this.productld = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	public String getProductId() {
		return productld;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getTax() {
		return tax;
	}
	
	
	public String information() {
		return productld + " " + productName + " " + productArea + " " + price + " " + tax;
	}
} // 클래스 끝
