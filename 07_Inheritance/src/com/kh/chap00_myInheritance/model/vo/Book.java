package com.kh.chap00_myInheritance.model.vo;

public class Book extends Item {

	private String author;
	
	public Book() {}
	
	public Book(String name, int price, int upc, String publisher, String author) {
		super(name, price, upc, publisher);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String information() {
		return super.information() + ", 작가: " + author;
	}
	
}
