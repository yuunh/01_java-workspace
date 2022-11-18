package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {

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
			blist.add(nBook);
			System.out.println("도서명 : " + nBook.getTitle() + " 도서가 성공적으로 추가되었습니다.");
		}
	}

	@Override
	public ArrayList<Book> getAllBook() {
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
			if (b.getTitle().contains(title)) {
				search.add(b);
			}
		}
		return search;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> onlysearch = new ArrayList<Book>();
		for (Book b : blist) {
			if (b instanceof Magazine) {
				continue;
			} else {
				onlysearch.add(b);
			}
		}
		return onlysearch;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> onlysearch = new ArrayList<Book>();
		for (Book b : blist) {
			if (b instanceof Magazine) {
				onlysearch.add(b);
			}
		}
		return onlysearch;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> yearinfo = new ArrayList<Book>();
		for (Book b : blist) {
			if (b instanceof Magazine) {
				if (((Magazine) b).getYear() == year) {
					yearinfo.add(b);
				}
			}
		}
		return yearinfo;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> search = new ArrayList<Book>();
		for (Book b : blist) {
			if (b.getPublisher().contains(publisher)) {
				search.add(b);
			}
		}
		return search;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> search = new ArrayList<Book>();
		for (Book b : blist) {
			if (b.getPrice() < price) {
				search.add(b);
			}
		}
		return search;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for (Book b : blist) {
			total += b.getPrice();
		}
		return total;
	}

	@Override
	public int getAvgPrice() {

		return getTotalPrice() / blist.size();
	}
}
