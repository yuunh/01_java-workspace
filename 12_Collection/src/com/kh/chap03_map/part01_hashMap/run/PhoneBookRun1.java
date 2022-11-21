package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap03_map.part01_hashMap.controller.PhoneBookController;
import com.kh.chap03_map.part01_hashMap.model.vo.PhoneBook;

public class PhoneBookRun1 {

	public static void main(String[] args) {

		ArrayList<PhoneBook> pBook = new ArrayList<PhoneBook>();

		pBook.add(new PhoneBook("안수영", "010-2626-8658", "친구"));
		pBook.add(new PhoneBook("우의정", "010-9204-4560", "친구"));
		pBook.add(new PhoneBook("이소희", "010-5215-2022", "가족"));
		pBook.add(new PhoneBook("윤정민", "010-8228-6399", "가족"));

		printBooks(pBook);
	}

	private static void printBooks(ArrayList<PhoneBook> pBook) {

		PhoneBookController pc = new PhoneBookController();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while (flag = true) {
			System.out.println("===============");
			System.out.println("전화번호부입니다.");
			System.out.println("1. 조회하기");
			System.out.println("2. 추가하기");
			System.out.println("3. 전화번호 찾기");
			System.out.println("4. 프로그램 종료");
			System.out.println("===============");

			System.out.print("메뉴 번호를 입력하세요 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println("====================");
				System.out.println("1. 전체 전화번호 조회하기");
				System.out.println("2. 친구 그룹만 조회하기");
				System.out.println("3. 가족 그룹만 조회하기");
				System.out.println("4. 이전으로");
				System.out.println("====================");

				System.out.print("메뉴 번호를 입력하세요 : ");
				int menu1 = sc.nextInt();
				sc.nextLine();

				if (menu1 == 1) {
					System.out.println(pBook);
				} else if (menu1 == 2) {
					System.out.println();
				} else if (menu1 == 3) {

				} else if (menu1 == 4) {
					flag = true;
				} else {
					System.out.println("잘못입력하셨습니다. 이전으로 돌아갑니다.");
					flag = true;
				}
				break;

			case 2:
				System.out.println("==============================");
				System.out.print("이름을 입력하세요 : ");
				String name = sc.nextLine();
				System.out.print("전화번호를 입력하세요(- 포함) : ");
				String numBer = sc.nextLine();
				System.out.print("그룹을 입력하세요(친구/가족) : ");
				String group = sc.nextLine();
				System.out.println("==============================");

				System.out.println(group + " 그룹에 " + name + ", " + numBer + " 가 추가되었습니다");

				break;

			case 3:
				System.out.println("===============");
				System.out.println("1. 이름으로 찾기");
				System.out.println("2. 전화번호로 찾기");
				System.out.println("3. 이전으로");
				System.out.println("===============");

				System.out.print("메뉴 번호를 입력하세요 : ");
				int menu3 = sc.nextInt();
				sc.nextLine();

				if (menu3 == 1) {
					System.out.print("이름을 입력하세요 :");
					name = sc.nextLine();
					System.out.println();
				} else if (menu3 == 2) {
					System.out.print("전화번호를 입력하세요(- 포함) : ");
					numBer = sc.nextLine();
					System.out.println();
				} else if (menu3 == 3) {
					flag = true;
				}
				break;

			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				flag = true;
				break;
			}
		}
	}
}
