package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {

		/*
		 * * Wrapper 클래스
		 * => 기본자료형을 객체로 포장해줄 수 있는 클래스가 래퍼클래스이다
		 * 
		 * 기본자료형 <-----> Wrapper 클래스
		 * boolean			Boolean
		 * char				Character
		 * byte				Byte
		 * short			Short
		 * int				Integer
		 * long				Long
		 * float			Float
		 * double			Double
		 * 
		 * => 기본자료형을 객체로 취급해야 하는 경우
		 * 		- 메소드 호출해야될때
		 * 		- 메소드의 매개변수로 기본자료형이 아닌 객체타입만이 요구될때
		 * 		- 다형성을 적용시키고 싶을때
		 */
		
		// Boxing : 기본자료형 => Wrapper 클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		System.out.println(num1 == num2);
		
		// 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1 == i2);
		
		// 객체화 시키면 메소드 호출 가능
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1, 뒤쪽이 크면 -1, 같으면 0
		
		// 2. 객체 생성 따위 하지 않고 곧바로 대입하는 방법 (AutoBoxing)
		Integer i3 = num1;
		System.out.println(i3);
		
		// 객체 생성을 통해서 반드시 변환해야 되는 경우 => 문자열을 Integer 타입으로
		// Integer i4 = "123"; // 오류남
		Integer i4 = new Integer("123"); // 오로지 숫자를 줘야함
		System.out.println(i4); // 숫자 123 출력
		
		// UnBoxing : Wrapper 클래스 자료형 -> 기본 자료형
		
		// 1. 해당 그 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해
		int num3 = i3.intValue();
		int num4 = i4.intValue();
		
		// 2. 메소드 따위 사용하지 않고 바로 대입하는 방법 (autoUnBoxing)
		int num5 = i1;
		
		// 이거 도대체 왜 하는거임?? -_-
		// 웹 개발할 때 값을 입력하면 무조건!! 문자열로 날라옴
		System.out.println("==============================");
		
		// 기본자료형 <-----> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // 문자열 + 문자열 = 문자열
		
		// 1. String --> 기본자료형
		// 	   "10"  --> 10
		// 	  "15.3" --> 15.3
		// 해당 Wrapper.perseXXX() 사용
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d);
		
	}

}
