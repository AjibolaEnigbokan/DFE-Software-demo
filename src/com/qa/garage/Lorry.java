package com.qa.garage;

public class Lorry extends Vehicle {
	
	private String trailer;
	
	public Lorry(String make, String colour, int age, double weight, String trailer) {
		super(make, colour, age, weight);
		this.trailer = trailer;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	
	
	@Override
	public void calBill() {

		System.out.println("The lorry cost £5000");

	}

	@Override
	public String toString() {
		return "Lorry [trailer=" + trailer + ", Make=" + getMake() + ", Colour=" + getColour() + ", Age="
				+ getAge() + ", Weight=" + getWeight() + "]";
	}
	
	
	
	

}

