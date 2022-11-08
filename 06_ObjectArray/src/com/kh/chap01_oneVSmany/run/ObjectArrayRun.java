package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 객체 배열 활용해서 해보기
		// 세 개의 Book 객체를 관리한다면?
		
		// int[] arr = new int[3];
		Book[] books = new Book[3];

		for (int i = 0; i < books.length; i++) {

			System.out.println(i + 1 + "번째 도서정보 입력");

			System.out.print("도서명 : ");
			String title = sc.nextLine();

			System.out.print("저자명 : ");
			String author = sc.nextLine();

			System.out.print("가격 : ");
			int price = sc.nextInt();

			sc.nextLine();

			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			/*
			books[0] = new Book(어저구);
			books[1] = new Book(저저구);
			books[2] = new Book(어라라);
			*/
			books[i] = new Book(title, author, price, publisher);
			
		} // 객체 생성 끝
		/*
		System.out.println(books[0].information());
		System.out.println(books[1].information());
		System.out.println(books[2].information());
		*/

		// 전체 도서 정보 조회하기 => 반복문 활용 가능
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();

		/*
		if (search.equals(books[0].getTitle())) {
			System.out.println(books[0].information());
		}
		if (search.equals(books[1].getTitle())) {
			System.out.println(books[1].information());
		}
		if (search.equals(books[2].getTitle())) {
			System.out.println(books[2].information());
		}
		*/
		
		for (int i = 0; i < books.length; i++) {
			if (search.equals(books[i].getTitle())) {
				System.out.println(books[i].information());
			}
		}
	}

}
