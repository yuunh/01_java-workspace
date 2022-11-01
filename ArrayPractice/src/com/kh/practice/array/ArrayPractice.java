package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {

		int[] arr = new int[10]; // 배열 선언

		for (int i = 0; i < arr.length; i++) { // 값 대입
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) { // 배열 출력
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {

		int[] arr = new int[10]; // 배열 선언

		for (int i = 0; i < arr.length; i++) { // 값 대입
			arr[i] = 10 - i;
		}
		for (int i = 0; i < arr.length; i++) { // 배열 출력
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in); // 스캐너 생성

		System.out.print("양의 정수 : ");
		int num = sc.nextInt(); // 정수를 입력받는 메소드

		int[] arr = new int[num]; // 배열 선언

		for (int i = 0; i < arr.length; i++) { // 값 대입
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) { // 배열 출력
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {

		String[] fruits = { "사과", "귤", "포도", "복숭아", "참외" }; // 배열 선언 및 값 대입

		for (int i = 0; i < fruits.length; i++) { // 배열 출력
			if (fruits[i].equals("귤")) {
				System.out.print(fruits[i]);
			}
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in); // 스캐너 생성

		System.out.print("문자열 : ");
		String str = sc.nextLine(); // 문자열을 엔터 전까지 입력받는 메소드

		char[] str1 = new char[str.length()]; // 배열 생성

		for (int i = 0; i < str1.length; i++) { // 값 대입
			str1[i] = str.charAt(i);
		}

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0); //문자열에서 index에 해당하는 단일문자 추출

		int count = 0;

		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

		for (int i = 0; i < str1.length; i++) {
			if (str1[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();

		System.out.println(ch + "개수 : " + count);
	}

	public void practice6() {

		String[] days = { "월", "화", "수", "목", "금", "토", "일" }; // 배열 생성 및 초기화

		Scanner sc = new Scanner(System.in); // 스캐너 생성

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt(); // 정수를 입력받는 메소드

		if (num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 0; i < days.length; i++) { // 배열 출력
				if (num == i) {
					System.out.println(days[i] + "요일");
				}
			}
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in); // 스캐너 생성

		System.out.print("정수 : ");
		int num = sc.nextInt(); // 정수를 입력받는 메소드

		int[] arr = new int[num]; // 배열 생성 및 할당

		int sum = 0;

		for (int i = 0; i < arr.length; i++) { // 값 대입
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt(); // 정수를 입력받는 메소드
		}
		for (int i = 0; i < arr.length; i++) { // 배열 출력
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();

		System.out.println("총 합 : " + sum);
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in); // 스캐너 생성

		while (true) { // 조건이 맞을 때까지 반복 (무한 반복) => while문
			System.out.print("정수 : ");
			int num = sc.nextInt(); // 정수를 입력받는 메소드

			if (num >= 3 && num % 2 == 1) { // num이 3이상이면서 홀수인 경우

				int[] arr = new int[num]; // 배열 생성

				/*
				 * 5 입력시 => {1, 2, 3, 2, 1} 			 => 2번 인덱스까지 증가 그 이후부터 감소
				 * 7 입력시 => {1, 2, 3, 4, 3, 2, 1}		 => 3번 인덱스까지 증가 그 이후부터 감소
				 * 9 입력시 => {1, 2, 3, 4, 5, 4, 3, 2, 1} => 4번 인덱스까지 증가 그 이후부터 감소
				 */

				int value = 1;

				for (int i = 0; i < arr.length; i++) { // 값 대입
					arr[i] = value;
					if (i < arr.length / 2) {
						value++;
					} else {
						value--;
					}
				}
				for (int i = 0; i < arr.length; i++) { // 배열 출력
					System.out.print(arr[i] + " ");
				} return; // 해당 메소드 빠져나가는 구문
				
			} else { // num이 홀수가 아니거나 3미만일 경우
				System.out.println("다시 입력하세요.");
			}
		}
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in); // 스캐너 생성

		String[] menu = { "양념", "후라이드", "지코바", "뿌링클" }; // 배열 생성

		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine(); // 문자열을 엔터 전까지 입력받는 메소드

		for (int i = 0; i < menu.length; i++) { // 배열 출력
			if (chicken.equals(menu[i])) {
				System.out.println(chicken + "치킨 배달 가능");
				return; // 해당 메소드 빠져나가는 구문
			}
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
	}//

	public void practice10() {

		Scanner sc = new Scanner(System.in); // 스캐너 생성

		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine(); // 문자열을 엔터 전까지 입력받는 메소드

		char[] arr = new char[idNum.length()]; // 배열 생성

		for (int i = 0; i < arr.length; i++) { // 값 대입
			arr[i] = idNum.charAt(i);
		}

		char[] arrCopy = arr.clone(); // 배열 복사

		for (int i = 8; i < arrCopy.length; i++) { // 값 대입
			arrCopy[i] = '*';
		}
		for (int i = 0; i < arrCopy.length; i++) { // 배열 출력
			System.out.print(arrCopy[i]);
		}
	}
	
	public void practice11() {
		
		int[] arr = new int[10]; // 배열 선언 및 할당

		for (int i = 0; i < arr.length; i++) { // 초기화(값 대입) 및 출력
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {

		int[] arr = new int[10]; // 배열 선언 및 할당

		for (int i = 0; i < arr.length; i++) { // 초기화(값 대입)
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		for (int i = 0; i < arr.length; i++) { // 배열 출력
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) { // 최대값 구하기
				max = arr[i];
				
			}
			if (min > arr[i]) { // 최소값 구하기
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice12_1() {
		
		int[] arr = new int[10]; // 배열 선언 및 할당
		
		for (int i = 0; i < arr.length; i++) { // 값 대입(초기화)
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random; 
		}
		for (int i = 0; i < arr.length; i++) { // 배열 출력
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int min = arr[0];
		int max = arr[0];
		
		Arrays.sort(arr); // 오름차순으로 정렬해주는 함수
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		min = arr[0];
		max = arr[arr.length-1];
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice13() {

		int[] arr = new int[10]; // 배열 선언 및 할당

		for (int i = 0; i < arr.length; i++) { // 배열 초기화
			arr[i] = (int)(Math.random() * 10 + 1);
			// int random = (int)(Math.random() * 10 + 1);
			// arr[i] = random;
			for (int j = 0; j < i; j++) { // 중복되지 않는 값 구하기
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) { // 배열 출력
			System.out.print(arr[i] + " ");
		}
	}

	public void practice14() {

		int[] lotto = new int[6]; // 배열 선언 및 할당

		for (int i = 0; i < lotto.length; i++) { // 배열 초기화
			lotto[i] = (int)(Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) { // 중복되지 않는 값 구하기
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lotto); // 오름차순으로 정렬해주는 함수
		
		for (int i = 0; i < lotto.length; i++) { // 배열 출력
			System.out.print(lotto[i] + " ");
		}
	}

	public void practice15() {

		Scanner sc = new Scanner(System.in); // 스캐너 생성

		System.out.print("문자열 : ");
		String str = sc.nextLine(); // 문자열을 엔터 전까지 입력받는 메소드

		char[] arr = new char[str.length()]; // 배열 선언

		int count = 0; // 개수를 위한 변수 생성

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) { // 값 대입
			arr[i] = str.charAt(i);

			boolean flag = true;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
				}
			}
			if (flag) {
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				count++;
			}
		}
		System.out.println();

		System.out.print("문자 개수 : " + count);
	}

	public void practice16() {

	}
}
