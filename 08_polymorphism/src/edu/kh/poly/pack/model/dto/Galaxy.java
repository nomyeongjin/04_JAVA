package edu.kh.poly.pack.model.dto;

public class Galaxy extends SmartPhone {

	private int androidVersion;
	
	// 기본 생성자
	public Galaxy() {}

	// 매개변수 생성자 자동 완성 + super() 매개변수 생성자
	// alt [shift] s -> o -> 드롭다운에서 부모 생성자 선택 -> generate 
	public Galaxy(String ap, String display, String newsAgency, int androidVersion) {
		super(ap, display, newsAgency);
		this.androidVersion = androidVersion;
	}

	// getter/setter
	public int getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(int androidVersion) {
		this.androidVersion = androidVersion;
	}
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		return "Galaxt AndroidVersion : " + androidVersion + "/" + super.toString();
	}

	
	
	
}
