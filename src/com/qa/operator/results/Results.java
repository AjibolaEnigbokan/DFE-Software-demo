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
			System.out.println("Percentage is : " + this.percentages + "%");
				
		}
		
	}

