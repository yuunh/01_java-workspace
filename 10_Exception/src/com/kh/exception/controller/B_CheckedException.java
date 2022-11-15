package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	/*
	 * CheckedException은 **반드시** 예외처리를 해야되는 예외들임
	 * => 조건문 미리 제시할 수 없음(왜? 예측이 불가한 곳에서 문제가 발생하기 때문이 미리 예외처리 구문을 작성해놓아야함)
	 * => 외부 매개체와 입출력이 일어날 때 발생! (IOException)
	 */

	public void method1() { // 여기서도 떠넘길 수 있음 => 끝까지 떠넘기면 JVM이 처리 : 권장X
	
		// method2();
		
		try {
			method2();
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
		}
	}

	public void method2() throws IOException {
		
		// Scanner와 같이 키보드로 입력받을 수 있는 객체
		// 스캐너 이전의 방식 => 정수, 실수 안됨 무조건 문자만 받을 수 있음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력해주세요 : ");
		
		// 1. try~catch문 : 여기 이 자리에서 곧바로 예외를 처리하겠다.
		// try{} : 예외가 발생할 가능성이 있는 코드를 작성
		// catch(발생될예외클래스 매개변수){} : try 구문 내에서 예외가 발생했을 경우 어떻게 처리한건지에 대한 내용 작성
		
		// String str = br.readLine(); // 컴파일 에러
		 /*
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		} 
		*/
		
		// 2. throws : 지금 이 자리에서 예외를 처리하지 않고 현재 이 메소드를 호출하는 곳으로 예외처리 떠넘기겠다.(위임)
		
		String str = br.readLine();
	}
	
	/*
	 * 							예외클래스			예외발생시점		예외처리
	 * UnCheckedException	RuntimeException	런타임에러			선택(개발자가 케바케로 처리 => if문을 통해 애초에 예외가 발생안되도록 / 예외처리구문)
	 *   CheckedException	RuntimeException외	컴파일에러(빨간줄)	필수(조건문 안됨! 무조건 예외처리 구문으로)
	 */
	
}
