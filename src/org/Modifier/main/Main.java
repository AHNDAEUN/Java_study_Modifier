package org.Modifier.main;

import org.animal.Cat;
import org.animal.Human;
import org.animal.Zoo;

public class Main {  

	public static void main(String[] args) {
	//	Cat cat = new Cat();
	
	//	cat.sound();
	//	cat.age=5;
	Human human =new Human();
	//human.age=500;
	human.setAge(50);
	human.info();
	
	
	//=======================================
	
	System.out.println(Zoo.title);
	
	Zoo.info();
	
	Zoo zoo =new Zoo ();
	zoo.price=10000;
	
	
	}
	

	
}
