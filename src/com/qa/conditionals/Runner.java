package com.qa.conditionals;

public class Runner {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// boolean condition = true;
//
//		int number = 10;
//
//		if (true) {
//			System.out.println("Yeap thats a good number1 ");
//		} else {
//			System.out.println("not good messge");
//		}

		
		 String grade = "C";
		 
		 switch(grade){
		 case "A" :
		 case "B" :
		 case "C" :
			 System.out.println(" Weldone you have passed");
			 break;
		 case "D" :
			 System.out.println(" You have work to do");
		 default:
		     System.out.println(" You have failed");
		
		}	
		 
	}
	
}