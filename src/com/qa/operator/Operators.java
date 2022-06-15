package com.qa.operator;

public class Operators {
	public void basicMaths( int numOne , int numTwo ){
		
//		Assignment
		
//		int numOne  = 10;
//		int numTwo = 5 ;
//		
//		Maths operators
		
		System.out.println(numOne + numTwo);
		System.out.println(numOne - numTwo);
		System.out.println(numOne * numTwo);
		System.out.println(numOne / numTwo);
		
	}

	public void modulus (int numOne , int numTwo) {
		System.out.println("numOne % numTwo");
	}
	
	
	//+= and -=
	
	public void plusMinusEquals() {
		
		int num = 10;
		
		//num = num + 5;
		num += 5;
		
		System.out.println(num);
	}

	
	public void notOperator() {
		boolean flag = true;
		
		System.out.println(!flag);
	}
	
}
