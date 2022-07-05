package com.qa.solid.singleresponsiblility;



public class Runner {

	public static void main(String[] args) {
		
		Car myCar = new Car("black", "A5", 5000);
		
	//	System.out.println(myCar.getMileage());
		
		Driver driver = new Driver();
		
		driver.drive(myCar, 500);
		
	//	System.out.println(myCar.getMileage());
		
		Mechanic myMechanic = new Mechanic();
		
		myMechanic.setCar(myCar);
		
		myMechanic.paintCar("Red");
		
		
	//	myMechanic.paintCar(myCar,"blue" );
		
		System.out.println(myCar.getColour());
		
		
		myMechanic.changeSpoiler(true);
		
		
		
		
		
	}

}
