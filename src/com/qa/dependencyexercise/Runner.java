package com.qa.dependencyexercise;

public class Runner {
	
	public static void main(String[] args) {
		
	BackEndDeveloper backend = new BackEndDeveloper();
	FrontEndDeveloper frontend = new FrontEndDeveloper();
	Project project = new Project();
	
	//project.implement(frontend);
	//project.implement(backend);
		
	
	
	backend.develop();
}


}