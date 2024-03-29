package com.kh.chap03_class.model.vo;

public class Person {

	// 필드 선언
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;

	public Person() {
		System.out.println("Person 객체가 생성됐습니다.");
	}
	
	public Person(String name, String pwd, int age, String phone) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.phone = phone;
	}
	
	public Person(String id, String pwd, String name, int age, char gender, String phone, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}

	// setter 만들기 => 7개
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getter 만들기 => 7개
	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
	
	public String information() {
		
		return "아이디 : " + id + ", 비밀번호 : " + pwd + ", 이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 전화번호 : " + phone + ", 이메일 : " + email;
	}
}
