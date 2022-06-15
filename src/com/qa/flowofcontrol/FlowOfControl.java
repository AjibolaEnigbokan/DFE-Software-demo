package com.qa.flowofcontrol;

public class FlowOfControl {
	
	public static void methodOne(){
		System.out.println("Line 1");
	}
	
	
	public static void methodTwo() {
		
		System.out.println("Line 2");
	}
	
	//The order is line 16,17,5,6,7,18,9,10,11,19,20
	//code execution starts from the main
	public static void main(String[] args) {
		
		methodOne();
		methodTwo();
		System.out.println( "Line 3");
		
		
	}

}

