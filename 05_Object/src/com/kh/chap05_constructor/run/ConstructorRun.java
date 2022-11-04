package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {

		User u1 = new User();
		
		System.out.println(u1.information());
		// 각 필드에 JVM의 초기값이 담겨 있음
		
		// 1. 객체 생성 후 값을 대입하는 방법
		//회원가입시 필수 입력 사항만 받는다면?
		/*
		u1.setUserId("user01");
		u1.setUserPwd("pwd01");
		u1.setUserName("차은우");
		*/
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성
		User u2 = new User("user01" , "pwd02" , "차은우");
		
		System.out.println(u2.information());
		
		// 3. 매개변수 전체 필드 넣어서 생성자 만들고 객체 생성
		User u3 = new User("user03" , "pwd03" , "안유진", 18, 'F');
		
		System.out.println(u3.information());
		
		// 그럼 setter 안만들어도 되지 않을까? => 안됨!!
		// 차은우 -> 차으누
		u2.setUserName("차으누");
		System.out.println(u2.information());
		
		// 그럼 getter는 안만들면 안될까?
		// 비번을 까먹은 경우에는 비번만 보여줘야함
		System.out.println(u2.getUserPwd());
		
	}

}
