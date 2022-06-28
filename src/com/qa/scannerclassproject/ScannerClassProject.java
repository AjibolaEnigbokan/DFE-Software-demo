package com.qa.scannerclassproject;

public class ScannerClassProject {

	public void addMethod( int numOne, int numTwo){
			
		System.out.println(numOne + numTwo );
	}

	public void substrateMethod( int subNum1 , int subNum2){
		System.out.println(subNum1 - subNum2 );

	}

	public void multiplyMethodThree( int multiNum1 , int multiNum2){
		System.out.println(multiNum1 * multiNum2 );

	}

	public void divideMethod(int divNum1, int divNum2 ){
		
	System.out.println(divNum1 / divNum2);

	}
	
	
	public void askUserInput() {
		
		String choice = scanner.nextLine();
		
		
		if(choice.equalsIgnoreCase("addMethod")) {
			System.out.println("numOne + numTwo");
		
	
		}else if(choice.equalsIgnoreCase("substrateMethod")){
			System.out.println("subNum1 - subNum2");
		}else if (choice.equalsIgnoreCase("multiplyMethodThree")){
			System.out.println("multiNum1 * multiNum2");
		}else if(choice.equalsIgnoreCase("divideMethod")){
			System.out.println("divNum1 / divNum2");{
			
			}else {
				System.out.println("Bad choice");
			}
		}
		}
			
		}
			
		}
			

		}
		
		
		
	}

}



