package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {

		Scanner sc = new Scanner(System.in);
		String com = " ";

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();

		while (true) {
			System.out.print("가위바위보 : ");
			String rps = sc.nextLine();

			int random = (int) (Math.random() * 3 + 1); // 1 2 3

			int count = 0;

			if (rps.equals("exit")) {
				System.out.println(count);
				return;
			} else {
				

					switch (random) { // 1 2 3
					case 1:
						com = "가위";
						break;
					case 2:
						com = "바위";
						break;
					case 3:
						com = "보";
						break;
					}
					
					System.out.println("컴퓨터 : " + com);
					System.out.println(name + " : " + rps);

					if (rps.equals(com)) {
						System.out.println("비겼습니다.");
						System.out.println();
					
					}
			
			}
		}
	}
}
