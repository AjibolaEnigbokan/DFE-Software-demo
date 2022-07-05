package com.qa.solid.singleresponsiblility;
//POJO   Plain Old Java Object - use for defining  an object from a class

// responsibility to create a car object

public class Car {
	
	private String colour;
	private String model;
	private int mileage;
	private Boolean hasSpoiler;
	
	
	
	
	
	
	
	public Car(String colour, String model, int mileage, Boolean hasSpoiler) {
		super();
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
		this.hasSpoiler = hasSpoiler;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Boolean getHasSpoiler() {
		return hasSpoiler;
	}
	public void setHasSpoiler(Boolean hasSpoiler) {
		this.hasSpoiler = hasSpoiler;
	}
	
	

	
	//


}
