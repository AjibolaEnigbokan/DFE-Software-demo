package com.qa.hashexerciseinclass;

import java.util.HashMap;

public class MorseTranslator {

	private HashMap<String, String> morseMap;

	public MorseTranslator() {
		this.morseMap = new HashMap<>();

		this.morseMap.put(".-", "a");
		this.morseMap.put(".-", "a");
	}

	public String translate(String input) {

		String[] inputArray = input.split(" ");

		String output = " ";

		for (String value : inputArray) {
			
		System.out.print(morseMap.get(value));
			
		//	output += morseMap.get(value);

		}
		
		return output;
	}

}
