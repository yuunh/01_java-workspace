package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		// 객체 생성 => new
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!

		p.setId("abcd");
		p.setPwd("1234");
		p.setName("우영우");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-1234-5678");
		p.setEmail("abcd@efg.com");
		
		System.out.println("아이디 : " + p.getId());
		System.out.println("비밀번호 : " + p.getPwd());
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("성별 : " + p.getGender());
		System.out.println("전화번호 : " + p.getPhone());
		System.out.println("이메일 : " + p.getEmail());
		
		System.out.println();
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(p.information());
		System.out.println("=======================");
		System.out.println();
		
		// 첫번째 방법 : 기본생성자로 생성 후 setter 메소드 이용해서 값 초기화
		/*
		Product p1 = new Product();
		p1.setpName("갤럭시");
		p1.setPrice(1200000);
		p1.setBrand("삼성");
		*/
		
		// 두번째 방법 : 매개변수 생성자로 생성과 동시에 값 초기화
		Product p1 = new Product("갤럭시", 1200000, "삼성");
		p1.setPrice(1000000);
		
		/*
		Product p2 = new Product();
		p2.setpName("아이폰");
		p2.setPrice(1300000);
		p2.setBrand("애플");
		*/
		
		Product p2 = new Product("아이폰", 1300000, "애플");
		
		
		System.out.println("pName : " + p1.getpName() + ", price : " + p1.getPrice() + ", brand : " + p1.getBrand());
		System.out.println("pName : " + p2.getpName() + ", price : " + p2.getPrice() + ", brand : " + p2.getBrand());
		
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		System.out.println();
		System.out.println("====================");
		System.out.println();
		
		Person ps1 = new Person();
		System.out.println(ps1.information());

		Person ps2 = new Person("우영우", "1234", 20, "010-1234-5678");
		System.out.println(ps2.information());
		
		Person ps3 = new Person("abcd", "1234", "우영우", 20, 'F', "010-1234-5678", "abcd@efg.com");
		System.out.println(ps3.information());
	}

}
