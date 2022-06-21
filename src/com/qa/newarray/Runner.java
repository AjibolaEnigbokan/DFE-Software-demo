package com.qa.newarray;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
//		New ArrayList created
		
//		List<String> listOfStrings = new ArrayList<>();
		
	List<Integer> myList = new ArrayList<>();
//	myList.add(1); to add 1 to the myArrayList
	
	for(int i = 0; i < 10; i++) {
		myList.add(i +1);
	}
	
	System.out.println(myList);
	

	}

}
