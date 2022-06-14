package com.qa.flowofcontrol;

public class Scope {

	// Class level scope
	public static String message = " Class Level";

	public static void methodOne() {
		// method level scope
		String methodLevelMsg = " Method Level";

		System.out.println(methodLevelMsg);
	}

	public static void main(String[] args) {
		System.out.println(message);
	}

}
