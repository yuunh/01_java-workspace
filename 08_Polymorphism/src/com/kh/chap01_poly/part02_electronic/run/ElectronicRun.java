package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {

		// 실행용 클래스는 납품업체라고 생각!
		/*
		// 1. 다형성 적용 안했을 경우 (ElectronicShop1)
		
		ElectronicShop1 es = new ElectronicShop1();
		// es에서 마련해놓은 desk, note, tab 이라는 필드에
		// 객체를 생성해서 넣어주기 위해 우선 es를 생성
		// 객체 생성하는 순간 해당 클래스에 제시된 세 필드가 메모리 상에 할당
		
		// 메소드를 써서 생성하겠음
		// 먼저 필요한 메소드를 생각해보자
		
		// 아직은 없는 메소드
		// 추가용 메소드 => insert
		// 데스크탑이라는 객체를 생성해서 넘기는 메소드
		
		// es.insert(데스크탑이라는 객체를 생성);
		es.insert(new Desktop("Samsung", "데땁", 1200000, "gtx1070"));
		// 아직은 해당 메소드가 없기 때문에 에러가 난다
		
		// 노트북이라는 객체를 생성해서 넘기는 메소드
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		
		// 태블릿이라는 객체를 생성해서 넘기는 메소드
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 가게에 해당 객체들이 잘 생성되어있는지를 확인해보자
		// 조회용 메소드 => select
		
		Desktop d = es.selctDesktop();
		NoteBook n = es.selctNoteBook();
		Tablet t = es.selctTablet();
		
		// return이기 때문에 콘솔창에 안보임
		// 출력을 하고 싶다면 무조건 sysout이 나와야됨!
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		// toString() 오버라이딩 했기 때문에 주소값이 아닌 값 출력문이 나온다
		 */
		
		// 2. 다형성을 적용했을 경우 (ElectronicShop2)
		ElectronicShop2 es = new ElectronicShop2();
		
		// 이번에는 내가 필요한 메소드 먼저 전부 써놓고 이따 짜자
		es.insert(new Desktop("Samsung", "데땁", 1200000, "gtx1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 조회용 메소드 => select
		// 이번에는 3개 다 이름을 select로 짜보자
		
		// es.select(인덱스값);
		// Desktop d = es.select(0);
		// 실제로 들어있는 값은 Desktop 객체가 맞으나 반환형은 Electronic이라서 맞춰줘야함
		// 문제가 되는 부분을 형변환 해줘야함
		
		/*
		Desktop d = (Desktop)es.select(0);
		NoteBook n = (NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2);
		*/
		// 이런걸 다운캐스팅이라고 한다
		
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);
		
		//System.out.println(d);
		// 위아래 둘다 가능
		
		// 그럼 toString() 할때 부모에 있는 toString을 불러오지 못할까?
		// 왜? => 동적바인딩 때문에
		
		System.out.println(d/*toString()*/);
		System.out.println(n);
		System.out.println(t);
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입 배열로 다양한 자식객체들을 받을 수 있음(Electronic => Desktop, NoteBook, Tablet)
		 * 2. 메소드 정의시 매개변수로(Electronic any) 다형성을 적용하게 되면 메소드 개수가 확 줄어든다!
		 * 3. 필수로 써야하는 곳이 있음 => 추상클래스(인터페이스)
		 */
	}

}
