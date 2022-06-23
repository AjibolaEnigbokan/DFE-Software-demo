package com.qa.garage;

public class Motobike extends Vehicle {
	
	
	private int noOfWheels;
	
	public Motobike(String make, String colour, int age, double weight, int noOfWheels) {
		super(make, colour, age, weight);
		this.noOfWheels = noOfWheels;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	
	
	@Override
	public void calBill() {

		System.out.println("The motobike cost is £1500");

	}
	@Override
	public String toString() {
		return "Motobike [noOfWheels=" + noOfWheels + ", Make=" + getMake() + ", Colour=" + getColour()
				+ ", Age =" + getAge() + ", Weight=" + getWeight() + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
