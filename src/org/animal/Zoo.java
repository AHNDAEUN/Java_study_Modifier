package org.animal;

public class Zoo {

	
	//멤버 변수
	//접근지정자 [그외지정자] 데어터 타입 변수명;
	//클래스변수
	public static String title="사파리";
						// static으로 선언됨 			
	// 인스턴스 변수
	//public int price =50000;
	public final int PRICE =50000; // 한번 값을 지정해서 더이상 변경 불가능하게 만들고 싶을때 final 사용 
	// 멤버메서드 선언
	//접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수 선언]){}
	//클래스 메서드
	public static void info() {
		
		System.out.println("static method");
		System.out.println(Zoo.title);
		//System.out.println(price); 
		 
	} 

	 // 인스턴스 메서드
	public void getPrice() {//객체를 만들어야 사용할 수 있음
		
		System.out.println(price);
		System.out.println(Zoo.title);
		Zoo.info();
	}

	}