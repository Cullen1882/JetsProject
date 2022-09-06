package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements CombatReady {

	
	public Fighter() {
		super();
	}
	
	public Fighter(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}
//	public void fly() {
//		
//	}
//	@Override
//	public double fly() {
//		double hOf = (float)(getRange() / getSpeed());
//		return hOf;
//	}
//	@Override
//	public String toString() {
//		return "Fighter [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
//				+ ", getPrice()=" + getPrice() + ", getType()=" + getType() + ", toString()=" + super.toString() + "]";
//	}
	
	@Override
	public void Fight() {
		System.out.println(this.getModel() + "Promoting Democracy....pew pew pew");
	}
	
	}

