package org.ex1;

public class Ex1Main {

	public static void main(String[] args) {
	
		// private로 막힌 iu생성자를 사용하기 위해서 접근지정자를 사용
		 
		//싱글톤(디자인 패턴)- 1개만 있음 /어떤 객체를 만들거나 어떤 것을 만드는 형식
		//MVC2
		
			Iu iu = Iu.getIntence();
			iu.setName("iu");
			iu.setAge(40);
			
			String name= iu.getName();
	
		
			System.out.println(name);
			System.out.println(iu.getAge());
			System.out.println(iu);
			System.out.println("================================");
			Iu iu2= Iu.getIntence();
			System.out.println(iu2.getName());
			System.out.println(iu2.getAge());
			System.out.println(iu2);
			
			// 객체는 1개 
			

	
			
			
			
	}

}
