package com.qa.greeterexercise;

public class Runner {

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter(casualGreeting);
		//greeter.setGreetingType("Anything else");
		
		System.out.println(greeter.greet());
				
	CasualGreeting casualGreeting = new CasualGreeting();
	FormalGreeting formalGreeting = new FormalGreeting();
		
		

	}

}
