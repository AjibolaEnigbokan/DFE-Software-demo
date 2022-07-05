package com.qa.extensionbuilder;

public class BedroomAdder {

	public void addBedroom(BedroomAddable apartment) {
        apartment.setNumberOfBedroom(apartment.getNumberOfBedrooms() + 1);
        
    }

}
