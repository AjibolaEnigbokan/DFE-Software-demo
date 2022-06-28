package com.qa.scanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		Boolean flag = true;
		
		while(flag){
		System.out.println("Enter a number: "); 
		//Integer numOne = scanner.nextInt();
		 Integer numOne = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter  Another number: "); 
		Integer numTwo =   Integer.parseInt(scanner.nextLine());
		
		Integer sum = numOne + numTwo;
		
		System.out.println("the sum of the those numbers : "  + sum);
		
		
// Consider making the following it's OWN loop
// The user should only leave this loop when they make a VALID choice
	
		System.out.println("Do you want to continue? Yes/No");
		
		
// Clear the scanner - Don't need to do this because I used nextLine() instead of nextInt()
//		scanner.nextLine(); // Used to consume the newline character left behind by nextInt() - \n
		
		String choice = scanner.nextLine();
		
		
		if(choice.equalsIgnoreCase("Yes")) {
			continue;
	
		}else if(choice.equals("No")){
			System.out.println("Application stopping...");
			flag = false;
			continue;
			
		}else {
			System.out.println("Invalid choice. Application restart.");
		}
	
}

}
}



