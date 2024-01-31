package edu.kh.array.practice;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 길이가 9인 배열을 선언 및 할당하고,
	 * 1부터 9까지의 값을 반복문을 이용하여
	 * 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	 * 짝수번째 인덱스 값의 합을 출력하세요.
	 */
	public void practice1() {
		int[] arr = new int[9];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			
			if(i%2==0) {
				sum+=arr[i];
			}
			System.out.print(arr[i]+" ");
		}
		System.out.printf("\n짝수 번째 인덱스 합 : %d",sum);
	}
	
	
	/**
	 * 길이가 9인 배열을 선언 및 할당하고,
	 * 9부터 1까지의 값을 반복문을 이용하여
	 * 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	 * 홀수번째 인덱스 값의 합을 출력하세요.
	 */
	public void practice2() {
		int[] arr = new int[9];
		int sum=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			arr[i]=i+1;
			
			if(!(i%2==0)) {
				sum+=arr[i];
			}
			System.out.print(arr[i]+" ");
		}
		System.out.printf("\n홀수 번째 인덱스 합 : %d",sum);
	}
	
	/**
	 * 사용자에세 입력받은 양의 정수만큼 배열 크기 할당하고
	 * 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요.
	 */
	public void practice3() {
		System.out.println("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		for(int i=0;i<input;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	/**
	 * 정수 5개를 입력받아 배열을 초기화 하고
	 * 검색할 정수를 하나 입력 받아
	 * 배열에서 같은 수가 있는 인덱스를 찾아 출력.
	 * 배열에 같은 수가 없을 경우
	 * "일치하는 값이 존재하지 않습니다" 출력
	 */
	public void practice4() {
		int[] arr=new int[5];
		
		System.out.println("입력 0 :");
		int num1 = sc.nextInt(); 
		System.out.println("입력 1 :");
		int num2 = sc.nextInt(); 
		System.out.println("입력 2 :");
		int num3 = sc.nextInt(); 
		System.out.println("입력 3 :");
		int num4 = sc.nextInt(); 
		System.out.println("입력 4 :");
		int num5 = sc.nextInt(); 
		
		System.out.println("검색할 값 :");
		int search = sc.nextInt(); 
		
		arr[0]=num1;
		arr[1]=num2;
		arr[2]=num3;
		arr[3]=num4;
		arr[4]=num5;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("인덱스 : "+i);
				return;
			}
				System.out.println("일치하는 값이 존재하지 않습니다.");
				return;
		}
	}
	
	
	
	
	
	
	
	
}//끝
