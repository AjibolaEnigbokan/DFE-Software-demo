package com.qa.selfabstractionpractice;

public class Runner {

	public static void main(String[] args) {
		
		EmployeeCount myCount = new EmployeeCount();
		myCount.setNoOfEmployee(2030);
		System.out.println("The no of Employee: " + (int)myCount.getNoOfEmployee());
	

	}

}
