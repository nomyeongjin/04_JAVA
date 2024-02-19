package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>(); // NullPointerException 발생 -> ArrayList사용하여 InfoList를 저장할 새로운 배열객체를 만들어주어야함
		
		ipInfoList.add(new IPInfo("123.123.123.123","홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8","아무개")); // 매개변수로 ip와 user를 받아오기 때문에 user에 들어갈 String형 정보를 적어주어야한다.
		ipInfoList.add(new IPInfo("177.233.111.222","고길순"));
		
		System.out.println("ip 입력 : ");
		String ip = sc.next();
		
		
		for(int i=0; i<ipInfoList.size(); i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) { // list만을 얻어오기때문에 속에 ip를 얻어오는 getter를 사용해야함
				System.out.println(ipInfoList.get(i));
				return; // break를 이용하면 뒤 내용 반환
			}
		}
		System.out.println("일치하는 ip 사용자가 없습니다.");
		
		
		
	}
}
