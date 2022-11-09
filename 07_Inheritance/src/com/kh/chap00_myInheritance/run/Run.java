package com.kh.chap00_myInheritance.run;

import com.kh.chap00_myInheritance.model.vo.Album;
import com.kh.chap00_myInheritance.model.vo.Book;
import com.kh.chap00_myInheritance.model.vo.Movie;

public class Run {

	public static void main(String[] args) {

		Album a = new Album("Love poem", 14900, 93516, "이담Ent", "아이유");
		
		Book b = new Book("달러구트 꿈 백화점", 13800, 1165341905, "팩토리나인", "이미예");
		
		Movie m = new Movie("라라랜드", 20000, 16127, "판씨네마", "데이미언 셔젤");
		
		System.out.println(a.information());
		System.out.println(b.information());
		System.out.println(m.information());
				
	}

}
