package kh.com.chap01_poly.part02_electronic.controller;
// 다형성 적용 안했을때!!

import kh.com.chap01_poly.part02_electronic.model.vo.Desktop;
import kh.com.chap01_poly.part02_electronic.model.vo.NoteBook;
import kh.com.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicShop1 {

	// 용산 전자상가에 있는 가게
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// 세개의 제품을 갖다 놓기 위해 자리만 마련해둠
	
	// 오버로딩
	public void insert(Desktop d) { // Desktop d = new Desktop(~~~~);
		desk = d;
	}
	
	public void insert(NoteBook n) { // NoteBook n = new NoteBook(~~~~);
		note = n;
	}
	
	public void insert(Tablet t) { // Tablet t = new Tablet(~~~~);
		tab = t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
}
