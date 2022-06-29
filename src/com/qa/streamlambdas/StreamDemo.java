package com.qa.streamlambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args){
		
		List<String> myAnimalList = new ArrayList<>();
		
		// list of Strings
		myAnimalList.add("cat");
		myAnimalList.add("dog");
		
		
		//List of integers
		List<Integer> myIntlList = new ArrayList<>();
		
		myIntlList.add(1);
		myIntlList.add(2);
		myIntlList.add(3);
		
		
		Stream<String> myAnimalStream = myAnimalList.stream(); // converting to a stream. This will allow me to use stream operation on my collection
		
// myAnimalStream.collect(Collectors.toList(); convert to list//the collect() usually converts stream, back into another datatype usually into list ,by using collect(Collectors.toList());
		
		//myAnimalStream.filter(animal -> animal.contains("a")).forEach(value -> System.out.println(value));
		
		//List<String> myFilteredList = myAnimalStream.filter(animal -> animal.contains("a")).collect(Collectors.toList());
		
		Stream<Integer> myIntStream =  myIntlList.stream();
		
		myIntStream.filter(number -> number % 2== 0).forEach(number -> System.out.println(number));
		
		//map
		
		myAnimalStream.map(animal -> animal.toUpperCase()).forEach(animal -> System.out.println(animal));
		
		//reduced (terminal operation
		int sum = myIntStream.reduce((num1, num2) -> num1 + num2).get();
		System.out.println(sum);
		
	}
	
	
	
	
	
	

}
