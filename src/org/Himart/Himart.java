package org.Himart;

public abstract class Himart {// 공통적인 요소를 모아 상속
	
	
	
	public void Himart() {
		System.out.println("");
	}
//	생성자에서 모든 멤버변수의 값을 초기화
//	Computer
	
	
	
	private int cpu;
	private int size;
//	메서드 :info ⇒ 모든 멤버변수 정보 출력

//	전화기 

	private String company;
	public int getCpu() {
		return cpu;
	}



	public void setCpu(int cpu) {
		this.cpu = cpu;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}


//	    메서드 :info ⇒ 모든 멤버변수 정보 출력
//
//	tv
//	메서드 :info ⇒ 모든 멤버변수 정보 출력
	
	
	private String bland2;
	private int price2;
	private int point2;
	
	
	
	
	
	
	
	
	
	
	
	
}
