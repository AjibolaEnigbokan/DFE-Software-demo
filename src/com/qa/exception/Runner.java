package com.qa.exception;

public class Runner {

	public static void main(String[] args) {
		ExceptionExample ex = new ExceptionExample();
		
		try {
			ex.multiplyException(25, 5);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
