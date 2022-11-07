package com.kh.chap06_method.controller;

public class NonStaticMethod {

	/*
	 * * 메소드
	 * 한 기능을 처리하기 위한 용도
	 * 
	 * 패키지명 : 소문자로 시작
	 * 클래스명 : 대문자로 시작
	 * 변수명 : 소문자로 시작
	 * 메소드명 : 소문자로 시작
	 * 
	 * 공통 : 낙타표기법(camel case)
	 * 
	 * 접근제한자 반환형(반환할 값의 자료형) 메소드명([매개변수1, 매개변수2, ....]) {
	 * 		수행내용;
	 * 		[return 결과값;] void일때 빼고
	 * }
	 */
	
	// 1. 매개변수 없고 반환값도 없는 메소드 : (), return X, void
	public void method1() {
		// return 0; => 반환할 값 없어야 한다
		System.out.println("매개변수와 반환값이 둘다 없는 메소드입니다.");
	}
	
	// 2. 매개변수 없고 반환값은 있는 메소드
	public String method2() {
		System.out.println("매개변수는 없고 반환값은 있는 메소드입니다.");
		return "집보내줘";
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드입니다.");
		if (num2 != 0) {
			System.out.println("num1 / num2 : " + num1 / num2);
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	// 문자열과 정수값을 전달받아서 해당 문자열의 해당 정수인덱스의 문자값을 뽑아서 반환
	// apple 전달받아서 2번 인덱스 뽑아줘 하면 p가 나와야함
	public char method4(String str, int index) {
		System.out.println("매개변수와 반환값 둘 다 있는 메소드입니다.");
		/*
		if (index < str.length() && index >= 0) {
			return str.charAt(index);
		} else {
			return ' ';
		}
		*/
		return str.charAt(index);
	}
}
