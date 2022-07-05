package com.qa.greeterexercise;

public class Greeter {
	
	private String greetingType;
	
	
	 public void setGreetingType(String greetingType) {
	        this.greetingType = greetingType;
	    }
	

    public String greet(){
        if ("formal".equals(this.greetingType)){
            return "Good evening, Sir.";
        }
        else if ("casual".equals(this.greetingType)) {
            return "Sup m8?";
        }
        else {
            return "Hello";
        }
    }

   
}
	


