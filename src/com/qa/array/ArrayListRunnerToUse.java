package com.qa.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunnerToUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //int , double , float , long ,boolean ,short ,char , byte
		
	  // Object type aka wrapper Classes
		
	//Integer, Double , Float, Long , Boolean ,Short , Character ,Byte
		
		//Array List has to work with Objects
		//like 
		//List <Boolean> listOfStrings = new ArrayList<>();
		
		List<String> listOfStrings = new ArrayList<>();
		
		listOfStrings.add("Hello");
		listOfStrings.add("Bola");
		
		System.out.println(listOfStrings);
		
		System.out.println(listOfStrings.get(2));
		
		
		listOfStrings.set(2 , "Brenda");
//		Get the size of array list
		
		System.out.println(listOfStrings.size());
//		Empty the entire list
		
       //  listOfStrings.clear();
         
//         looping through the list
//         
//         for(int i = 0 ; i < listOfStrings.size(); i++) {
//        	 System.out.println(listOfStrings.get(i));
//        	 
//         }
//		
//		
//		for (String value:listOfStrings) {
//			System.out.println(value);
//		}

	}

}
