package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String type;
	private String model;
	private double speed;
	private int range;
	private long price;

public void fly() {
	
	System.out.println("Jet [type=" + type + ", model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + " hours of flight " +  (range / speed) + " Mach " + ( speed * 0.001303));
}

public Jet() {
	super();
}
public Jet(String type, String model, double speed, int range, long price) {
	super();
	this.type = type;
	this.model = model;
	this.speed = speed;
	this.range = range;
	this.price = price;
}
public Jet(String model, double speed, int range, long price) {
	super();
	this.model = model;
	this.speed = speed;
	this.range = range;
	this.price = price;
}
public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public double getSpeed() {
	return speed;
}

public void setSpeed(double speed) {
	this.speed = speed;
}

public int getRange() {
	return range;
}

public void setRange(int range) {
	this.range = range;
}

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	this.price = price;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public void displayJet() {
    String JetData = this.toString();
    System.out.println(JetData);
}

@Override
public String toString() {
	return "Jet [type=" + type + ", model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
			+ ", toString()=" + super.toString() + "]";
}


}
