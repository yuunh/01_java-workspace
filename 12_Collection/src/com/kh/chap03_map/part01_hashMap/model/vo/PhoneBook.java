package com.kh.chap03_map.part01_hashMap.model.vo;

public class PhoneBook {

	private String name;
	private String numBer;
	private String group;
	
	public PhoneBook() {}

	public PhoneBook(String name, String numBer, String group) {
		super();
		this.name = name;
		this.numBer = numBer;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumBer() {
		return numBer;
	}

	public void setNumBer(String numBer) {
		this.numBer = numBer;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", numBer=" + numBer + ", group=" + group + "]";
	}
	
	
}
