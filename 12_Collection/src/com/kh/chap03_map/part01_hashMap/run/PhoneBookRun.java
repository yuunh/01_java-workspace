package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> information = new HashMap<String, String>();
		
		information.put("안수영", "010-2626-8658");
		information.put("우의정", "010-9204-4560");
		information.put("이소희", "010-5215-2022");
		information.put("윤정민", "010-8228-6399");
		System.out.println(information);
		while (true) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			if (name.equals("exit")) {
				System.out.println("프로그램이 종료됩니다");
				return;
			}
			String name1 = information.get(name);
			if (name1 == null) {
				System.out.println(name + "님의 전화번호가 등록되어 있지 않습니다");
				System.out.print("추가하시겠습니까?(y/n) : ");
				char ch = sc.nextLine().charAt(0);
				
				if (ch == 'y') {
					System.out.print("전화번호를 입력하세요(-포함) : ");
					String newNum = sc.nextLine();
					
					information.put(name, newNum);
					System.out.println(name + "님 " + newNum + " 번호가 추가되었습니다.");
				} else {
					
				}
			} else {
				System.out.println(name + "님의 전화번호는 " + name1 + " 입니다.");
			}
		}
		
	}
}
