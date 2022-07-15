package org.Modifier.main;

import org.Himart.Client;
import org.Himart.Computer;
import org.Himart.Phone;
import org.Himart.Tv;

public class Main1 {

	public static void main(String[] args) {
	
			Computer computer =new Computer();
			Tv tv =new Tv();
			Phone phone = new Phone ();
			computer.info();
			tv.info();
			phone.info();
	
				
			Client client = new Client ();
			client.buy(tv);
			
			
}

}
