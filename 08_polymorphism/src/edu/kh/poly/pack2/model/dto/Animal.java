package edu.kh.poly.pack2.model.dto;


// abstract 클래스 (추상 클래스)
// - 추상 메서드를 포함하고 있는 클래스
// - 미완성인 부분을 포함하고 있기 때문에 객체로 생성하는 것이 불가능
public abstract class Animal {

	// 동물의 공통된 필드 / 메서드
	private String type; // 종, 류 (양서류, 포유류, 갑각류, 조류)
	// 기본 생성자
	public Animal() {}
	
	// 매개변수 생성자
	public Animal(String type) {
		super();
		this.type = type;
	}

	// getter / setter
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return type;
	}
	
	// 모든 동물이 가지고 있는 기능
	
	// 모든 동물이 먹고, 자는데 그 방법들이 너무 각양각색 
	// -> 하나로 정의 내리기 어려움
	// -> 부모 클래스 Animal에서 eat(), sleep()을 정의할 수 없음
	//   --> Animal을 상속받는 자식 클래스에서
	//       각자에게 맞춰 재정의(Overriding)하도록 강제화
	
	// abstract : 추삭
	// abstract 메서드 : 추상 메서드
	// 		-> 코드를 정의하는 {}가 없는 메서드
	
	public abstract void eat();
	
	public abstract void sleep();
	
	// abstract 메서드를 정상적으로 작성했는데 오류가 발생하는 이유
	// -> The abstract method sleep in type Animal can only be defined by an abstract class
	// -> 현재 클래스가 추상 클래스가 아니라서 오류 발생 
	// 해결 방법 : class 선언부에 abstract 추가
	
}
