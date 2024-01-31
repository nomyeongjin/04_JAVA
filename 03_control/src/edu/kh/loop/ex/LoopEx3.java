package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx3 {
	
	//필드
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 문자열 한 글자씩 출력하기
	 */
	public void method1() {
		// 문자열.charAt(인덱스)
		// 문자열.length() : 문자열의 길이(메서드)
		
		String str = "Hello World!!";
		
		// int length = str.length(); // 미리 문자열의 길이를 카운트하여 저장
								   //->str.length() 구문을 재호출할 필요가 없어짐 
		
		// 초기식,증감식은 여러개 선언 가능
		for(int i=0, length=str.length(); i<length;i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	// while(조건식) : 끝이 확실하지 않은 반복에 사용
	
	/**
	 * -1이 입력될때까지 정수를 계속 입력받아
	 * 입력받은 수의 합계를 출력하시오
	 */
	public void method2() {
		int sum = 0; // 합계 누적용변수
		int input = 0; // 입력값을 저장할 변수
		
		while(input!=-1) { //입력 값이 -1이 아니면 반복
										//-> 1이면 멈춤
			System.out.print("정수입력 : ");
			input = sc.nextInt();
			
			if(input!=-1) {
				sum +=input;
			}
		}
			System.out.println("합계 : "+ sum);
	}
	
	// do ~ while문
	// - 조건식이 뒤에 작성된 while문
	// - 최소 1회 이상의 반복을 보장
	
	/**
	 * 0이 입력될때까지 정수를 입력받고
	 * 0 입력 시 누적된 합계 출력
	 */
	public void method3() {
		int sum=0;
		int input =0;
		
		do {
		
			System.out.println("정수 입력 : ");
			input = sc.nextInt();
			
			sum+=input;
		
		} while(!(input==0));
		
		System.out.println("합계 : "+sum);
	}
	
	/**
	 * 0이 입력될때까지 정수를 입력받고
	 * 0 입력 시 누적된 합계 출력
	 */
	public void method4() {
		int sum=0;
		int input = 0;
		
		while(true) { // 무한 반복
			
			System.out.println("정수 입력 : ");
			input = sc.nextInt();
			
			if(input == 0) break; // 반복 종료하는 분기문(break)
			
			sum += input;
		}
		// Unreachable code : 도달할 수 없는 코드
		// == dead code(죽은코드)
		System.out.println("합계 : "+sum);
	}
	

}//끝
