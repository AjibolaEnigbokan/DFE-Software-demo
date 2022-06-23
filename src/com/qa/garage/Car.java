package com.qa.garage;

public class Car extends Vehicle {
	
    private int noOfDoor;
	private int noOfSteering;
	private int noOfSeat;
	private String modelName;
	

	public Car(String make, String colour, int age, double weight, int noOfDoor, int noOfSteering, int noOfSeat,
			String modelName) {

		super(make, colour, age, weight);
		this.noOfDoor = noOfDoor;
		this.noOfSteering = noOfSteering;
		this.noOfSeat = noOfSeat;
		this.modelName = modelName;
	}

	public int getNoOfDoor() {
		return noOfDoor;
	}

	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}

	public int getNoOfSteering() {
		return noOfSteering;
	}

	public void setNoOfSteering(int noOfSteering) {
		this.noOfSteering = noOfSteering;
	}

	public int getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
public void calBill() {

	System.out.println("The car cost  £2000");

}
	

	@Override
	public String toString() {
		return "Car [noOfDoor=" + noOfDoor + ", noOfSteering=" + noOfSteering + ", noOfSeat=" + noOfSeat
				+ ", modelName=" + modelName + ", Make=" + getMake() + ", Colour=" + getColour()
				+ ",Age="+ getAge() + "]";
	}
	
	
	

}
