package com.kh.product.run;

import com.kh.product.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {

		// 객체 생성
		Product p = new Product();
		
		// 값 세팅
		p.setpName("eclipse");
		p.setPrice(1500);
		p.setBrand("이클립스");
		
		// 출력
		System.out.println("제품명 : " + p.getpName());
		System.out.println("가격 : " + p.getPrice());
		System.out.println("브랜드 : " + p.getBrand());
	}

}
