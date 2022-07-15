package org.Himart;

public class Tv extends Product{

	private int size;
	
	
	public Tv() {
	
		this.size=100;
		this.setBrand(getBrand());
		this.setPrice(20000);
		this.setPoint(5);
	
	}
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public void info() {
		super.info();
		System.out.println("size:" + this.size);
		System.out.println();
	}
	
}
