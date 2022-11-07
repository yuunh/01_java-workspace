package com.hw1.model.vo;

public class Product {

	private String productld;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	
	public Product() {}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productld = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	
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
}
