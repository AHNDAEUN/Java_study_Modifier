package org.ex1;

public class Iu {
	
	private String name;
	private int age;
	
	//fix-study
	private String test;
	
	//메서드 접근지정자 public으로 시작 public void set변수명 (데이터타입 변수명){}
	//setter 멤버변수의 값을 집어넣기 위함
	//getter public 리턴타입 get변수명 (){}
	
	private static Iu iu=null;
	// 이클래스 내부에서만 공유가능
	
	
	//생성자 
	private Iu() {} 
	
	public static Iu getIntence() {
		
		if (Iu.iu == null) {
			
			Iu.iu = new Iu();
			
		}else {
			
			
		}
		
		return Iu.iu;
	}
	
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		

}
