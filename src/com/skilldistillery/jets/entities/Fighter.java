package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements CombatReady {

	@Override
	public double fly() {
		return 0;
	}
	public Fighter() {
		super();
	}
	public Fighter(String model, double speed, int range, long price ) {
		
	}
	@Override
	public String toString() {
		return "Fighter [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public void Fight() {
		System.out.println("Promoting Democracy....pew pew pew");
	}
	

}
