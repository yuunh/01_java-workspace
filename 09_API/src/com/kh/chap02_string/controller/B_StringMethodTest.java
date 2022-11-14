package com.kh.chap02_string.controller;

public class B_StringMethodTest {

	public void method1() {
	
	String str1 = "Hello World";
	
	// 메소드명(매개변수) : 반환형
	
	// 1. 문자열.charAt(int index) : char
	// 	  문자열에서 전달받은 index 위치의 문자만을 추출해서 리턴
	
	char ch = str1.charAt(3);
	System.out.println("ch : " + ch);
	
	// 2. 문자열.concat(String str) : String
	//	  문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열 리턴
	
	String str2 = str1.concat("!!!");
	System.out.println("str2 : " + str2);
	
	String str3 = str1 + "!!!";
	System.out.println("str3 : " + str3);
	
	System.out.println("str2와 str3가 일치합니까? " + (str2 == str3));
	// 근데 아까전에 StringPool에서 같은 글자면 같은 주소 아닌가요?
	// concat 열어보면 new 있음 => 새로운 주소갑 heap
	// str3만 StringPool에 있음!
	
	// 문자열.equals(Object obj) : boolean
	// 문자열과 전달된 또 다른 문자열 가지고 주소값 비교가 아닌 실제 문자열 가지고 동등비교 한다
	
	System.out.println("str2와 str3가 일치합니까?(equals) " + str2.equals(str3));
	
	// 4. 문자열.contains(CharSequence s) : boolean
	System.out.println("str1에 Hello 문자열이 포함되어 있습니까? " + str1.contains("Hello"));
	System.out.println("str1에 Hello 문자열이 포함되어 있습니까? " + str1.contains("bye"));
	
	// 5. 문자열.length() : int
	System.out.println("str1의 길이 : " + str1.length());
	
	// 6. 문자열.substring(int beginIndex) : String => 문자열의 beginIndex 위치에서부터 끝까지의 문자열 추출
	//	  문자열.substring(int beginIndex, int endIndex) : String
	//						=> 문자열의 beginIndex 위치에서부터 denIndex -1 위치까지의 문자열을 추출
	// Hello World
	System.out.println(str1.substring(3));
	System.out.println(str1.substring(3, 7));
	
	// ** Quiz
	// 1. Worl만 추출 + concat() !를 붙여서 => Worl!
	// 2. contains 함수를 이용해서 !가 포함돼있는지 여부 추출
	
	String str0 = str1.substring(6, 10).concat("!");
	System.out.println("str0 : " + str0);
	System.out.println("str0에 !가 포함되어 있습니까? " + str0.contains("!"));
	
	// 7. 문자열.replace(char oldChar, char newChar) : String
	//	  문자열에서 oldChar 문자들을 newChar로 변환한 새 문자열 리턴
	
	// str1 = Hello world
	String str4 = str1.replace('l', 'c');
	System.out.println("str4 : " + str4);
	System.out.println("str1이 변경됐나? " + str1); // 변경안됨
	
	// 8. 문자열.toUpperCase() : String => 문자열을 다 대문자로 변경한 새 문자열 리턴
	//	  문자열.toLowerCase() : String => 문자열을 다 소문자로 변경한 새 문자열 리턴
	
	String str5 = str1.toUpperCase();
	System.out.println("str5 : " + str5);
	System.out.println("Lower : " + str5.toLowerCase());
	
	/*
	 * System.out.print("계속하시겠습니까? (y/n) : ");
	 * char ch = sc.nextLine().toUpperCase().charAt(0); // 'N', 'Y'
	 * 
	 * char ch = sc.nextLine().charAt(0).toUpperCase(); // 뒤에 써도 되나요? 안됨!!
	 * => String 클래스에서 제공하는 함수임!!
	 * 
	 * if(ch = 'N') {
	 *		// 프로그램 종료
	 * }
	 */
	
	// 9. 문자열.trim() : String
	// 	  문자열 앞 뒤 공백을 제거시킨 새 문자열 리턴
	
	String str6 = "   JA VA   ";
	System.out.println("str6 :" + str6.trim());
	
	// 10. 문자열.toCharArray() : char[]
	char[] arr = str1.toCharArray();
	System.out.println(arr[3]);
	
	// 11. String.valueOf(char[] data) : String
	System.out.println(String.valueOf(arr));
	
	}
}
