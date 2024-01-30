package edu.kh.condition.ex;
import java.util.Scanner;


/**
 * 조건문 기능용 클래스
 */
/**
 * 
 */
public class ConditionEx {
 
	// 필드 (객체의 속성 == 객체가 가지고 있는 값/변수)
	Scanner sc = new Scanner(System.in);
	
	/**
	 *  나이를 입력 받아
	 *  19세 이상은 성인, 미만은 성인이 아닙니다.
	 */
	public void method1 () {
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age>=19) {
			System.out.println("성인");

		}else {
			System.out.println("성인이 아닙니다.");
		}
	}
	
	/**
	 * 나이를 입력받아
	 * 13세 이하면 "어린이"
	 * 13세 초과 18세 이하 "청소년"
	 * 19세 이상 "성인"
	 */
	public void method2() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age<=13) result = "어린이";
		else if(age <=18) result = "청소년";
		else result = "성인";
		
		System.out.println(result);
	}
	
	/**
	 * 달(월)을 입력 받아 해당 계절 출력하기
	 * <ul>
	 * <li>봄 : 3,4,5</li>
	 * <li>여름 : 6, 7, 8</li>
	 * <li>가을 : 9, 10, 11</li>
	 * <li>겨울 12, 1, 2</li>
	 * </ul>
	 */
	public void method3() {
		System.out.println("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		if(month >= 3 && month <= 5) result = "봄";
		else if(month >= 6 && month <= 8) result = "여름";
		else if(month >= 9 && month <= 11) result = "가을";
		else if(month ==12 || month ==2 || month ==1) result = "겨울";
		else result = "잘못 입력하셨습니다.";
		System.out.println(result);
		
	}


	/**
	 *	생각하는 순서를 바꿈 
	 */
	public void method3a() {
		System.out.println("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		if(month < 1 || month > 12)  result = "잘못 입력";
		else if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
		System.out.println(result);
		
	}
	
	/**
	 *	잘못된 경우에 메서드를 중간에 종료
	 */
	public void method3b() {
		System.out.println("달(월) 입력 : ");
		int month = sc.nextInt();
		
		
		
		if(month < 1 || month > 12) {
			System.out.println("잘못 입력");
			return; // 메서드를 종료하고 호출한 곳으로 돌아감
		}
		String result;
		if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
		System.out.println(result);
		
	}

	/**
	 *	잘못된 경우에 메서드를 중간에 종료
	 */
	public void method3c() {
		System.out.println("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		switch(month) {
//		case 3: case 4: case 5: result="봄"; break;
		case 3, 4, 5: result = "봄"; break;
		case 6, 7, 8 : result = "여름"; break;
		case 9, 10, 11 : result = "가을"; break;
		case 12, 1, 2 : result = "겨울"; break;
		default : result = "잘못 입력";
		}
		System.out.println(result);
		
	}
	
	
	/**
	 * P/F 판별하기
	 * <pre>
	 * 중간고사, 기말고사, 과제 점수를 입력 받아
	 * 총점 60점 이상일 경우 PASS, 아니면 FAIL
	 * 
	 * - 중간고사(40%), 기말고사 (50%), 과제 (10%)
	 * - 각각 100점 만점
	 * 
	 * + PASS인 경우를 변경
	 * 90점 이상 : A
	 * 80점 이상 : B
	 * 70점 이상 : C
	 * 60점 이상 : D
	 * 
	 * </pre>
	 * 
	 */
	public void method4() {
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("중간고사 점수 : ");
		double mid = sc.nextInt();
		System.out.println("기말고사 점수 : ");
		double last = sc.nextInt();
		System.out.println("과제 점수 : ");
		double hw = sc.nextInt();
		
		
		double sum = mid*0.4+last*0.5+hw*0.1;
		String result=null;
		
		// 변수에 아무런 값도 대입되지 않은 경우 사용 불가능(에러)
		// 해결 1) 모든 경우에 변수에 값을 대입
		// 해결 2) 변수 선언 시 특정한 값으로 초기화 진행
		//        -> 숫자는 0, String 은 null / "", boolean은 false
		
		if(sum >= 60) {
			switch((int)(sum/10)) {
			case 10 : case 9 : result = "A"; break;
			case 8 : result = "B"; break;
			case 7 : result = "C"; break;
			case 6 : result = "D"; break;
			}
		}else result = "FAIL";
		
//		if(sum<0||sum>100) {
//			System.out.println("0~100 사이의 숫자만 입력해주세요.");
//			return;
//		}
//		
//		if(sum>=90)	result = "A";
//		else if(sum>=80) result = "B";
//		else if (sum>=70) result = "C";
//		else if(sum>=60) result = "D";
//		else result = "FAIL";
		
		System.out.println(result);
		System.out.printf("%s 님의 총점은 %.0f점, 학점 %s입니다.",name,sum,result);
		
	}
	
	
	/**
	 * <pre>
	 * 	국어, 영어, 수학, 사탐, 과탐, 점수를 입력 받아
	 * 40점 미만 과목이 있으면 FAIL
	 * 평균이 60점 미만인 경우도 FAIL
	 * 
	 * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
	 * 
	 * [출력 예시]
	 * 
	 * 1) 40점 미만 과목이 존재하는 경우
	 * 	FAIL [40점 미만 과목 : 국어 영어] 
	 * 
	 * 2) 평균 60점 미만인 경우
	 * 	FAIL [점수 : 50.4 (평균 미달)]
	 * 
	 * 3) PASS인 경우
	 * PASS [점수 : 83.4 / 100]
	 * </pre>
	 */
	public void method5() {
		System.out.println("국어 : ");
		int kr = sc.nextInt();
		System.out.println("영어 : ");
		int en = sc.nextInt();
		System.out.println("수학 : ");
		int math= sc.nextInt();
		System.out.println("사탐 : ");
		int sociel = sc.nextInt();
		System.out.println("과탐 : ");
		int science = sc.nextInt();
		
		double sum = kr+en+math+sociel+science;
		double average = sum/5;

		if(kr <40 || en<40||math <40||sociel<40||science<40) {
			System.out.print("FAIL [ 40점 미만 과목 : ");
			if(kr < 40)System.out.print("국어 ");
			if(en < 40)System.out.print("영어 ");
			if(math < 40)System.out.print("수학 ");
			if(sociel < 40)System.out.print("사탐 ");
			if(science < 40)System.out.print("과탐 ");
			System.out.print("]");
			
		}else {
			if(average < 60) {
				System.out.printf("FAIL [점수 : %.1f (평균 미달)]",average);
			}else {System.out.printf("PASS [점수 : %.1f / 100]",average);}
			
		}
		
		
	}
	
	
	
	
}