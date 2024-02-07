package edu.kh.poly.pack.model.dto;

// 부모 클래스 역할
public class SmartPhone {

	private String ap; // 스마트폰 cpu
	private String display; // 화면
	private String newsAgency; // 통신사
	
//	public SmartPhone() {
//		super(); // 미작성 시 컴파일러가 자동 추가
//	}
//	
//	public SmartPhone(String display, String newsAgency, String ap) {
//		super();
//		this.display = display;
//		this.newsAgency =newsAgency;
//		this.ap = ap;
//	}
	
	// 기본 생성자 자동 완성 : ctrl + space -> enter
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자 자동 완성 : alt [+shift] + s -> o
	public SmartPhone(String ap, String display, String newsAgency) {
		super();
		this.ap = ap;
		this.display = display;
		this.newsAgency = newsAgency;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getNewsAgency() {
		return newsAgency;
	}

	public void setNewsAgency(String newsAgency) {
		this.newsAgency = newsAgency;
	}

	// toString() 오버라이딩 자동 완성 : alt [shift] + s -> s
	@Override
	public String toString() {
		return "SmartPhone [ap=" + ap + ", display=" + display + ", newsAgency=" + newsAgency + "]";
	}
	
	
	
}
