package com.qa.exception;

public class ExceptionExample {
	
	
	public void multiplyException(int numOne, int numTwo) throws Exception {
		
		if(numOne == 5 || numTwo == 5) {
			throw new Exception ("Cant multiply by 5");
		}
		
		
		System.out.println(numOne * numTwo);
		
	}

}
