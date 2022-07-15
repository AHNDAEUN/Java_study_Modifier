package org.Modifier.main;

import org.Unit.Unit;
import org.terran.Marine;

public class Main {  

	
		public static void main(String[] args) {
			Marine m1 = new Marine();
			m1. setHp(30);
			m1.info();
			m1.move();
			}
			
	}

//new marine 만들때 부모객체 만들고 내려옴 
//자식객체부터 만들면 부모객체를 만듬
//부모객체 생성 = 객체 생성