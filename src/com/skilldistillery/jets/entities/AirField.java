package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> airfield = new ArrayList<>();

	

	public void readJetsFile() {
		BufferedReader bufIn = null;
		try {
		  bufIn = new BufferedReader(new FileReader("jets.txt"));
		  String line;
		  while ((line = bufIn.readLine()) != null) {
		    String[] csvSect = line.split(", ");
		    Jet newJet = null;
		    String type = csvSect[0];
		    String model = csvSect[1];
		    double speed = Double.parseDouble(csvSect[2]);
		    int range = Integer.parseInt(csvSect[3]);
		    long price = Long.parseLong(csvSect[4]);
		    if (type.equalsIgnoreCase("Cargo")) {
		    	newJet = new CargoPlane(type, model, speed, range, price);
		    }
		    else if(type.equalsIgnoreCase("Fighter")) {
		    	newJet = new Fighter(model, speed, range, price);
		  
		    }
		    else {
		    	newJet = new JetPass(type, model, speed, range, price);
		    }
		    airfield.add(newJet);
		    System.out.println(newJet);
		    System.out.println(airfield);
		  }
		}
		catch (IOException e) {
		  System.err.println(e);
		}
		finally {
		  if (bufIn != null) {
		    try {
		      bufIn.close();
		    }
		    catch (IOException e) {
		      System.err.println(e);
		    }
		  }	
	}

	}



	public List<Jet> getAirfield() {
		return airfield;
	}



	@Override
	public String toString() {
		return "AirField [airfield=" + airfield + ", toString()=" + super.toString() + "]";
	}
	



























}
