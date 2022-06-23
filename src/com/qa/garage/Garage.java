package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> myVehicleArray = new ArrayList<>(); // any child of the vehicle will be stored here.

	public void addToArrayMethod(Vehicle input) { // method to add a vehicle to the array collection of vehicles

		myVehicleArray.add(input);

	}

//method to interate through the vehicle array list and this method will calculate bill of vehicle

	public void calculateBills() {
		for (Vehicle vehicle : myVehicleArray) {
			vehicle.calBill();
		}
	}

	public void printList() {
		for (Vehicle vehicle : myVehicleArray) {
			System.out.println(vehicle);
		}
	}

	// or the for loop in array can also be use to print i.e printList method

//	for( int i = 0; i< myVehicleArray.size(); i++){
//		 System.out.println(myVehicleArray.get(i));
//	}

// method to remove vehicle by the type

	public void removeByType(String type) {

		List<Vehicle> toBeRemoved = new ArrayList<>();

		for (Vehicle vehicle : myVehicleArray) {

			if (vehicle.getClass().getSimpleName().equals(type)) {
				toBeRemoved.add(vehicle);

			}

		}

		for (Vehicle vehicle : toBeRemoved) {
			myVehicleArray.remove(vehicle);
			System.out.println();

			System.out.println("Vehicle removed!");
			System.out.println();
		}
	}

	public void emptyGarage() {

		myVehicleArray.clear();
		System.out.println("The Garage was Emptied!");

	}

}
