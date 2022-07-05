package com.qa.streamandlistexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStream {

	public static void main(String[] args) {

		// List of names

		List<String> myListOfNames = new ArrayList<>();
		myListOfNames.add("Michael");
		myListOfNames.add("Dean");
		myListOfNames.add("James");
		myListOfNames.add("Chris");

		Stream<String> myStreamNames = myListOfNames.stream();

		// myStreamNames.filter(name->!name.contains("J")).forEach(name -> // one of the three methods can be used
		// System.out.println( "Hello " + name));
		// myStreamNames.filter(name->!name.equals("James").forEach(name ->
		// System.out.println( "Hello " + name));

		myStreamNames.forEach(name -> {
//			if (!name.equals("James")) {
//				System.out.println("Hello " + name);// if name does not equal to James i.e print without James
//
//		}else {
//			System.out.println(name);
//		}

			
	//	};

		// List of integers

	List<Integer> myIntNumber = new ArrayList<>();
//		
//		myIntNumber.add(3);
//		myIntNumber.add(4);	
//		myIntNumber.add(7);
//		myIntNumber.add(8);
//		myIntNumber.add(12);
//		
	Stream<Integer> myStream = myIntNumber.stream();
//		
		int multiply = myStream.reduce((num1 , num2)-> num1 * num2).get();
		System.out.println(multiply);

		// list of numbers

		List<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(-9);
		listOfNumbers.add(-18);
		listOfNumbers.add(0);
		listOfNumbers.add(25);
		listOfNumbers.add(4);

		Stream<Integer> convertedStream = listOfNumbers.stream(); // converted to stream

		// Integer var = convertedStream.max(Integer::compare).get();

		// System.out.println("The maximun value is : " + var);

		 Integer var = convertedStream.min(Integer::compare).get();
		 // convertedStream.reduce((num1, num2)-> )

		 System.out.println("The minumum value is : " + var);

		 convertedStream.filter(number-> number % 2== 0 ).forEach(number -> // keeping even numbers
		 System.out.println(number));

		 convertedStream.filter(number-> number % 2 != 0 ).forEach(number -> // keeping odd numbers
		 System.out.println(number));

		int sum = convertedStream.mapToInt(Integer::intValue).sum(); // can be done in other way too like below
		System.out.println(sum);
		
		// int sum = convertedStream.reduce((num1, num2)->num1 + num2).get();
		//System.out.println(sum);
		
		int  square =convertedStream.map(num ->Math.pow(num, 2)).filter(number-> number % 2 != 0 ).min(Integer::compare).get();
		System.out.println(square);

	}

}