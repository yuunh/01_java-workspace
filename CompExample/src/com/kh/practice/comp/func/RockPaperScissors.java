package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {

		Scanner sc = new Scanner(System.in);

		String com = " ";

		int total = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();

		while (true) {
			System.out.print("가위바위보 : ");
			String rps = sc.nextLine();

			int random = (int) (Math.random() * 3 + 1); // 1 2 3

			if (rps.equals("exit")) {
				System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패");
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
					draw++;
					total++;

				} else if (com.equals("가위")) {
					switch (rps) {
					case "바위":
						System.out.println("이겼습니다 !");
						System.out.println();
						win++;
						total++;
						break;
					case "보":
						System.out.println("졌습니다 ㅠㅠ");
						System.out.println();
						lose++;
						total++;
						break;
					}
				} else if (com.equals("바위")) {
					switch (rps) {
					case "가위":
						System.out.println("졌습니다 ㅠㅠ");
						System.out.println();
						lose++;
						total++;
						break;
					case "보":
						System.out.println("이겼습니다 !");
						System.out.println();
						win++;
						total++;
						break;
					}
				} else if (com.equals("보")) {
					switch (rps) {
					case "가위":
						System.out.println("이겼습니다 !");
						System.out.println();
						win++;
						total++;
						break;
					case "바위":
						System.out.println("졌습니다 ㅠㅠ");
						System.out.println();
						lose++;
						total++;
						break;
					}
				} else if (!(rps.equals("가위") || rps.equals("바위") || rps.equals("보"))) {
					System.out.println("잘못입력하셨습니다.");
				}
			}
		}
	}
}
