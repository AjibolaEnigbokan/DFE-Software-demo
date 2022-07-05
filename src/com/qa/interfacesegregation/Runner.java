package com.qa.interfacesegregation;

public class Runner {

	public static void main(String[] args) {
		

			Dodo dodo = new Dodo(0);
			Falcon falcon = new Falcon(4);
			falcon.getNumberOfEggs();
			int result =  falcon.getNumberOfEggs();
			System.out.println(result);
	}
}
