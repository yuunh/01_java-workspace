package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {

		// java.lang.Math (String, object) => 굳이 import 하지 않아도 사용할 수 있음
		
		// 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 절대값을 알고자 할 때 : abs(앱솔루트)
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		// 올림 : ceil : 크거나 같은 정수값
		double num2 = 4.349; // 5
		double num3 = -10.594; // -10
		System.out.println("올림한 결과 : " + Math.ceil(num2));
		System.out.println("올림한 결과 : " + Math.ceil(num3));
		
		// 버림 : floor : 작거나 같은 정수값
		System.out.println("버림 : " + Math.floor(num2));
		
		// 반올림 : round
		System.out.println("반올림 : " + Math.round(num2));
		
		// 가장 가까운 정수값을 알아낸 후 실수형으로 반환 : rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));
		
		// 제곱근(루트) : sqrt
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 제곱 : pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		// Math = m = new Math();
		
		/*
		 * * Math 특징
		 * - 모든필드 상수필드, 모든 메소드 static 메소드!! (싹다 static임) 
		 * - 생성자 아싸리 private로 돼있음 => 생성 불가하도록!!
		 * 
		 * ** 한번만 메모리 영역에 올려놓고 재사용 하는 개념 => 싱글톤 패턴
		 */
	}

}
