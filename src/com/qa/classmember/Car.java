package com.qa.classmember;

public class Car {
	public String make;
	public String model;
	public int numOfDoors;
	public boolean hasSunroof;
	
//	Constructor is a method
	public Car(String make, String model, int numOfDoors, boolean hasSunroof) {
		;
		this.make = make;
		this.model = model;
		this.numOfDoors = numOfDoors;
		this.hasSunroof = hasSunroof;
	}
	
		public void drive() {
			System.out.println("I am driving");
		}
	

}
