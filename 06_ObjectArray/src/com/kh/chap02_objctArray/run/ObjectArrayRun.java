package com.kh.chap02_objctArray.run;

import java.util.Scanner;

import com.kh.chap02_objctArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {

		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// for loop문 => 단순한 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Phone[] phones = new Phone[3];
		
		// System.out.println(arr);
		// System.out.println(phones);
		// System.out.println(phones[0]);
		// phones[0].setName("아이폰"); // NullPointerException
		
		// 기본생성자로 객체 생성후 setter 메소드 호출하여 값 셋팅
		phones[0] = new Phone();
		
		phones[0].setName("벨벳폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(1000000);
		phones[0].setSerise("1");
		
		// 매개변수 생성자로 객체 생성 및 값 초기화
		phones[1] = new Phone("아이폰", "애플", 1300000, "11PRO");
		phones[2] = new Phone("갤럭시", "삼성", 1200000, "s20");
		
		// 총가격과 평균가격을 구해보자
		int total = 0;
		
		for (int i = 0; i < phones.length; i++) {
			System.out.println(phones[i].information());
			total += phones[i].getPrice();
		}
		System.out.println("총가격 : " + total + "원");
		// System.out.println("평균가 : " + total / 3 + "원");
		System.out.println("평균가 : " + total / phones.length + "원");
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력받아
		// 해당 휴대폰을 찾은 후에 그 가격을 알려주자
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 휴대폰 입력 : ");
		String buy = sc.nextLine();
		
		for (int i = 0; i < phones.length; i++) {
			if (phones[i].getName().equals(buy)) {
				System.out.println("당신의 구매하고자 하는 휴대폰의 가격은 " + phones[i].getPrice() + "원입니다");
			}
		}
	}

}
