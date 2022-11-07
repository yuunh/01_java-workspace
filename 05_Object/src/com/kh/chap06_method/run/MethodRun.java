package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {

		/*
		// ----- NonStaticMethod -----
		NonStaticMethod n = new NonStaticMethod();
		
		// 1. 매개변수 없고 반환값도 없는 메소드 호출
		n.method1();
		
		// 2. 매개변수 없고 반환값은 있는 메소드 호출
		// n.method2();
		// String str = n.method2();
		// System.out.println(str);
		System.out.println(n.method2());
		
		// 3. 매개변수는 있고 반환값은 없는 메소드 호출
		n.method3(10, 5);
		n.method3(10, 0);
		
		// 4. 매개변수도 있고 반환값도 있는 메소드 호출
		// char ch = n.method4("lemon", 2);
		// System.out.println(ch);
		// System.out.println(n.method4("lemon", 2));
		
		// 사용자에게 매개변수를 입력받아서 해당 메소드 호출
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 유효성 검사 해보기
		// index값이 0이상이고 문자열 길이보다 작을 때만 method4 실행
		
		// 잘 입력 : 메소드 실행
		// 인덱스값 잘못입력 : 인덱스값이 부적절합니다.
		
		if (num >= 0 && num < str.length()) {
			System.out.println("결과 : " + n.method4(str, num));
		}else {
			System.out.println("인덱스값이 부적절합니다.");
		}
		*/
		
		
		// ----- StaticMethod ------
		// 생성 없이 바로 호출 가능
		StaticMethod.method1();
		StaticMethod.method2();
		System.out.println(StaticMethod.method2()); // return 값은 출력하지 않으면 보이지 않는다
		StaticMethod.method3("안유진");
		System.out.println(StaticMethod.method4("kiwi", "kiwi"));
		
		// ----- OverloadingTest -----
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10, "hello");
		ot.test("hi", 10);
		ot.test(10, 20);
		ot.test("ㅇㅅㅇ");
		
		// 오버로딩의 대표적인 예 => print()
		System.out.println(0.0);
		System.out.println(10);
		System.out.println("ㅎㅅㅎ");
	}

}
