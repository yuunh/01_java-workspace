package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {

		/*
		 * java.util.Date
		 */
		
		// 기본 생성자를 통해 생성 => 현재 날짜 및 시간(시스템 날짜 및 시간)을 담고 있음
		Date date1 = new Date();
		System.out.println(date1);
		
		// 내가 원하는 날짜 (2022년 10월 18일)로 셋팅
		// 1) 매개변수 생성자를 통해서 생성하는 방법
		Date date2 = new Date(2022-1900, 10-1, 18);
		System.out.println(date2);
		// 옛날에 만든거라 좀 이상함... 계산해서 값을 넘겨줘야한다
		
		// 2) 기본생성자로 생성한 후 setter 메소드로 값 변경
		date1.setMonth(10-1);
		date1.setDate(18);
		System.out.println(date1);
		
		// 2022년 10월 18일 11시 15분 27초
		
		// 내 입맛대로 포맷을 적용해서 출력 가능
		// java.text.SimpleDateFormat 클래스
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
	}

}
