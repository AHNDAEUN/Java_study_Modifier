package org.Himart;

public class Client {
	//구매자
	private int money;
	private int point;
	
	 public Client() {
		 this.money=300000000;
		 this.setPoint(10);
	 }
	 
	 //계산하는 메서드
	 //public void buy (int price, int point) {
	//매개변수를 2개가 아닌 1개로 만들어 받으려고함
	 public void buy (Tv tv) {
		
		 this.money= this.money-tv.getPrice();
		 this.point=this.point+ tv.getPoint();
		 System.out.println("잔액:" + this.money);
		 System.out.println("point:" + this.point);
		 
	 }
	
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	} 


}
