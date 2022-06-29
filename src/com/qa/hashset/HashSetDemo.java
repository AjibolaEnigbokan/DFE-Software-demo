package com.qa.hashset;

import java.util.HashSet;

public class HashSetDemo {
	
	
	HashSet<String> myHashSetExercise = new HashSet<>();
	
	
	public void hashSetDemoMethod() {
		
		myHashSetExercise.add("Anoush");
		myHashSetExercise.add("John");
		myHashSetExercise.add("Bola");
		
		//System.out.println(" Iterate Hashset using for loop: " +   myHashSetExercise);
		
		//Enhanced for loop
		for(String hash :myHashSetExercise) {
			
			System.out.println( hash) ; // either one can be used.
		//	System.out.println( hash + " ");
		}
		
		
	
	
//	HashSet<String> myHashSet = new HashSet<>(); //the key is a hash code of the value. key is the hash code of the object been stored. You can't have duplicate object and are unique
//	
//							//no order is not preserved
//	
//							// duplicate will overwrite the previous values
//	
//	public void hashSetDemoMethod() {
//		
//		myHashSet.add("Anoush");
//		myHashSet.add("Claire");
//		myHashSet.add("Bola");
//	}
//	
//	// myHashSet.isEmpty() checking to see if the set is empty or not , it will be true or false
//	
}}

