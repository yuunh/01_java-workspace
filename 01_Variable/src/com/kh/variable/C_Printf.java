package com.kh.variable;

public class C_Printf {

	public void printfTest() {
	// System.out.print(출력하고자 하는 값); // 출력만함 (줄바꿈x)
	// System.out.println(출력하고자 하는 값); // 출력 후 줄바꿈
	
	// System.out.printf("출력하고자 하는 형식(포맷)", 출력하고자 하는 값);
	// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행 (줄바꿈x)
	
	/*
	 * 포맷 안에서 쓰일 수 있는 키워드
	 * %d : 정수
	 * %c : 문자
	 * %s : 문자열(문자)
	 * %f : 실수 (무조건 소숫점 6자리까지 출력)
	 */
	
	int iNum1 = 10;
	int iNum2 = 20;
	
	// 10 20
	System.out.println(iNum1 + " " + iNum2);
	System.out.printf("%d %d", iNum1, iNum2);
	System.out.println();
	
	// 10 20%
	System.out.printf("%d %d%%", iNum1, iNum2);
	System.out.println();
	
	// System.out.printf("%d %d", iNum1);
	// 오류. 포맷 갯수와 출력하고자 하는 값의 갯수가 같아야 됨
	// System.out.printf("%d %d", iNum1, iNum2, 30);
	// 오류는 안나지만 이후값은 출력안됨
	
	System.out.printf("%5d\n", iNum1); // 양수 5 오른쪽 정렬
	System.out.printf("%-5d\n", iNum1); // 음수 5 왼쪽 정렬
	
	// 정렬하고자 할 때 사용한다
	// 양수 5 오른쪽 정렬
	System.out.printf("%5d\n", 250);
	System.out.printf("%5d\n", 3000);
	System.out.printf("%5d\n", 16);
	
	double dNum1 = 1.23456789; // 소숫점 아래 6자리까지 보여줌
	double dNum2 = 4.53;
	
	System.out.printf("%f\t%f\n", dNum1, dNum2);
	// 수평 탭만큼 이동
	System.out.printf("%.2f %.3f\n", dNum1, dNum2);
	// 소숫점 자리수 지정
	
	char ch = 'a';
	String str = "Hello";
	
	// 소문자 출력x 대문자 출력o
	System.out.printf("%c %s %s\n", ch, str, ch);
	System.out.printf("%C %S %S\n", ch, str, ch);
	
	}
}
