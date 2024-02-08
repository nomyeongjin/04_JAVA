package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.Calculator;
import edu.kh.poly.pack3.model.dto.Machine;
import edu.kh.poly.pack3.model.dto.NMJCalculator;

public class CalculatorRun {
	public static void main(String[] args) {
		
		// 인터페이스 장점 : 
		// 상속 받은 클래스들의 형태가 똑같거나 비슷하기 때문에
		// 코드 유지 보수 시
		// 참조하는 객체만 변경하면 유지 보수가 완료된다.
		
		
		Calculator cal = new NMJCalculator();
		Machine machine = ((Machine)cal);
		
		
		machine.powerOn();
		System.out.println();
		System.out.println("* 덧셈 : "+cal.plus(3,4));
		
		System.out.println();
		System.out.println("* 뺄셈 : "+cal.minus(4,5));
		
		System.out.println();
		System.out.println("* 곱셈 : "+cal.multi(4,5));
		
		System.out.println();
		System.out.println("* 나누기 : "+cal.div(4,5));
		
		System.out.println();
		System.out.println("* 나머지 : "+cal.mod(4,5));
		
		System.out.println();
		System.out.println("* SUM : "+cal.sum(1,2,3,4,5,6,7,8,9));
		
		System.out.println();
		System.out.println("* 원의 넓이 : "+cal.areaOfCircle(5));
		
		System.out.println();
		System.out.println("* 최소, 최대값 체크 : "+cal.rangeCheck(2000000000));

		System.out.println();
		System.out.println("* 거듭 제곱 : "+cal.pow(2,5));
		
		System.out.println();
		System.out.println("* 2진수 : "+cal.toBinary(15));
		
		System.out.println();
		System.out.println("* 16진수 : "+cal.toHexadecimal(15));

		machine.powerOff();
	}
}
