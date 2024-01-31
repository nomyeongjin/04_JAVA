package edu.kh.loop.ex;
import java.util.Scanner;

/**
 * 중첩 반복문
 */
public class LoopEx2 {
	Scanner sc = new Scanner(System.in);
	
	/**<pre>
	 * 다음모양 출력하기
	 * 
	 * 1234
	 * 1234
	 * 1234
	 * </pre>
	 */
	public void method1() {
		
		for(int col=1;col<4;col++) { // 3번 반복
			
			for(int row=1; row<5;row++) { //1234
				System.out.print(row);
		
			}
		
			System.out.print("\n"); // 줄바꿈
		
		}
		
	}
	
	/**
	 * <pre>
	 * 다음 모양 출력하기
	 *
	 * 4321
	 * 4321
	 * </pre>
	 */
	public void method2() {
		
		for(int i=1;i<3;i++) {//2번 반복
		
			for(int x=4;x>0;x--) {//4321
				System.out.print(x);
			}
			
			System.out.print("\n");//줄바꿈
		}
	}
	
	/**
	 * <pre>
	 * 다음 모양 출력하기
	 *
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 * </pre>
	 */
	public void method3() {
		for(int x=0;x<3;x++) {
			for(int i=0; i<3;i++) {
				System.out.printf("(%d,%d)",x,i);
			}
			System.out.print("\n");
		}
	}

	/**
	 * <pre>
	 * 다음 모양 출력하기
	 *
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 * </pre>
	 */
	public void method4() {
		for(int x=2;x>=0;x--) {
			for(int i=2; i>=0;i--) {
				System.out.printf("(%d,%d)",x,i);
			}
			System.out.print("\n");
		}
	}
	
	/**
	 * 2단부터 9단까지 모두 출력
	 * 
	 * 2x1= 2 2x2= 4 
	 * 3x1= 3 3x2= 6 
	 */
	public void method5() {
		for(int x=2; x<10;x++) {
			for(int i=1; i<10; i++) {
				System.out.printf("%dx%d= %2d ",x,i,i*x);
			}
			System.out.print("\n");
		}
		
	}
	
	/**<pre>
	 * 입력 받은 단 부터 9단까지 구구단 출력하기
	 * 
	 * 단, 입력 값이 2~9 사이가 아니면 "잘못 입력" 출력
	 * 
	 * ex)
	 * 단 입력 (2~9사이) : 7
	 * 
	 * ===== 7단 =====
	 * 7 x 1 =  7
	 * 7 x 2 = 14
	 * ...
	 * 7 x 9 = 63
	 * 
	 * ===== 8단 =====
	 * ...
	 * 
	 * 
	 * ===== 9단 =====
	 * 
	 * </pre>
	 */
	public void method6() {
		
		System.out.println("단 입력 (2~9사이) : ");
		int num = sc.nextInt();
		
		if(!(num>=2 && num<=9)) {
			System.out.println("잘못 입력");
			return;
		}
		
		for(int i=num;i<10;i++) {//세로 9단 입력받은 수부터 ++
			System.out.printf("=====%d단===== \n",i);
			
			for(int x=1;x<10;x++) { // 123456789
				System.out.printf(" %d x %d = %2d \n",i,x,i*x); //입력받은 수 ++ * (1++) = 곱한값 줄바꿈
			}
		}
		
	}
	
	
	/**<pre>
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9
	 * </pre>
	 */
	public void method7() {
		
		int count = 1;
		
		for(int x=1;x<4;x++) { // 3행
			for(int i=1;i<4;i++) { // 3열
				System.out.print(count++ + " ");
				
			} // 1 2 3 4 5 6 7 8 9
			System.out.print("\n"); // 줄바꿈
		}
		
	}
	
	/**<pre>
	 * ****
	 * ****
	 * ****
	 * ****
	 * 
	 * </pre>
	 */
	public void method8() {
		
		for(int i=1;i<5;i++) { //4행
			for(int x=1;x<5;x++) {//4열
				System.out.print("*");
			}// ****************
			System.out.print("\n"); //줄바꿈
		}
		
	}
	
	/** <pre>
	 * 		*
	 * 		**
	 * 		***
	 * 		****
	 * </pre>
	 */
	public void method9() {
		
//		for(int row=0 ; row<4 ; row++) { // 4행 (0123)
//			
//			for(int col=0 ; col< row+1 ; col++) { // 4열 (0123) 
//				System.out.print("*");
//			}
//			
//			System.out.println(); // 줄바꿈
//		}

		String str= "";
		
		for(int i=1;i<5;i++) { //4행
			
			System.out.print(str+="*");
			System.out.print("\n");
		}
		
	}
	
	public void method10() {
//		for(int row=0 ; row<4 ; row++) { // 4행
//			
//			for(int col=4 ; col> row ; col--) { // 4열 
//				System.out.print("*");
//			}
//			
//			System.out.println(); // 줄바꿈
//		}
		
		for(int row=3 ; row>=0 ; row--) { // 4행 (3210)
			
			for(int col=0 ; col< row+1 ; col++) { // 4열 (0123) 
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
		}
		
		
		
	}
	
	
	
} // 끝
