package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * 반복문
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨 (for문 / while문(do-whill문))
	 * 
	 * for문
	 * 
	 * [표현법]
	 * for (초기식; 조건식; 증감식) {  // 반복 횟수를 지정하기 위해 제시하는 것들
	 * 			반복적으로 실행시키고자 하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 해당 구문을 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성함)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++, --)를 사용함)
	 * 
	 * for문을 만나는 순간
	 * 초기식 --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 		--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * -------------------- 이 내용이 계속 반복 --------------------
	 *		--> 조건식 검사 --> false일 경우 실행구문 실행하지 않고 --> 반복문 빠져나옴
	 *
	 * *알아둘 것
	 * for문 안에 초기식, 조건식, 증감식 각각 생략 가능하긴함 (단 ; ; 은 반드시 필수)
	 * => for(; ;) 무한 실행
	 */
	
	public void method1() {
		
		// "안녕하세요"를 5번 반복해서 출력하기
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		 */
		
		for (int i = 1; i <= 5; i++) { // i값이 1에서부터 5까지 매번 증가하는 동안 반복 수행 => 5회 수행
			System.out.println("안녕하세요");
		}
		
		for (int i = 0; i <= 4; i++) { // i값이 0에서부터 4까지 매번 증가하는 동안 반복 수행 => 5회 수행
			System.out.println("반갑습니다");
		}
		
		for (int i = 11; i < 16; i++) { // i값이 11에서부터 15까지 매번 증가하는 동안 반복 수행 => 5회 수행
			System.out.println("저리가세요");
		}
		
		for (int i = 1; i < 10; i+=2) { // i값이 1에서부터 9까지 매번 2씩 증가하는 동안 반복 수행 => 5회 수행
			System.out.println("Hello");
		}
		
	}
	
	public void method2() {
		
		// 1부터 5까지 출력
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		
		// 1 2 3 4 5 (사이사이 공백을 넣어서
		
		for (int i = 1; i < 6; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void method3() {
		
		// 5 4 3 2 1
		
		for (int i = 5; i > 0; i--) { // i값이 5에서부터 1까지 매번 1씩 감소하는 동안 반복 => 5회 수행
			System.out.print(i + " ");
		}
		
	}
	
	public void method4() {
		
		// 1부터 10까지의 홀수만을 출력
		// 1 3 5 7 9
		
		for (int i = 1; i < 11; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i < 11; i++) { // i값이 1에서부터 10까지 매번 1씩 증가되는 동안 반복 수행 (10회)
			if (i % 2 == 1) {			
				System.out.print(i + " ");
			}
		}
		
	}
	
	public void method5() {
		
		// 1 2 3 4 ... 8 9 10 for문 고정
		
		for (int i = 0; i < 11; i++) {
			if (i > 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print((i+1) + " ");
		}
		
	}
	
	public void method6() {
		
		// 1에서부터 10까지의 총 합계
		
		// 방법1. int sum = 1 + 2 + 3 + .... + 8 + 9 + 10;
		/*
		 * 방법2.
		 * int sum = 0;
		 * sum += 1; => sum = sum + 1; => 0 + 1
		 * sum += 2; => sum = sum + 2; => 0 + 1 + 2
		 * sum += 3; => sum = sum + 3; => 0 + 1 + 2 + 3
		 * ....
		 * sum += 9;
		 * sum += 10;
		 * 
		 * 규칙을 찾자!
		 * sum 변수에 누적해서 합산하는거 반복적으로 진행됨
		 * 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가되는걸 파악할 수 있음!
		 * 
		 */
		
		int sum = 0;
		
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum); // 반복문 밖에다가 작성해야됨
		
	}

	public void method7() {

		// 사용자에게 값을 입력받아 1부터 입력받은 수까지의 합계 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		// 1부터 num까지의 합 : xxx
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	}
}
