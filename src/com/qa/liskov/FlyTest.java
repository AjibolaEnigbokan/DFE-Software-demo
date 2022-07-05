package com.qa.liskov;

import com.qa.liskov.animalsolutioncopy.Flightless;
import com.qa.liskov.animalsolutioncopy.Flying;

public class FlyTest {
	
	public void learnToFly(Flying bird) {
		
		bird.fly();
	}

	public void tryToFly(Flightless bird) {
		bird.flap();
		
	}
	
}
