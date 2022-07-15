package org.Modifier.main;

import org.Unit.Unit;
import org.terran.Marine;
import org.terran.Scv;
import org.zerg.Hydra;

public class Main {  

	
		public static void main(String[] args) {
			Marine m1 = new Marine();
			Scv s1 =new Scv();
			
			// Marine is a Unit
			// Scv    is a Unit
			
			Unit unit =m1;
			Hydra hydra =new Hydra();
			
			m1.attack();
			hydra.attack();
			
		//======================= 다항성 예제====================	
		//	Unit unit =m1; //상속관계일때만 가능
			//마린타입은 유닛타입입니다.
			System.out.println(unit.getHp());
			System.out.println(unit.getColor());
			System.out.println(unit.getName());// unit이 알고 있는 것까지만 접근이 가능
			
			m1= (Marine)unit; // 버블을 강제로 형변환해서 넣는 것과 같다
							// 유닛앞에 마린타입을 넣어 강제 타입변환 시켜줌
			
			System.out.println(m1.getWeapon());
			
			
			
			//-------------------
			
//			m1. setHp(30);
//			m1.info();
//			m1.move();
			}
			
	}

//new marine 만들때 부모객체 만들고 내려옴 
//자식객체부터 만들면 부모객체를 만듬
//부모객체 생성 = 객체 생성