package com.qa.liskov;

//parent class

public  abstract class Bird {
	
	private int altitude;
	
	public abstract  void fly();
	

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
	

}
