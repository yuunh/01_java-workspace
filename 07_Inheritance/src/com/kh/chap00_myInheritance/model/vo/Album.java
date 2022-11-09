package com.kh.chap00_myInheritance.model.vo;

public class Album extends Item {

	private String artist;
	
	public Album() {}
	
	public Album(String name, int price, int upc, String publisher, String artist) {
		super(name, price, upc, publisher);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String information() {
		return super.information() + ", 가수: " + artist ;
	}
	
	
}
