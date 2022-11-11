package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Mother extends Person {

	private String babyBirth; // 아이의 탄생 출산 | 입양 | 업음
	
	public Mother() {}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother [" + super.toString() + ", babyBirth=" + babyBirth + "]";
	}

	@Override
	public void eat() {
		// 밥 먹으면 몸무게 10 증가
		super.setWeight(super.getWeight() + 10);
		// 밥 먹으면 건강도 10 감소
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 20 증가
		super.setHealth(super.getHealth() + 20);
	}
	
}
