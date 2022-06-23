package com.qa.oop;

public class Runner {

	public static void main(String[] args) {
		
		Animals dog = new Animals("Bob", "Black" , 16 , 20.0);
		
		System.out.println(dog.getName());
		
		dog.setName("Bill");
		
		System.out.println(dog);
		
	}

}