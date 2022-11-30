
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
 * 
 * 		- 클라이언트용 프로그램
 * 		// 반드시 서버의 IP를 받아야 함! => 서버 IP 확인하기
 * 		serverIP = "192.168.30.223";
 * 
 * 		// 서버에 연결 요청 보내는 구문 작성
 * 		// (요청하고자 하는 서버의 IP 주소외 지정된 포트 번호를 제시하면서 소켓 객체 생성)
 * 		socket = new Socket(serverIP, port);
 * 		=> 통신 실패 시 (서버 IP 오입력, 포트 번호 불일치) null 리턴
 *
 * 
 * 
 * ==========================================================================
 * 
 * 	1. 상속이란 ?
 * 		- 중복되는 코드를 하나의 클래스로 관리하여 새로운 클래스에서 상속을 받음으로서
 * 		  보다 적은 양의 코드로 새로운 클래스 작성이 가능하다.	 (유지보수, 생산성 up)
 * 
 * 	2. 다형성이란 ?
 * 		- 부모 클래스 타입 하나로 여러가지 타입의 자식 객체들을 다룰 수 있는 기술
 * 
 * 	3. 오버라이딩 ?
 * 		- 부모 클래스에 있는 메소드를 자식 클래스에서 재정의(재작성)하는 것
 * 		- 특징
 * 			> 부모 클래스와 메소드 이름 동일
 * 			> 매개변수 개수, 자료형, 순서 일치
 * 			> 리턴 타입 동일
 * 			> 접근제한자는 부모 메소드보다 범위가 같거나 넓어야 한다
 * 		- @Override (어노테이션) 
 * 			> 부모 메소드 명이나 매개변수가 수정되거나 자식 메소드 기술 시 오타가 있을 경우 오류가 발생해 알아보기 쉽다!
 * 
 * 	4. 오버로딩 vs 오버라이딩
 * 		- 오버로딩 : 한 클래스 내에서 동일한 이름의 메소드를 여러 개 정의하는 것
 * 				   성립 조건 -> 같은 메소드 이름, 다른 매개변수 선언부 (자료형, 개수, 순서)
 * 		- 오버라이딩 : 부모 클래스에 있는 메소드를 자식 클래스에서 재정의(재작성)하는 것
 * 					 성립 조건 -> 메소드 이름, 매개변수 자료형, 매개변수 개수, 매개변수 순서, 리턴 타입 동일
 * 
 * 	5. String 클래스의 주요 메소드들
 * 		- charAt() : 문자열에서 전달받은 index 위치의 문자만을 추출해서 리턴
 * 		- length() : 문자열의 길이를 리턴
 * 		- substring() : 문자열의 beginIndex 위치에서부터 끝까지의 문자열 추출해서 리턴
 * 		- toUpperCase() : 문자열을 다 대문자로 변환한 값을 리턴
 * 		- toLowerCase() : 문자열을 다 소문자로 변환한 값을 리턴
 * 
 * 		- concat() : 문자열과 전달된 문자열을 하나로 합친 문자열을 리턴
 * 		- contains() : 해당 문자열에 전달받은 문자열이 포함되어 있는지 확인 후 boolean 타입으로 리턴
 * 		- replace() : 문자열에서 첫 번째 index 문자들을 두 번째 index로 변환한 값을 리턴
 * 		- trim() : 문자열의 앞 / 뒤 공백을 제거한 값을 리턴
 * 		- toCharArray() : 문자열을 char형 배열로 바꿔주는 메소드
 * 		- valueOf() : string형으로 바꿔주는 메소드
 * 
 * 	6. split 메소드
 * 		String str = "하이,그래,잘가,응아니야";
 * 		String[] arr = str.split(",");
 * 		for (int i = 0; i < arr.length; i++) {
 * 			System.out.println(arr[i]);
 * 		}
 * 
 * 	7. 추상클래스 vs 인터페이스
 * 		- 추상클래스는 다중 상속이 안되지만 인터페이스는 다중 상속 가능
 * 		- 추상클래스는 extends 인터페이스는 implements
 * 		- 추상클래스는 명시적으로 abstract 메소드 0개 이상 인터페이스 묵시적으로 abstract
 * 		- 추상클래스는 일반 필드를 가질 수 있지만 인터페이스는 상수 필드만 가질 수 있다
 * 
 * 	8. Wrapper 클래스 : 기본 자료형을 객체로 포장해 주는 클래스 (대문자로 시작)
 * 		- Boolean / Character / Byte / Short / Integer / Long / Float / Double
 * 
 * 	9. 문자열 -> int / double 형으로 변환
 * 		- Integer.parseInt("777");
 * 		- Double.parseDouble("777");
 * 
 * 	10. StringTokenizer 메소드
 * 		- countTokens() : 토큰 개수 반환
 * 		- hasMoreTokens() : 토큰 있으면 true, 없으면 false
 * 		- nextToken() : 토큰 하나 가져와서 반환
 * 
 * 	11. Date 함수
 * 		// 기본 생성자를 통해 생성 => 시스템 날짜 및 시간을 담고 있다
 * 		Date date1 = new Date();
 * 		// 2022년 10월 18일 11시 15분 27초로 출력하는 방법
 * 		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
 * 		String formatDate = sdf.format(date1);
 * 		System.out.println(formatDate);
 * 
 * 	12. 예외처리
 * 		- ArithmeticException : 나누기 연산 시 0으로 나누려 할 때 에러
 * 		- NullPoicterException : 참조 변수가 null로 초기화된 상황에서 null에 접근하려고 할 때 에러
 * 		- NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정할 때 에러
 * 		- ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스를 가지고 접근할 때 에러
 * 		- ClassCastException : 허용할 수 없는 형변환이 진행될 때 에러
 * 
 * 		=> 부모 타입으로 자식 객체를 다룰 수 있는 다형성 때문에 
 * 		=> RuntimeException으로 받을 수 있다!
 * 
 * 	13. try ~ catch
 * 		try {
 * 			// 예외가  발생할 가능성이 있는 코드 기술
 * 		} catch () {
 * 			// try 구문에서 예외 발생 시 해당하는 예외에 대한 처리 기술
 * 			// 여러 개의 예외 처리가 가능하나 예외 간의 상속 관계 고려
 * 		} finally {
 * 			// 예외 발생 여부와 관계없이 꼭 처리해야 하는 로직 기술
 * 			// 중간에 return문을 만나도 finally 구문은 실행되지만
 * 			// System.exit(); 를 만나면 무조건 프로그램 종료
 * 			// 주로 java.io나 java.sql 패키지의 메소드 처리 시 이용
 * 		}
 * 
 * 	14. set 계열 함수
 * 		- add() : 추가
 * 		- isEmpty() : 비어있으면 true, 아니면 false
 * 		- size() : 저장되어 있는 객체 수 반환
 * 
 * 	15. map 계열 함수
 * 		- put() : 추가
 * 		- get() : 객체 반환
 * 		- set() : 수정
 * 		- keySet() : 저장된 키들만 추출해서 Set에 담기 -> 이터레이터(Iterator)를 통해 접근
 * 		- entrySet() : 키-값들을 추출해서 Set에 담기 -> 이터레이터(Iterator)를 통해 접근
 * 	
 * 		- size() : 객체 수 반환
 * 		- replace() : 수정
 * 		- remove : 삭제
 * 
 * 	16. List 계열 함수
 * 		- add() : 추가
 * 		- set() : 수정
 * 		- size() : 객체 수 반환
 * 		- remove() : 삭제
 * 		- get() : 객체 반환
 * 
 * 		- addAll() : 통째로 추가
 * 		- isEmpty() : 비어있으면 true, 아니면 false
 * 		- clear() : 통째로 삭제
 * 
 * 	17. 배열의 단점과 컬렉션의 등장
 * 		- 배열은 크리 지정해야 하지만, 컬렉션은 지정해줄 필요 없다
 * 		- 배열은 중간에 값을 추가하거나 삭제하는게 복잡하지만, 컬렉션은 메소드 호출만으로 간단하게 구현 가능하다
 * 		- 배열은 한 공간에 한 타입의 데이터들만 저장 가능하지만, 컬렉션은 한 공간에 여러 타입의 데이터들 저장 가능하다
 * 
 */
