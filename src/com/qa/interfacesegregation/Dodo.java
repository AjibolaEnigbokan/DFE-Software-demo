package com.qa.interfacesegregation;

public class Dodo implements EggLayingCreature{
	
	    private String currentLocation;
	    private int numberOfEggs;

	    public Dodo(int initialEggCount) {
	        this.setNumberOfEggs(initialEggCount);
	    }

	  @Override
	    public void layEggs() {
	        this.setNumberOfEggs(getNumberOfEggs() + 1);
	    }

	    public void goExtinct() {
	        this.setCurrentLocation("in a museum");
	    }

	    public String getCurrentLocation() {
	        return currentLocation;
	    }

	    public void setCurrentLocation(String currentLocation) {
	        this.currentLocation = currentLocation;
	    }

	    public int getNumberOfEggs() {
	        return numberOfEggs;
	    }

	    public void setNumberOfEggs(int numberOfEggs) {
	        this.numberOfEggs = numberOfEggs;
	    }
	}
	
	

