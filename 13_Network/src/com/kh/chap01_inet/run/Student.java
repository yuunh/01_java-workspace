/*
 * < 문제해결과 시나리오 >
 * 
 * 	1. 파일 입출력
 * 
 * 		1-1 파일 출력
 * 
 * 		try {
 * 
 * 			1. 출력 스트림 생성 : 파일명 지정 필수, 이어 쓰려면 true 작성!
 * 			fw = new FileWriter("b_char.txt", true);
 * 
 * 			2. write() 메소드를 이용해서 데이터 출력
 * 			fw.write(' ');
 * 			fw.write('A');
 * 
 * 		} catch (IOException e) {
 * 			e.printStackTrace();
 * 		
 * 		} finally {
 * 			try {
 * 
 * 				3. 스트림 반납 필수!!
 * 				fw.close();
 * 
 * 			} catch (IOException e) {
 * 				e.printStackTrace();
 * 		}
 * 
 * 
 * 		1-2 파일 입력
 * 
 * 		try {
 * 
 * 			1. 입력 스트림 생성 : 파일명 지정 필수!
 * 			fr = new FileReader("b_char.txt");
 * 
 * 			2. read() 메소드를 이용해서 데이터 출력
 * 			while (fr.read()) {
 * 				System.out.println();
 * 		}
 * 		} catch (IOException e) {
 * 			e.printStackTrace();
 * 		
 * 		} finally {
 * 			try {
 * 
 * 				3. 스트림 반납 필수!!
 * 				fr.close();
 * 
 * 			} catch (IOException e) {
 * 			e.printStackTrace();
 * 		}
 * 
 * 
 * 	2. 소켓 통신
 * 		
 * 		InetAddress localHost = InetAddress.getLocalHost();
 * 		// 로컬호스트 (localHost) 라고 써있으면 내 IP주소 / 내 PC명을 반환한다
 * 
 * 		- 서버용 프로그램
 * 		// 포트 번호 지정 (서버 측에서 몇 번 포트로 통로를 열 건지 반드시 포트 번호 명시해줘야함)
 * 		int port = 3010;
 */















< 문제해결과 시나리오 >

1. 파일 입출력

1-1. 파일 출력

=> 파일 출력에서 가장 중요한점!!!

1) 출력스트림 생성 : 파일명 꼭 지정해줘야 하고, 이어쓰려면 true 조건 무조건 써야한다!! 안쓰면 안이어짐!!
2) write() 메소드로 출력
3) 반드시 무조건 반납을 해야함!! 안하면 오류남!! => *finally 구문에 close() 작성 필수

1-2. 파일 입력

=> 파일 입력에서 가장 중요한점!!!

1) 입력스트림 생성 : 파일명 꼭 지정!!
2) read() 메소드로 입력스트림
3) 반드시 무조건 반납을 해야함!! 안하면 오류남!! => *finally 구문에 close() 작성 필수

-----------------------------------------------------------------------

2. 소켓 통신

InetAddress localHost = InetAddress.getLocalHost();
=> 로컬호스트 라고 써있으면 그건 바로 내 로컬. 즉 나의 아이피, pc 이름 가지고 오는 것

** 서버에서 가장 중요한점!!!

=> 서버용 프로그램에서는 몇 번 포트로 통로를 열건지 포트 번호를 반드시 명시해줘야함!!
// 포트 번호 지정 (서버측에서 몇 번 포트로 통로를 열거냐)
int port = 3010;

** 클라이언트에서 가장 중요한점!!!

=> 반드시 서버의 아이피를 받아야함!! => 서버 아이피 확인
serverIP = "192.168.30.223";
// 서버에 연결 요청 보내는 구문(요청하고자 하는 서버의 IP 주소와 지정된 포트번호를 제시하면서 소켓 객체 생성)
socket = new Socket(serverIP, port);

만약에 연결이 잘 안된다는 것은 서버의 아이피가 아닌 다른 아이피를 오입력, 포트 번호가 틀렸다는 거임
=> 통신 실패 시 null을 리턴한다.

-----------------------------------------------------------------------

< 서술형 >

1. 상속이란 ?
- 중복되는 코드들을 하나의 클래스로 관리하여 새로운 클래스에서 상속을 받음으로서
  보다 적은 양의 코드로 새로운 클래스 작성이 가능하다.
  
2. 다형성이란 ?
- 부모클래스 타입 하나로 여러 자식 객체를 다룰 수 있는 기술

3. 오버라이딩
- 부모클래스에 있는 메소드를 자식 클래스에서 재정의하는 것
> 부모클래스와 메소드 이름 동일
> 매개변수 자료형 개수 순서 일치
> 리턴타입 동일
> 접근제한자는 부모랑 같거나 더 넓어야함
> @Overide 달면 부모클래스에서 수정됐을 때 오류 발생

4. 오버로딩 vs 오버라이딩
- 오버로딩 : 한 클래스 내에서 동일한 메소드 명으로 기술하는 것
		(단, 매개변수 자료형, 개수, 순서 달라야함)
- 오버라이딩 : 부모 클래스에 있는 메소드를 자식 클래스에서 재정의하는 것
		(매개변수 자료형, 개수, 순서 같아야함)
		
5. String 클래스의 주요 메소드들
- charAt()
- length()
- substring()
- toUpperCase()
- toLowerCase()

6. String str = "하이,그래,잘가,응아니야";
str을 구분자를 통해 문자열을 분리 후 -> 배열에 담고
-> 그래 를 출력해보세요. (split())

7. 인터페이스 추상클래스 차이점
1) 추상클래스는 다중 상속이 안되지만 인터페이스는 다중 상속 된다.
2) 추상클래스는 extends 인터페이스는 implements
3) 추상클래스는 abstract 메소드 0개 이상, 인터페이스는 전부 abstract
4) 추상클래스는 명시적으로 abstract, 인터페이스는 묵시적으로 abstract
5) 추상클래스는 일반필드를 가질 수 있지만 인터페이스는 상수필드만 가질 수 있다.

8. Wrapper 클래스 8가지
- Boolean, Charater, Byte, Short, Integer, Long, Float, Double

9. 문자열 "777"을 int 자료형 777로 변경하는 방법?
Integer.parseInt("777");
더블은? Double.parseDouble(값);

10. StringTokenizer 메소드
- countTokens() : 토큰 개수 반환
- hasMoreTokens() : 토큰 있으면 true 없으면 false
- nextToken() : 토큰 하나 가져와서 반환

11. Date 함수
Date date1 = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
String formatDate = sdf.format(date1);
System.out.println(formatDate);

12. 예외처리 관련
- ArithmeticException : 0으로 나누려 할 때 에러
- NullPointerException : null에 접근하려고 할 때 나는 에러
- ArrayIndexOutOfBoundsException : 배열에서 부적절한 인덱스 접근하려 할 때 발생되는 에러
- NegativeArraySizeException : 배열의 크기를 음수로 제시할 때 나는 에러

=> 이런 에러들은 전부 RuntimeException 로 받을 수 있음!
=> 왜? 부모타입으로 자식객체를 다룰 수 있는 다형성 때문

13. try-catch
try{
	
}catch{
	// 야 에러났다!!!
	에러 발생시 적고 싶은 문구가 있다면 반드시 catch 문에 작성할 것!!
}

14. set 계열 함수
- add() : 추가
- isEmpty() : 비어있으면 true, 아니면, false
- size() : set에 저장되어있는 객체 수 반환

15. map 계열 함수
- put() : 추가
- get() : 객체 반환
- set() : 수정 변경
- keySet() : 저장된 키들만 추출해서 set에 담아준다. => 담은 후 이터레이터를 통해 접근
- entrySet() : 키-값들을 추출해서 set에 담아준다. => 담은 후 이터레이터를 통해 접근

16. List 계열 함수
- add() : 추가
- set() : 수정
- size() : 객체 수 반환
- remove() : 삭제
- get() : 객체 반환

17. 자바에서의 배열과 컬렉션의 차이점
> 배열은 크기 지정해야하지만, 컬렉션은 지정 안해도 된다.
> 배열은 중간에 값을 추가하거나 삭제하는게 복잡하지만
  컬렉션은 메소드 호출만으로도 간단하게 구현 가능하다.
> 배열은 한가지 타입에 여러개 데이터를 보관할 수 있지만
  컬렉션은 여러타입에 여러개 데이터 보관 가능하다.