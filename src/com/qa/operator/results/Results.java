package com.qa.operator.results;

public class Results {

	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public int percentages;

	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
	}

	public void methodOne() {

		System.out.println("Physics marks is : " + this.physics);
		System.out.println("Chemistry marks is : " + this.chemistry);
		System.out.println("Biology marks is : " + this.biology);
		System.out.println("Total marks is : " + this.total);
		System.out.println();

	}

	public void methodTwo() {
		this.percentages = (total * 100) / 450;
		int biologyP = (this.biology * 100) / 150;
		int chemistryP = (this.chemistry * 100) / 150;
		int physicsP = (this.physics * 100) / 150;
		
		
		
		System.out.println("Your  total percentage score is : " + this.percentages + "%");

		if (biologyP >= 60 && chemistryP >= 60 && physicsP >= 60 && this.percentages >= 60 ) {
			System.out.println("You passed, good job !");
			
		} else {
			System.out.println("You failed !, your percentage score must be 60% and above in all subjects for you to pass.");
			
			if(biologyP <60 ) {
				System.out.println("You failed biology " + " because  your percentage score is : " + biologyP);
			}
			if(chemistryP <60 ) {
				System.out.println("You failed chemistry " + " because  your percentage score is : " + chemistryP);
			}
			
			if(physicsP <60 ) {
				System.out.println("You failed physics " + " because  your percentage score is : " + physicsP);
			}
		}

	}
}
