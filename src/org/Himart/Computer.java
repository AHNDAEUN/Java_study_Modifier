package org.Himart;

public class Computer extends Product{
	
	private String cpu;
	
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public Computer() {
		this.cpu="M2";
				this.setbrand("Macmini");
				this.setPrice((200000));
				this.setPoint(100);
	}

	//public void info() {
	public void info() {
	
		super.info();
		System.out.println("cpu:" + this.cpu);
		System.out.println();
	}
	

}
