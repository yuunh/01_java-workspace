package com.kh.practice1.func;

import java.util.Scanner;

public class Variablepractice4 {

	public void inputTest4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String message = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + message.charAt(0));
		System.out.println("두 번째 문자 : " + message.charAt(1));
		System.out.println("세 번째 문자 : " + message.charAt(2));
		
		
		sc.close();
	}
}
