package edu.kh.javatest;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] memberArr = {"홍길동","김성훈","윤웅식","윤성우","남궁인"};
		
		System.out.print("검색할 회원 이름을 입력 하세요 : ");
		String searchName = sc.nextLine(); // 자료형과 일치하지 않는 메서드 사용
		
		boolean result = false;
		
		for(int i=0; i<memberArr.length;i++) {//배열은 0부터 시작하므로 범위를 조정해주어야함
			if(memberArr[i].equals(searchName)) {//기본 자료형이 아닌 경우 == 가 아닌 equals()메서드를 사용해야한다.
				result = true;
				break;
			}
			
		}
		if(result) {
			System.out.println("회원이 존재합니다.");// result가 true일때에 잘못된 결과 출력
		}
		else System.out.println("회원이 존재하지 않습니다.");
	}
}
