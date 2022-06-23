package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		// 3 vehicles -one car ,motobike and lorry. They are all vehicle instances. E.g it creates car instance of vehicle object , it create motobike instance of vehicle object , it creates lorry instances of vehicle object 
		
		Car car = new Car("Toyota", "Blue", 5, 30.0, 4, 4, 1, "Landcruser");
		Motobike motobike = new Motobike("Vesper", "Brown",3,15.60, 2);
		Lorry lorry = new Lorry("Volvo", "Yellow", 10, 80.0, "big");
		
		Garage garage = new Garage();
		
		// add all the three vehicles to he garage
			garage. addToArrayMethod(car);
			garage. addToArrayMethod(motobike);
			garage. addToArrayMethod(lorry);
		
			garage.printList();
		
					
			
			garage.removeByType("Motobike");
			garage.printList();
			
			motobike.calBill();

	}

}
