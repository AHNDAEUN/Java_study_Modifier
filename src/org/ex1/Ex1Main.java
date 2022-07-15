package org.ex1;

public class Ex1Main {

	public static void main(String[] args) {
	
		// private로 막힌 iu생성자를 사용하기 위해서 접근지정자를 사용
		 
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
			
			
			

	
			
			
			
	}

}
