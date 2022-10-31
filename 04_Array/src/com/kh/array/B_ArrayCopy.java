package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	public void method1() {
		
		// 배열 복사
		
		int[] origin = {1,2,3,4,5};
		
		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 단순하게 origin을 다시 대입시킨 copy 배열
		int[] copy = origin;
		System.out.println("== 복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		
		System.out.println("----- 복사본 배열 값 변경 후 -----");
		
		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// copy만을 가지고 수정을 해도 원본까지 변경됨
		// 왜? origin과 copy가 같은곳을 참조하고 있기 때문 (즉 주소값이 같다)
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		// 얕은 복사 : 주소값을 복사
	}
	
	public void method2() {
		
		// 얕은 복사의 문제를 해결하기 위한 깊은 복사
		
		// 1. for문을 활용한 방법
		//	새로운 배열을 아싸리 생성한 후 반복문을 활용해서
		//	원본 배열의 값을들 새로이 만든 배열에 대입하는 방법
		
		int[] origin = {1,2,3,4,5}; // 원본배열
		
		// int[] copy = origin; // 얕은복사 : 주소값 대입
		int[] copy = new int[5];
		
		for (int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}
		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}	
		System.out.println();
		
		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// copy 배열 수정해보기
		copy[2] = 99;
		System.out.println("----- copy 수정 후 -----");
		
		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
	}
	
	public void method3() {
		
		// 2. 아싸리 새로운 배열 생성 후 System이라는 클래스에서의 arraycopy() 메소드를 이용한 복사
		
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[10]; // 넉넉하게 크게 생성 / 0~9 인덱스까지 0이 담겨있음!
		
		// System.arraycopy(원본배열명, 복사 시작할 인덱스, 복사본배열명, 복사본 배열의 복사 시작 인덱스, 복사할 갯수)
		
		// System.arraycopy(origin, 0, copy, 0, 5);
		//System.arraycopy(origin, 0, copy, 2, 5);
		System.arraycopy(origin, 1, copy, 3, 3);
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
		// 주소값이 다름 (깊은 복사)
		// => 각자 다른 배열 참조하고 있음
		// => 즉, 배열 수정시 서로에게 영향을 주지 않음
	}
	
	public void method4() {
		
		// 3. Arrays 클래스 제공하는 copyOf() 메소드 사용
		
		int[] origin = {1,2,3,4,5};
		
		// 복사본 배열 = Arrays.copyOf(원본배열명, 복사할길이);
		
		// int[] copy = Arrays.copyOf(origin, 5);
		// int[] copy = Arrays.copyOf(origin, 3);
		int[] copy = Arrays.copyOf(origin, 10);
		
			for (int i = 0; i < copy.length; i++) {
				System.out.print(copy[i] + " ");
			}
		System.out.println();
		
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
		/*
		 * Arrays.copyOf() 메소드
		 * => 내가 제시한 길이만큼 복사본 배열 크기 할당
		 * => 단, 내가 제시한 길이가 원본배열의 크기보다 클 경우 기존의 배열에 있는 값은 다 복사 나머지는 0으로 채운다.
		 * => 	 내가 제시한 길이가 원본배열의 크기보다 작을 경우 기존의 배열에 있는 값을 내가 제시한 길이만큼만 복사한다.
		 */
	}
	
	public void method5() {
		
		// 4. clone() 메소드를 이용한 복사
		// 인덱스 지정불가, 크기지정 별도로 못함

		int[] origin = {1,2,3,4,5};
		
		// 복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone();
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
	}
	
	/*
	 * [참고]
	 * java.lang.Math 
	 * java.lang.String
	 * java.lang.System
	 * => java.lang. 패키지에 있는 클래스들을 쓸 때는 import 안해줘도됨
	 * => import.java.lang.*; => 알게모르게 포함되어있음
	 * 
	 * java.util.Scanner
	 * java.util.Arrays
	 * => java.lang 이외의 패키지에 있는 클래스들을 쓸 때는 무조건 import 해야한다!!
	 */
	
}
