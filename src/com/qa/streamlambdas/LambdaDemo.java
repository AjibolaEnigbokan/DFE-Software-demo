package com.qa.streamlambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		List<Integer>myList = new ArrayList<>();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		
		//Enhanced for loop
		
		for(Integer value:myList) {
			
			System.out.println( value * 10);
		
		}
		
		// does same thing as the loop above . It uses a lambda expression as the method for forEach()

			myList.forEach(value -> System.out.println(value * 10));
			
			//lambda expression syntax
			
			//single argument 
		//	arg1 ->{method body}
			
			//multiple arguments
			
			//(arg1, arg2 0) -> {method body}
//			
//			myList.forEach(value ->{
//				System.out.println(value);
//				
//			});
			
			myList.forEach(value ->{
				if(value % 2 != 0) {
					System.out.println(value);
					
				}
				
			});
	}

}
