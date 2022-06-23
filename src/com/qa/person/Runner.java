package com.qa.person;

public class Runner {

	public static void main(String[] args) {

		Person bigMan = new Person("Bola", 20, "Developer");
		Person smallMan = new Person("John", 25, " Junior Developer");
		Person deMan = new Person("James", 18, "Tester");

		ListClass listOfPersons = new ListClass();

		listOfPersons.addPersonMethod(bigMan);
		listOfPersons.addPersonMethod(smallMan);
		listOfPersons.addPersonMethod(deMan);

		listOfPersons.searchList("John");
		
		
		listOfPersons.printList();

	}
	

}
