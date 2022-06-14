package com.qa.datatypes;

public class DataTypes {

	public static void main(String[] args) {

		System.out.println(returnInteger());
		System.out.println(returnBoolean());
		System.out.println(returnCharacter());
		System.out.println(returnLong());
		System.out.println(returnFloating());
		System.out.println(returnStringing());
		returnNothing();
		
	}

	public static int returnInteger() {

		return 0;

	}

	public static boolean returnBoolean() {
		return true;
	}

	public static char returnCharacter() {
		return 'P';
	}

	public static long returnLong() {
		return 52L;
	}

	public static float returnFloating() {
		return 0.6f;
	}

	public static String returnStringing() {
		return "Hi there";
	}

	public static void returnNothing() {
		// no return
		System.out.println("I am void");
	}

}
