package com.kh.chap01_list.part01.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {

		// <Music>으로 제네릭 설정함 E == Music
		
		// ArrayList list = new ArrayList();
		// ArrayList<Music> list = new ArrayList<>(); // 뒤에 <Music> 생략 가능
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		// list.add("가보자고"); // 다른 타입 담기 불가
		
		System.out.println(list);
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println(list);
		
		List<Music> sub = list.subList(0, 2);
		
		list.addAll(sub);
		
		System.out.println(list);
		
		Music m = list.get(0);
		System.out.println(m);
		
		System.out.println(list.get(1).getTitle());
		
		for (Music o : list) {
			System.out.println(o);
		}

		/*
		 *  제네릭<>을 사용하는 이유
		 *  1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 *  2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환 하는 절차를 없애기 위해 
		 */
	}

}
