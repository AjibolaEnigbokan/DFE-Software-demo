package com.qa.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.qa.garage.Vehicle;

public class Runner {

	public static void main(String[] args) {
		List<Vehicle> listOfVehicle = new ArrayList<>();
		
//		Stream<Vehicle> streamOfDouble =listOfVehicle.stream();
//		
		GenericExample<String> myExample = new GenericExample();
//		
		String result = myExample.get();
		System.out.println(result);
//		
//			myExample.addToStorage(" Hello");
//			
//			String result = myExample.getFromStorage(0);
//			System.out.println(result);;
//			
			
			
		}
		
	}


