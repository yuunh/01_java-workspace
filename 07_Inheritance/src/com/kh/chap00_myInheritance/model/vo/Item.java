package com.kh.chap00_myInheritance.model.vo;

public class Item {

	private String name;
	private int price;
	private int upc;
	private String publisher;

	public Item() {}

	public Item(String name, int price, int upc, String publisher) {
		this.name = name;
		this.price = price;
		this.upc = upc;
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUpc() {
		return upc;
	}

	public void setUpc(int upc) {
		this.upc = upc;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String information() {
		return "제목: " + name + ", 가격: " + price + ", No. " + upc + ", 제작사: " + publisher;
	}

}
