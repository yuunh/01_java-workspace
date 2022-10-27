package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * continue : 반복문 안에 기술되는 구문
	 * 
	 * continue; 구문 실행시 그 뒤의 구문을 실행하지 않고 곧바로 현재 속해있는 반복문 위로 올라감
	 */
	
	public void method1() {
		
		// for문으로 1~10까지 홀수 출력
		// 1 3 5 7 9
		
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		for (int i = 1; i < 11; i++) { // 1~10
			if (i % 2 == 0) { // i값이 짝수일 경우
				continue; // 건너뜀
				// 반복문 실행 안하고 증감만 하고 나간다
			}
			System.out.print(i + " ");
		}
		
	}
	
	public void method2() {
		
		// 1부터 100까지의 총합계
		// 단, 6의 배수값은 빼서 덧셈연산한다
		
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
	}
	
	public void method3() {
		
		// 2~9 단 출력
		// 단, 3의 배수단은 빼고 출력
		
		for (int dan = 1; dan < 10; dan++) {
			if (dan % 3 == 0) {
				continue;
			}
			System.out.println("=== " + dan + "단 ===");
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}
		
	}
	
	// ctrl + shift + f : 코드정렬
	// alt + 방향키 : 코드이동
	// ctrl + shift + r : 파일명으로 검색
	// ctrl + h : 키워드 파일 서치
}
