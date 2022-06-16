package com.qa.exercisefornewclass;

public class ExerciseForClass {
	
	public void addition(int myNumberOne, int myNumberTwo) {
	
		// Maths operators
		System.out.println(myNumberOne + myNumberTwo);
	}
	
	public void multiplication (int myNumberOne, int myNumberTwo){
		System.out.println(myNumberOne  *  myNumberTwo );
	}
	
	public void substraction (int myNumberOne , int myNumberTwo) {
		System.out.println(myNumberOne - myNumberTwo);
	}
	
	public void division (double myNumberOne , double myNumberTwo ) {
		
		if(myNumberOne < myNumberTwo) {
			System.out.println("the sum  is : ");
			System.out.println(myNumberOne / myNumberTwo);
			
		}else {
		System.out.println("The division cannot be performed");
		}
	}
	

}
