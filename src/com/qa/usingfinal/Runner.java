package com.qa.usingfinal;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// Final variable cannot be reassign
		final int age = 25;
		final String dob = "24/07/1993";
		final String eyeColour = "Brown";
		final String myPlanet = "Earth";

		final List<String> myList = new ArrayList<>();

		for (String item : myList) {
			System.out.println(item);
		}
	}

}
