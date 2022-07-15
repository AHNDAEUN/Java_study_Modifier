package org.Himart;

public class Phone extends Product{

	
	private String company;

	
	public Phone() {
		this.setCompany("sk");
		this.setBrand("고아라폰");
		this.setPrice(30000000);
		this.setPoint(25);
	}
	
	
	
	
	public void info() {
		super.info();
		System.out.println("company:"+ this.getCompany());
		
	}
	
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
