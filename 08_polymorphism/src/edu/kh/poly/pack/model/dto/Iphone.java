package edu.kh.poly.pack.model.dto;

public class Iphone extends SmartPhone {

	private int iosVersion;
	
	// 기본 생성자
	public Iphone() {}

	// 매개변수
	public Iphone(String ap, String display, String newsAgency, int iosVersion) {
		super(ap, display, newsAgency);
		this.iosVersion = iosVersion;
	}

	
	//getter/setter
	public int getIosVersion() {
		return iosVersion;
	}

	public void setIosVersion(int iosVersion) {
		this.iosVersion = iosVersion;
	}

	// toString() 오버라이딩
	@Override
	public String toString() {
		return "Iphone iosVersion : " + iosVersion + "/" + super.toString();
	}
	
	
	
	
	
	
}
