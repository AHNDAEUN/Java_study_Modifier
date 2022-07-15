package org.Himart;

public abstract class Product {

	private String brand;
	private int price;
	private int point;
	
	
	public abstract void info();


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
	public void info() {
		System.out.println("brand:"+this.brand);
		System.out.println("price:"+this.price);
		System.out.println("point:"+this.point);
	
}
}