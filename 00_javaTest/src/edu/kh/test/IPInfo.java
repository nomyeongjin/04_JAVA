package edu.kh.test;

public class IPInfo {
	private String ip;
	private String user;
	
	// 기본 생성자
	public IPInfo() {}


	// 매개 변수 생성자

	public IPInfo(String ip, String user) {
		super();
		this.ip = ip;
		this.user = user;
	}


	// getter/setter
	public String getIp() {
		return ip;
	}

	
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	
	// toString()
	@Override
	public String toString() {
		return ip+"/"+user;
	}
	

}
