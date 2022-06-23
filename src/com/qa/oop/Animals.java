package com.qa.oop;

public class  Animals {
	
	private String name;
	private String colour;
	private int age ;
	private double weight ;
	
	
	public Animals(String name, String colour, int age, double weight) {
	
		this.name = name;
		this.colour = colour;
		this.age = age;
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	@Override
	public String toString() {
		return "Animals [name=" + name + ", colour=" + colour + ", age=" + age + ", weight=" + weight + "]";
	}

	
	
	

}
