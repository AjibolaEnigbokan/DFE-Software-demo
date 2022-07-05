package com.qa.solid.singleresponsiblility;

public class Driver {
	
	public void drive(Car car, int milesDriven){
		
		car.setMileage(car.getMileage() + milesDriven);
		
	}
	
	

}
