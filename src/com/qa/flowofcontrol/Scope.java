package com.qa.flowofcontrol;

public class Scope {

	// Class level scope
	public static String message = " Class Level";

	public static String methodOne() {
		// method level scope
		String methodLevelMsg = " Method Level";

		return methodLevelMsg;
	}

	public static void main(String[] args) {
		System.out.println(message);
		  String methodLevelMsg =  methodOne();
		  System.out.println(methodLevelMsg);
		  
	}

}
