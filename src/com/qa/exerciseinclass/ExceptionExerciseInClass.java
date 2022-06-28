package com.qa.exerciseinclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExerciseInClass {

	public void questionOne() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter two  integer numbers: ");

		try {
			int numOne = scanner.nextInt();
			int numTwo = scanner.nextInt();

			if (numTwo > numOne) {
				throw new DivisionException();
			}

			System.out.println(numOne / numTwo);

		} catch (InputMismatchException ime) {
			ime.printStackTrace();

			System.out.println("Invalid input");
		} catch (ArithmeticException ae) {

			// ae.printStackTrace(); or

			System.out.println(ae.getMessage());// .getMessage() can be used in lace of printStackTrace(

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			// this block always run
			scanner.close();
		}

	}

}
