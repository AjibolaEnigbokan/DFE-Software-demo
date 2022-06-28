package com.qa.hash;

import java.util.HashMap;
import java.util.Map.Entry;

public class Runner {

	public static void main(String[] args) {
		//first datatype is  the key
       //second datatype is value  
		
		HashMap<String , Integer> nameAndAge = new HashMap();
		
		
	 
		
		//add key/value pairs in HasHMap we use .put keyword in Hashmap
		nameAndAge.put("Anoush", 27);
		nameAndAge.put("James", 80);
		nameAndAge.put("Bola", 20);
//		
		//get a value
		System.out.println(nameAndAge.get("Claire"));  
		
		// get a size
		System.out.println(nameAndAge.size());
		
		//	System.out.println(nameAndAge.get("Claire"));
		
		
		//clears the list
		nameAndAge.clear();
		
		//loop through key
		
		for (String key : nameAndAge.keySet()) {
			
			System.out.println(key);
		}
		
		//loop through values
		
		
	for (Integer value : nameAndAge.values()) {
			
			System.out.println(value);
		}
		
		
		//loop through both , u will need to use "entry set"
		
		for(Entry<String, Integer> entry : nameAndAge.entrySet()) {
			
			System.out.println(entry);
			
			
		}
	
	}

}
