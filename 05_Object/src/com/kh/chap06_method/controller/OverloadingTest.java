package com.kh.chap06_method.controller;

public class OverloadingTest {

	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 것
	
	public void test() {
		System.out.println("안유진");
	}
	
	/*
	public void test() {
		System.out.println("김다미");
	}
	*/
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	/*
	public void test(int c, String d) {
		
	}
	오버로딩이 가능하려면 매개변수명이 아니라
	매개변수의 개수와 순서가 다르게 작성되어야함.
	*/
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	public void test(String str) {
		
	}
	
	/*
	public int test(String str) {
		
	}
	반환형이랑도 상관없음
	무조건 매개변수가 달라야 한다!
	*/
	
	/*
	private void test(String str) {
		
	}
	접근제한자랑도 상관없음
	무조건 매개변수가 달라야 한다
	*/
	
	/*
	 * * 결론
	 * 오버로딩 : 한 클래스 내에 동일한 이름의 메소드들
	 * 			단, 매개변수명, 접근제한자, 반환형을 다 떠나서
	 * 			** 매개변수의 자료형과 개수, 순서가 다르게 작성돼있어야함 **
	 * 			단, return 값은 같아도 된다
	 */
	
}
