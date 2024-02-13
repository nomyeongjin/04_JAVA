package edu.kh.collection.pack4.model.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {
	
	/* Wrapper Class
	 * 
	 *  - wrap : 감싸다, 포장하다
	 *  
	 *  - 기본 자료형을 객체로 감싸는 클래스
	 *    -> 기본 자료형의 객체화
	 *    
	 *    -> 왜? 컬렉션처럼 객체만 취급하는 상황에서 
	 *    		 기본 자료형도 취급 가능한 형태로 바꾸기 위해서
	 *    
	 *    boolean    -->  Boolean
	 *    byte       -->  Byte
	 *    short      -->  Short
	 *    long       -->  Integer
	 *    int        -->  Long
	 *    float      -->  Float
	 *    double     -->  Double
	 *    char       -->  Character
	 *    
	 *   * Boxing, Unboxing을 자동으로 수행되도록 구현되어있음
	 *    -> Auto Boxing, Auto Unboxing
	 *    
	 *    
	 *  + Wrapper Class를 이용해 객체화 되었을 때
	 *    추가적인 필드, 기능을 제공함
	 *  
	 *  
	 */
	
	public void method1() {
		int num1 = 100; // int
//		Integer wrap1 = new Integer(num1);//삭제 예정인 방법
		
		Integer wrap1 = num1; // 컴파일러가 Auto Boxing 수행 코드 추가
							  //                 (int) num1-> (Integer) num1
		int num2 = wrap1.intValue(); // 정수값 반환 (추천 x)
		int num3 = wrap1; // 컴파일러가 Auto UnBoxing 수행 코드 추가
		  //                 (Integer) wrap1-> (int) wrap1에 저장된 값
		
		long num4 = 10000000000L;
		Long Wrap2 = num4; // Auto Boxing
		Long num5 = Wrap2; // Auto UnBoxing
		
		// Integer 객체만 저장하는 List
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1000); // (int) 1000 -> (Integer) 1000/ Auto Boxing
		list.add(2000); // (int) 1000 -> (Integer) 1000/ Auto Boxing
		list.add(3000); // (int) 1000 -> (Integer) 1000/ Auto Boxing
		
		
		// print 구문 내에서
		// Wrapper 클래스로 만든 객체를 참조할 때
		// .toString() 호출하는 것이 아닌
		// Auto Unboxing을 진행해서 기본 자료형으로 변경한다.
		System.out.println(list.get(0)+list.get(1)+list.get(2));
		
	}
	
	/**
	 * Wrapper Class가 제공하는 필드, 메서드
	 * -> 대부분 static!!!
	 * 	 -> 클래스명.필드명 / 클래스명.메서드명() 사용
	 */
	public void method2() {
		
		System.out.println("byte의 용량 : "+Byte.BYTES + "바이트");
		System.out.println("byte의 용량 : "+Byte.SIZE + "비트");
		System.out.println("byte의 최대값 : "+Byte.MAX_VALUE);
		System.out.println("byte의 최소값 : "+Byte.MIN_VALUE);
		
		// 실수형만 사용가능
		System.out.println(Double.NaN);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
		
		// 논리형은 true/false밖에 없음
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		
		// ------------------------------------------------------------------------------
		
		// String -> 기본 자료형 변환
		System.out.println("-------------------------------------------------------");
		System.out.println("[String -> 기본 자료형 변환]");
		
		// HTML 연결 시 (요청 데이터 처리) 많이 사용
		// -> HTML에 관련된 모든 값은 String
		// 단, char(Character)는 별도로 존재하지 않음

		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3"); // 중요
		long l = Long.parseLong("4"); // 중요
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2"); // 중요
		boolean bool = Boolean.parseBoolean("true");
		
		System.out.println("변환 확인");
		
		System.out.println("-------------------------------------------------------");
		System.out.println("[기본 자료형 -> String 변환]");
		
		// Wrapper Class를 이용하는 방법
		int test1 = 400;
		String change1 = Integer.valueOf(test1).toString();
		
		double test2 = 4.321;
		String change2 = Double.valueOf(test2).toString();
		
		// String 이어쓰기를 이용한 방법
		// -> 코드는 짧으나 효율이 좋지 않음(속도 down, 메모리 소모 up)
		long test3 = 12345678910L;
		String change3 = test3 + ""; // long + String -> String + String -> 이어쓰기
		
		
		
		
		
		
	}
	
	/**
	 * String의 불변성(변하지 않는 성질 == 상수)
	 */
	public void method3() {
		
		//System.identityHashCode(str)
		// -> 주소 값을 이용해서 만든 해시 코드(식별번호)
		// -> 같은 객체에 저장된 값이 변했다면 주소는 일정해야한다.
		// -> identityHashCode도 일정해야한다.
		
		String str = "hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str = "world";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str+="!!!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		// -> identityHashCode가 다 다른 값
		// --> str이 참조하고 있는 객체가 변하고 있다.
	}
}
