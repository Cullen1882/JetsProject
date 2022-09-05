package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	
//	public void fly() {
//		
//	}
	public CargoPlane() {
		super();
		
	}

	public CargoPlane(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		
	}
	 
	@Override
	public void loadCargo() {
		System.out.println(this.getModel() + "Loading some cargo!");
	}
	
	
}
