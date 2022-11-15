package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고, 없앤 문자열 반환

		StringTokenizer stn = new StringTokenizer(str, " ");

		int count = stn.countTokens();
		String newStr = "";

		for (int i = 0; i < count; i++) {
			newStr += stn.nextToken();
		}

		// str = "";

		// while (stn.hasMoreTokens()) {
		// str += stn.nextToken();
		// }
		return newStr;
	}

	public String firstCap(String input) {

		String upper = input.substring(0, 1).toUpperCase();
		String lower = input.substring(1).toLowerCase();

		return upper + lower;

		// char ch = input.toUpperCase().charAt(0);
		// String str = input.substring(1, input.length());

		// return ch + str;
	}

	public int findChar(String input, char one) {

		int count = 0;

		char[] arr = input.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (one == arr[i]) {
				count++;
			}
		}
		return count;
	}
	
	public int findChar2(String input, char one) {

		int count = 0;

		char[] arr = input.toCharArray();

		String sOne = one + "";

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			String str = ch + "";

			if (str.contains(sOne)) {
				count++;
			}
		}
		return count;
	}

}
