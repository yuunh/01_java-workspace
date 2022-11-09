package com.kh.chap00_myInheritance.model.vo;

public class Movie extends Item {

	private String director;
	
	public Movie() {}
	
	public Movie(String name, int price, int upc, String publisher, String director) {
		super(name, price, upc, publisher);
		this.director = director;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String information() {
		return super.information() + ", 감독: " + director;
	}
	
	
}
