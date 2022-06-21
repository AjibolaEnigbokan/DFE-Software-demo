package com.qa.array;

public class ArrayListRunnerNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dataType variableName = value

		int[] numArray = { 5, 10, 15, 10, 25 }; // you can assign value when u create the array

		int[] otherNumArray = new int[5]; // ;or u can create them empty

//		

		
//		for (int i = 0; i < otherNumArray.length; i++) {
//			otherNumArray[i]=i +5;
//
//		}
//		
//		for (int i = 0; i < otherNumArray.length; i++) {
//			System.out.println(otherNumArray[i]);
//			
			
			// Enhanced loop is for each loop
			
			for(int value : numArray ){
				System.out.println(value);
			}
			
		}

	}
	

