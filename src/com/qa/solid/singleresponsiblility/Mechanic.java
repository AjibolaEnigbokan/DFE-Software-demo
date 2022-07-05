package com.qa.solid.singleresponsiblility;

public class Mechanic {
	
	private 
	
	public void paintCar(Car car,String newColour ) {
		
		car.setColour(newColour);	
	}

	public void changeSpoiler(Car car, boolean flag) {
		
		car.setHasSpoiler(flag);
	}
	
	public void setCar(Car car) {
		
		this.car = car;
	}
	
}
