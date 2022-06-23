package com.qa.enhanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise {

	// int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//	public void methodOne() {
//
//		List<String> arrayOfStrings = new ArrayList<>();
//
//		arrayOfStrings.add("Bola");
//		arrayOfStrings.add("John");
//		arrayOfStrings.add("Khemzie");
//
//		for (String value : arrayOfStrings) {
//			System.out.println(value);
//		}
//
//	}

//	public void questionTwo() {
//
//		List<Integer> myIntNumber = new ArrayList<>();
//		for (int i = 1; i < 21; i++) {
//
//			myIntNumber.add(i);
//		
//		}
//		
//	for(Integer value: myIntNumber) {
//	
//		//System.out.println(Math.power(value,2));
//		System.out.println(value * value);
//
//	}
//}

	public void myConcate() {

		String myMessageOne = "yesterday it was raining. ";
		String myMessageTwo = "today it is sunny, ";
		String myBothMessages = myMessageTwo + myMessageOne;

		String subStringTwo = myMessageTwo.substring(0, 11);
		String subStringOne = myMessageOne.substring(16, 24);

		String myBothMessagesSubstring = subStringTwo + subStringOne;

		// System.out.println(myBothMessages.toUpperCase());

		// System.out.println(myBothMessagesSubstring.toUpperCase());

	}
//
//	public int methodCount(String input) {
//		String [] words = input.split(" ");
//		
//		return words.length; // this will give the number of words
//		//System.out.println(words.length);
//	}
//	

	public void methodOne(String input) {
		String [] myWords = input.split(" ");
	

		for (String value : myWords) {
			System.out.println(value);

		}
	

	}

	public void methodThree(String input) {
	
	String[] myList = input.split(" "); 
	
	
	for (int i = myList.length-1 ; i >= 0; i--) {
		
		System.out.println(myList[i]);
	}
	
	
	
	//	List<String> myList = Arrays.asList(myList)<>(); // convert to List
//		
//		myReversedList.add("Bola");
//		myReversedList.add("John");
//		myReversedList.add("Michael");
//		
//	//	sort list and create a comparator for reverse order
//		
//		Comparator<String> myCollectionList = Collections.reverseOrder();
//		
//		Collections.sort( myReversedList, myCollectionList);
//		
//		for (String value :myReversedList) {
//			
//			System.out.println(value + " ");
//		}
//		

//	
	
	
	}
	
	
	
	public boolean questionFive(String message, String find) {
			
			return message.contains(find); // will be true if found , false if not
		}
		
		
	}
	
	

//public boolean questionThree(int input){
//
//if(input % 2 == 0) {
//	return true;
//	
//}else {
//	
//	return false;
//}
