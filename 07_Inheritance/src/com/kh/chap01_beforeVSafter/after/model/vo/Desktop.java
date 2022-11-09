package com.kh.chap01_beforeVSafter.after.model.vo;
//			자식 -----> 부모
//			후손 -----> 조상
//			하위 -----> 상위
// 			this-----> super
public class Desktop extends Product {

	private Boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// brand ~ price 네 개의 값들은 부모클래스(Product)의 필드에 대입
		// super. 으로 부모에 접근
		
		// 해결방법 1. 부모클래스에 있는 필드를 protected 접근제한자로 수정
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// 해결방법 2. 부모클래스에 있는 setter 메소드 활용하기 (public 이기 때문에 접근 가능)
		/*
		super.setBrand(brand); // this.brand = brand;
		super.setpCode(pCode); // this.pCode = pCode;
		super.setpName(pName); // this.pName = pName;
		super.setPrice(price); // this.price = price;
		*/
		
		// 해결방법 3. 부모생성자 호출하기
		super(brand, pCode, pName, price);
		
		this.allInOne = allInOne;
		
	}

	public Boolean getAllInOne() {
		return allInOne;
	}

	public void setAllInOne(Boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
}
