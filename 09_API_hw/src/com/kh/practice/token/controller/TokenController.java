package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {

		StringTokenizer stn = new StringTokenizer(str, " ");
		str = "";

		while (stn.hasMoreTokens()) {
			str += stn.nextToken();
		}

		return str;
	}

	public String firstCap(String input) {

		char ch = input.toUpperCase().charAt(0);
		String str = input.substring(1);

		return input = ch + str;
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
}
