package com.kh.exception.run;

import java.io.IOException;

public class ThrowsTest {

	public static void main(String[] args) {

		ThrowsTest tt = new ThrowsTest();

		try {
			tt.methodA();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}

	public void methodA() throws IOException {
		methodB();
	}

	public void methodB() throws IOException {
		methodC();
	}

	public void methodC() throws IOException {
		throw new IOException();
		// Exception 발생
	}

}
