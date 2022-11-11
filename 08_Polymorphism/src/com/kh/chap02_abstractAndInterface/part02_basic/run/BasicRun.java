package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {

		// 부모 : Person
		// 자식 : Mother, Baby
		
		// Person p = new Person(); // 안됨
		
		/*
		Person mom = new Mother("김엄마", 50, 70, "출산");
		Person baby = new Baby("김아기", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat(); // 몸무게 +10 건강도 -10
		baby.eat(); // 몸무게 +3 건강도 +1
		
		mom.sleep(); // 건강도 +20
		baby.sleep(); // 건강도 +3
		
		System.out.println("===== 다음날 =====");
		System.out.println(mom);
		System.out.println(baby);
		*/
		
		// Basic b = new Bacic(); 레퍼런스 변수로는 사용 가능하나 객체 생성은 불가능하다
		
		Basic mom = new Mother("김엄마", 50, 70, "출산");
		Basic baby = new Baby("김아기", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		baby.eat();
		
		mom.sleep();
		baby.sleep();
		
		System.out.println("===== 다음날 =====");
		System.out.println(mom);
		System.out.println(baby);
		
		/*
		 * 클래스에서 클래스를 상속받을 때 : 클래스 extends 클래스 (단일상속만 가능) 			 : 화살표 실선
		 * 클래스에서 인터페이스를 구현할 때 : 클래스 implements 인터페이스1, 인터페이스2, .... : 화살표 점선
		 * 인터페이스에서 인터페이스를 상속 : 인터페이스 extends 인터페이스1, 인터페이스2, ....(다중상속 가능) : 화살표 실선
		 * 
		 * 			|		추상클래스		|		인터페이스
		 * =========================================================
		 * 상속개수	|		단일상속		|		다중상속
		 * ---------------------------------------------------------
		 * 키워드		|		extends		|		implements
		 * ----------------------------------------------------------
		 * 추상메소드	|	추상메소드 0개 이상	|
		 * 표현법/개수	|	명시적으로 abstract	|	묵시적으로 abstract (생략가능)
		 * ----------------------------------------------------------
		 * 일반메소드여부|			o		|			x
		 * ----------------------------------------------------------
		 * 일반필드 여부|			o		|	x : 상수필드만 가질 수 있음(묵시적으로 public static final)
		 *--------------------------------------------------------------------
		 * 
		 * 
		 * extends 일반클래스 --> extends 추상클래스 --> implements 인터페이스
		 * ----------->--------------->---------------->-------------->
		 * 				강제성이 더 짙어짐 ( 규약이 더 쎄진다 )
		 * 
		 */
		
	}

}
