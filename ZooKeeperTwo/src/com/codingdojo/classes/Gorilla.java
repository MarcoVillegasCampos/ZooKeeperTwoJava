package com.codingdojo.classes;

public class Gorilla extends Mammal  {
	
	
	public void throwSomething() {
		int energyLevel=super.energyLevel;
		energyLevel-=5;
		System.out.println("The Gorilla has thrown a rock!!!");
		
		
	}
	
	public void eatBananas() {
		int energyLevel=super.energyLevel;
		energyLevel+=10;
		System.out.println("The Gorilla just burped");
		
		
	}
	
	public void climb() {
		int energyLevel=super.energyLevel;
		energyLevel-=10;
		System.out.println("The Gorilla just climbed a tree");
		
		
	}
	
	

}
