package com.kh.chap02_objctArray.model.vo;

public class Phone {

	// 이름, 브랜드명, 가격, 시리즈
	private String name;
	private String brand;
	private int price;
	private String serise;

	// 생성자
	public Phone() {
	}

	public Phone(String name, String brand, int price, String serise) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.serise = serise;
	}
	// getter - setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSerise() {
		return serise;
	}

	public void setSerise(String serise) {
		this.serise = serise;
	}

	// 모든 필드 한 문자열로 합친 후 반환시켜주는 information 메소드
	public String information() {
		return "Phone [name=" + name + ", brand=" + brand + ", price=" + price + ", serise=" + serise + "]";
	}

	
}
