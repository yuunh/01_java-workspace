package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public abstract class BookController implements BookManager  {
	
	private ArrayList<Book> blist = new ArrayList<Book>();
	
	public BookController() {
		
	}
	
	@Override
	public void addBook(Book nBook) {
		boolean find = true;
		for (Book b : blist) {
			if (b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명 : " + nBook.getTitle() + " 도서는 이미 소장하고 있는 책입니다.");
				find = false;
				break;
			}
		}
			if (find == true) {
				bList.add(nBook);
				System.out.println("도서명 :" + nBook.getTitle() + " 도서가 성공적으로 추가되었습니다.");
			}
	}
	
	@Override
	public ArrayList<Book> getAllBook(); {
		return blist;
	}
	
	@Override
	public Book searchBookBybNo(String bNo) {
		Book search = new Book();
		for (Book b : blist) {
			if (b.getbNo().equals(bNo)) {
				search = b;
			}
		}
		return search;
	}
	
	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> search = new ArrayList<Book>();
		for (Book b : blist) {
			if (b.getTitle().equals(title)) {
				search = add(b);
			}
		}
		return search;
	}
	
	@Override
	public ArrayList<Book> onlySearchBook(){
		ArrayList<Book> onlysearch = new ArrayList<Book>();
		for (Book b : blist) {
			if (b.) {
				
			}
		}
	}
	
	@Override
	public ArrayList<Book> onlySearchMagazine() {
		
	}
	
	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		
	}
	
	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		
	}
	
	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		
	}
	
	@Override
	public int getTotalPrice() {
		return 0;
	} 
		
	@Override
	public int getAvgPrice() {
		return 0;
	}
	
}
