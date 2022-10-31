package com.kh.practice.chap02.loop;

import java.util.Scanner;
import java.util.concurrent.Flow.Publisher;

public class LoopPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;

			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;

			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);
			if (i < num) {
				System.out.print(" + ");
			} else {
				System.out.println(" = " + sum);
			}
		}
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 >= 1 && num2 >= 1) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 >= 1 && num2 >= 1) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
				break;

			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		System.out.println("===== " + dan + "단 =====");

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan <= 9) {
			for (dan = dan; dan < 10; dan++) {
				System.out.println("===== " + dan + "단 =====");
				
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %d\n", dan, i, dan * i);
				}
			}
		} else {
			System.out.println("9이하의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if (dan <= 9) {
				for (dan = dan; dan < 10; dan++) {
					System.out.println("===== " + dan + "단 =====");

					for (int i = 1; i < 10; i++) {
						System.out.printf("%d * %d = %d\n", dan, i, dan * i);
					}
				}
				break;
				
			} else {
				System.out.println("9이하의 숫자만 입력해주세요.");
			}
		}
	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		for (int i = num1; i < num1 + num2 * 10; i += num2) {
			System.out.print(i + " ");
		}
	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();

			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			sc.nextLine();

			switch (op) {
			case "+":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 + num2);
				return;
			case "-":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 - num2);
				return;
			case "*":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 * num2);
				return;
			case "%":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 % num2);
				return;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					break;
				} else
					System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 / num2);
				return;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;

			}
		}
	}

	public void practice13() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice14() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {
			for (int i = j; i <= num; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}