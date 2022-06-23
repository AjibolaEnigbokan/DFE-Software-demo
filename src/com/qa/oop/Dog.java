package com.qa.oop;

public class Dog extends Animals {

	private String breed;
	private boolean isPanting;

	public Dog(String name, String colour, int age, double weight, String breed, boolean isPanting) {
		super(name, colour, age, weight); // set the Animal properties

		this.breed = breed; // set the Dog properties
		this.isPanting = isPanting; // set the Dog properties

	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isPanting() {
		return isPanting;
	}

	public void setPanting(boolean isPanting) {
		this.isPanting = isPanting;

	}

	public void bark() {
		System.out.println("Yap, yap,yap");
	}

}
