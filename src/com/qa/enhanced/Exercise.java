package com.qa.enhanced;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

	// int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public void methodOne() {

		List<String> arrayOfStrings = new ArrayList<>();

		arrayOfStrings.add("Bola");
		arrayOfStrings.add("John");
		arrayOfStrings.add("Khemzie");

		for (String value : arrayOfStrings) {
			System.out.println(value);
		}

	}

	public void questionTwo() {

		List<Integer> myIntNumber = new ArrayList<>();
		for (int i = 1; i < 21; i++) {

			myIntNumber.add(i);
		
		}
		
	for(Integer value: myIntNumber) {
	
		//System.out.println(Math.power(value,2));
		System.out.println(value * value);

	}
}}

//public boolean questionThree(int input){
//
//if(input % 2 == 0) {
//	return true;
//	
//}else {
//	
//	return false;
//}

	