package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	// 메인
	public void mainMenu() {

		while (true) {
			System.out.println("1. 지정문자열");
			System.out.println("2. 입력문자열");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴번호:");
			int num = sc.nextInt();
			sc.nextLine();

			if (num == 1) {
				tokenMenu();
			} else if (num == 2) {
				inputMenu();
			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
		}
	}

	public void tokenMenu() {
		
		String str = "J a v a P r o g r a m ";

		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());

		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		tc.afterToken(str);
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력

		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
		System.out.println("토큰 처리 후 개수 : " + tc.afterToken(str).length());
		System.out.println("모두 대문자로 변환 : " + tc.afterToken(str).toUpperCase());
	}

	public void inputMenu() {

		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();

		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		String str = tc.firstCap(input);
		System.out.println(str);

		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		System.out.println(one + " 문자가 들어간 개수: " + tc.findChar(input, one));

	}

}
