package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		int[] arr = new int[4];
		System.out.println(arr); // [I@7d6f77cc
		System.out.println(arr.hashCode()); // 2104457164 // 10진수 형태 주소값
		// Object hashCode() => 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어서 반환
		
		// Object equals() 	 => 두 객체의 "주소값"을 비교해서 일치하면 true, 일치하지 않으면 false 반환
		
		// String hashCode() => "실제 담긴 문자열"을 가지고 10진수 형태로 만들어서 반환
		
		// String equals() 	 => "실제 담긴 문자열"을 가지고 비교해서 일치하면 true, 일치하지 않으면 false 반환
		
		HashSet hs1 = new HashSet();
		// HashSet<String> hs1 = new HashSet<String>(); // 노란줄 사라지게 하려면..
		
		hs1.add("반갑습니다");
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1); 
		// [반갑습니다, 안녕하세요, 여러분] // 저장 순서 유지 안됨(인덱스 개념 없음), 중복된 데이터(동일객체) 보관 불가능
		
		HashSet<Student> hs2 = new HashSet<Student>();
		
		// 존잘월드 3명이 산다고 가정을 해보자
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("차은우", 26, 85));
		hs2.add(new Student("주지훈", 24, 20));
		hs2.add(new Student("공유", 43, 100));
		
		System.out.println(hs2); 
		// 저장 순서 유지 안됨(인덱스 개념 없음), 중복 제거 안됨 => 왜? 동일객체로 판단이 안되고 있어서..!
		
		// HashSet 이라는 공간에 객체가 추가될 때마다 동일객체인지 비교!
		// 동일객체 : 각 객체마다 hashCode() 호출 결과가 일치하고, equals() 비교시 true일 경우!
		
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).hashCode());
		// 재정의한 hashCode() 메소드에 의해 둘다 결과 똑같음 => hashCode() 메소드 주석 후 확인해볼것!
		
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100)));

		// hs2.get(); => 인덱스의 개념도 없고 get메소드 자체가 정의되어있지 않음 (한 객체만 뽑아올 수 없다)
		
		// HashSet에 담긴 모든 객체들에 순차적으로 접근
		// 1. for문 사용 가능 (단, 향상된 for문(for each문)만 가능)
		
		for (Student s : hs2) { // 제네릭 설정 안하면 Object 형으로 선언해야함
			System.out.println(s);
		}
		/* 단순 for문 사용 불가
		for (int i = 0; i < hs2.size(); i++) {
			System.out.println(들어갈 코드가 없음);
		}
		*/
		
		System.out.println("======================================");
		
		// 2. ArrayList에 담아준 다음 ArrayList를 반복문 돌려가며 접근
		// ArrayList에 담는 첫번째 방법 : ArrayList 생성 후 addAll() 메소드 이용해서 통째로 추가하기
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// ArrayList에 담는 두번째 방법 : ArrayList 생성과 동시에 통째로 추가하기
		ArrayList<Student> list2 = new ArrayList<Student>(hs2);
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		// 근데 이거 왜 배우는 걸까
		// 중복된 데이터가 들어오면 절대 안되는 경우 사용 => 근데 거의 안쓰임...
		
		System.out.println("======================================");
		
		// 3. Iterator 반복자를 이용해서 순차적으로 접근
		Iterator<Student> it = hs2.iterator();
		while (it.hasNext()) { 
			Student s = it.next();
			System.out.println(s);
		}
		
		// it.next(); // 오류 발생 // NoSuchElementException // 더이상 가져올 요소가 없음
		
	}

}
