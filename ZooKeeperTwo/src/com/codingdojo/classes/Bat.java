package com.codingdojo.classes;






	public class Bat extends Mammal  {
		
				
		public Bat(int energyLevel) {
			
			super.setEnergyLevel(energyLevel);
			
		}
		
		
		
		
		
		
		
		
		public void fly() {
			
		
			energyLevel-=50;
			System.out.println("This is the bat flying!!!");
			
			
		}
		
		public void eathumans() {
		
		
			energyLevel+=25;
	
			System.out.println("So-well, nevermind!");
			
			
		}
		
		public void attackTown() {
	
		
			energyLevel-=100;
			
			System.out.println("Fire!!! Fire!!! ");
			
			
		}
		
		

	}
	
	


