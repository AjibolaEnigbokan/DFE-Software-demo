package com.qa.dependencyexercise;

public class BackEndDeveloper implements Developer {

	@Override
	public void develop() {
		writeJava();
	}

	public void writeJava() {
		System.out.println("C# is just Microsoft Java anyway.");
	}
}
