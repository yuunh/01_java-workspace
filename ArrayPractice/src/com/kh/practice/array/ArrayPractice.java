package com.kh.practice.array;

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

		int[] arr = new int[num]; // 배열 생성

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
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

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt(); // 정수를 입력받는 메소드

			int[] arr = new int[num]; // 배열 생성

			if (num >= 3 && num % 2 == 1) {
				for (int i = 0; i < arr.length; i++) {
					arr[i] = i + 1;
					System.out.print(arr[i] + " ");
				}
				
			} else {
				System.out.println("다시 입력하세요.");
			}
		}//
	}
	
	public void practice9() {

		Scanner sc = new Scanner(System.in); // 스캐너 생성

		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine(); // 문자열을 엔터 전까지 입력받는 메소드

		String[] chicken = { "양념", "후라이드" }; // 배열 생성

		for (int i = 0; i < chicken.length; i++) { // 배열 출력
			if (chicken[i].equals(menu)) {
				System.out.println(chicken[i] + "치킨 배달 가능");
				break;
			} else {
				System.out.println(menu + "치킨은 없는 메뉴입니다.");
				break;
			}
		}//
	}

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
		for (int i = 0; i < arrCopy.length; i++) { // 값 출력
			System.out.print(arrCopy[i]);
		}
	}
	
	public void practice11() {
		
		int[] num = new int[10]; // 배열 생성
		
		for (int i = 0; i < num.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			num[i] = random; 
			System.out.print(num[i] + " ");
		}
	}
	
	public void practice12() {

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			num[i] = random;
			System.out.print(num[i] + " ");
		}
	} //
	
	public void practice13() {
		
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			num[i] = random;
			System.out.print(num[i] + " ");
		}
	} //
	
	public void practice14() {
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45 + 1);
			lotto[i] = num;
			
		}
	} //

	public void practice15() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] arr = new char[str.length()];

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.print(arr[i] + " ");
			count++;
		}
		System.out.println();

		System.out.print("문자 개수 : " + count);
	}
	
	public void practice16() {
		
		
		
	}
}