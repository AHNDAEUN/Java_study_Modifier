package org.animal;

public class Cat {
	
	private int age; // 패키지 생략/ 생략 = default값 자동 선언 / default 같은 패키지내에서만 사용가능
	 void sound() {// cat 접근지정자 선언 = public 어디서든, 다른패키지에서도 사용가능함
		age=10;
		System.out.println("야용");
	}

	
	 public Cat() {
		
	}
}
