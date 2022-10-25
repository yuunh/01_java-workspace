package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * 삼항 연산자 (항목 3개를 가지고 연산해주는 연산자)
	 * 
	 * [표현법]
	 * (조건식) ? 조건식이 참일 경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과값
	 * 
	 * 이때, 조건식은 반드시 true false가 나오도록 작성해야됨!!
	 * 주로 비교, 논리 연산자를 통해 작성할거임
	 */
	
	public void method1() {
		
		// 입력 받은 정수 값이 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수 입니다." : "양수가 아닙니다.";
		
		// xx은(는) xxxx.
		System.out.println(num + "은(는) " + result);
		// System.out.println(num + "은(는) " + ((num > 0) ? "양수 입니다." : "양수가 아닙니다."));
		
	}
	
	public void method2() {
		
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		// String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		String result = (num % 2  == 1) ? "홀수입니다." : "짝수입니다";
		
		System.out.println(num + "은(는) " + result);
		
	}
	
	public void method3() {
		
		// 사용자에게 종료여부를 입력받아 판별해서 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력해주세용 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y') ? "프로그램을 종료합니당." : "계속 진행하겠습니당.";
		
		System.out.println(result);
		
	}
	
	public void method4() {

		// 입력받은 문자값이 영어 소문자인지 아닌지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'a' && ch <= 'z') ? "소문자입니다." : "소문자가 아닙니다." ;
	
		System.out.println("입력한 문자는 " + result);
		
	}
	
	public void method4_1() {

		// 사용자에게 값을 입력받아서 0보다 큰지 작은지 판별하는 프로그램 작성
		// 숫자 하나 입력 :
		// 변수 : num
		// 출력 예시 : 입력하신 숫자 7은 0보다 큽니다. 입력하신 숫자 -4는 0또는 0보다 작습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 하나 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "0보다 큽니다." : "0또는 0보다 작습니다.";
		
		System.out.println("입력하신 숫자 " + num + "은(는) " + result);
		
	}
	
	public void method5() {

		// 사용자가 입력한 정수값이
		// 양수인지, 음수인지, 0인지를 정확하게 판별한 후 출력
		// 삼항 연산자 중첩!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
	
		String result = (num > 0) ? "양수입니다." : (num == 0)? "0입니다." : "음수입니다.";
		// String result = (num == 0) ? "0입니다." : (num > 0)? "양수입니다." : "음수입니다.";
		
		System.out.println(num + "은(는) " + result);
		
	}
	
	public void method6() {

		// 사용자에게 두 개의 정수값 입력받고
		// + 또는 -를 입력받아 그에 맞는 연산 결과를 출력
		// 단, + 또는 - 외의 다른 문자를 입력했을 경우 "잘못입력했습니당" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); // 버퍼에 남아있는 엔터제거를 위한 코드
		
		System.out.print("연산자 입력(+ 또는 -) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : ("잘못입력했습니당.");
		
		System.out.println("결과 : " + result);

	}	
}
