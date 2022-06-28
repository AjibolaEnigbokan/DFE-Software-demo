package com.qa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println(" Please enter a integer number: ");

			int numberOne = 0;

			try {

				numberOne = scanner.nextInt(); // This line is throwing an exception when input is invalid.

				System.out.println("The number you entered  was " + numberOne);
				flag = false;

			} catch (InputMismatchException ime) {

				System.out.println("You didnt enter an integer");
				scanner.nextLine(); // clears the scanner

				// ime.printStackTrace();

			}
		}

	}
}
