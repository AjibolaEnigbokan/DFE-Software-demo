package com.qa.garage;

public class Vehicle {

	private String make;
	private String colour;
	private int age;
	private double weight;
	
	
//	constructor to make vehicle
	
	public Vehicle(String make, String colour, int age, double weight) {
		
		this.make = make;
		this.colour = colour;
		this.age = age;
		this.weight = weight;
		
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void vehicleSound() {
	
		System.out.println("The vehicle sound is: pin pin pin!");
	}
	
	public void calBill() {

		System.out.println("");

	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", colour=" + colour + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}
