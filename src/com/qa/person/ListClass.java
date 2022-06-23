package com.qa.person;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	private List<Person> myPerson = new ArrayList<>(); // encapsulate the variable by making them private

	public void addPersonMethod(Person input) {

		myPerson.add(input);

	}

	public void searchList(String input) {

		for (Person person : myPerson) {

			if (person.getName().equals(input)) {
				System.out.println("Hurray Person found ! , good job, that person is in the collection");

			}

		}

	}

	public void printList() {

		for (Person person : myPerson) {

			System.out.println(person);

		}

	}

}
