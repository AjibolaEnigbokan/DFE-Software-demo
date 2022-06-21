package com.qa.string;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String  message = "My Message";
//		String anotherMessage = "My Message ";
		
		String message = new String("My message");
		String anotherMessage = new String(" My Message");
		if(message.equals(anotherMessage)) {
			System.out.println("They are the same!");
		}else {
			System.out.println(" They are NOT the same !");
		}
		
		//String thirdString = message + " " + anotherMessage;
		
		// can also 
		
		//changing case
		String one = "aNoush@eMail.COM";
		String two = "aNoush@eMail.com";
		
		System.out.println(message.toUpperCase());
		
//  System.out.println(message.charAt(0))  to get the index of the index
	}
//		.startswith() checks if it starts with(its going to be false or true
	//.replace("My" , " Your"
	// string = "         jibolaenny@yahoo.com        "; strip all leading and trailing white space
	// string  emailFixed = email.strips();
	// system.out.println(emailFixed)

	
 
	
}
