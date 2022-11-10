package kh.com.chap01_poly.part02_electronic.run;

import kh.com.chap01_poly.part02_electronic.controller.ElectronicShop1;
import kh.com.chap01_poly.part02_electronic.model.vo.Desktop;
import kh.com.chap01_poly.part02_electronic.model.vo.NoteBook;
import kh.com.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {

		// 실행용 클래스는 납품업체라고 생각!!
		
		// 1. 다형성 적용 안했을 경우 (ElectronicShop1)
		ElectronicShop1 es = new ElectronicShop1();
		// 객체 생성하는 순간 해당 클래스에 제시된 세가지의 필드가 메모리 상에 할당
		
		es.insert(new Desktop("Samsung", "데땁", 1200000, "Geforce1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 조회
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d/*toString()*/);
		System.out.println(n);
		System.out.println(t);
	}

}
