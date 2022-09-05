package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	@Override
	public double fly() {
		return 0;
	}
	public CargoPlane() {
		super();
		
	}
	public CargoPlane(String type, String model, double speed, int range, long price) {
		super();
		
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading some cargo!");
	}
	
	
}
