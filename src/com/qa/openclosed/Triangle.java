package com.qa.openclosed;

public class Triangle implements Shape {
	
	private double base ;
	private double heigth;
	
	
	
	public Triangle(double base, double heigth) {
		super();
		this.base = base;
		this.heigth = heigth;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	@Override
	public double calculateArea() {
		
		return 0;
	}
	
	

}
