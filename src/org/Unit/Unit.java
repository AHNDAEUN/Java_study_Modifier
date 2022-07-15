package org.Unit;

public abstract class Unit {
	
	
	//클래스간의 공통 요소를 묶어 부모클래스로 만듬
	private int hp;
	private String color;
	private String name;
	
	public Unit() {
		System.out.println("super 생성자"); // 상속할때 상속생성자는 상속안받음
	
		this.hp=hp;
	}
	
	
	// move라는 공통 메서드 선언
	public abstract void move(); //완성되지 않은 추상클래스-> 완성시켜서 사용해야함
	
	public abstract void attack();
	
	public void info() {
		System.out.println("Super info");
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
