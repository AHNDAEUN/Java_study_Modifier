package org.animal;

public class Human {

	
	private	int age;
	
	public int getAge() {
		
		return this.age;
		//리턴 = 내부의 있는 값을 외부로 보내는것
	}
	
	//private에서 막힌 age를 public으로 연결다리 역할을 해줌
	public void setAge(int age) {// 외부변수를 가져와서

		//set 변수명으로 시작하는 메서드는 무엇을 넣으려고 하는 것
//get 변수명으로 시작하는 메서드는 무엇을 꺼내오려고 하는 것
		
		if(age>=0&&age<150) {
			this.age=age;
		}
		//		if(age>=0 && age<150) {
//			
//		this.age=age;
//	//this.age에 매개변수로 가져온걸 넣음
//		}	else {
//			this.age=0;
//		}						
		
	}
	public void info() { 
		System.out.println("ㅃ뿌뿌");
		
	}
	public void mypet() {
		Cat cat = new Cat();
		//cat.age=10;
		cat.sound();
	}
}
