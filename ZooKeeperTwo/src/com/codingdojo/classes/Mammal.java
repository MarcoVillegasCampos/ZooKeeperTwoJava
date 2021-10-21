package com.codingdojo.classes;

public class Mammal {
	
	int energyLevel=100;
	
	public int displayEnergy() {
		int energyLevel=this.energyLevel;
		System.out.println(energyLevel);
		return energyLevel;
		}
		
	public int getEnergyLevel() {
		return this.energyLevel;
		
	}
	
	public void setEnergyLevel(int energyLevel) {
		
		this.energyLevel=energyLevel;
		
		
	
		
		
	}
	
	public void displayEnergy(int energyLabel) {
		this.energyLevel=energyLabel;
		System.out.println(energyLabel);
		
	}
		

}
