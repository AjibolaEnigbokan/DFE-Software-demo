package com.qa.liskov;

import com.qa.liskov.animalsolutioncopy.Flying;

public class Owl extends Bird implements Flying{

	@Override
	public void fly() {
		System.out.println("I'm flying");
		
	}
	

}
