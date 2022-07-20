package org.terran;

import org.Unit.Attacker;
import org.Unit.Unit;

public class Marine extends Unit implements Attacker  {
	

	
	
	private String weapon;
	
	public Marine() {    //unit.java에 this.hp=hp 입력했을때 11번에 오류가 나는 이유= 없는 생성자를 호출하려고해서 에러가 뜸
						//생성자가 하나라도 있으면 default을 자동생성이 안되기 때문에 default도 같이 만들어주자 
			
		//super(30);   // 이럴경우 부모 호출하여 매개변수 넣어줘야함
		//System.out.println() 생성자 위에 다른 것을 생성하면 안됨
		//super(); //부모 호출이 생략
		//this() 첫줄만 사용가능 
		
		System.out.println("Marine 생성자");
	}
	
	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	
	

	// 오버라이딩
	public void move() {
		super.info(); // 부모의 info 
		System.out.println("뛰어다녕");
		
	}
	// 오버라이딩
	public void info() {// 선언 자체가 오버라이딩
		System.out.println("Marine Info");
	} 
	
	//하는 행위= 메서드

	public void shoot() {
		
		System.out.println("뿅뿅뿅뿅");
	}
	}
