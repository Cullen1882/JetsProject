package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class AirField {
	private List<Jet> airfield = readJetsFile();
	
	

	public List<Jet> readJetsFile() {
//	public void readJetsFile() {
		List<Jet> newJet = new ArrayList<>();
		BufferedReader bufIn = null;
		try {
		  bufIn = new BufferedReader(new FileReader("jets.txt"));
		  String line;
		  while ((line = bufIn.readLine()) != null) {
		    String[] csvSect = line.split(", ");
		    
		    String type = csvSect[0];
		    String model = csvSect[1];
		    double speed = Double.parseDouble(csvSect[2]);
		    int range = Integer.parseInt(csvSect[3]);
		    long price = Long.parseLong(csvSect[4]);
		    if (type.equalsIgnoreCase("Cargo")) {
		    	newJet.add(new CargoPlane(type, model, speed, range, price));
		    }
		    else if(type.equalsIgnoreCase("Fighter")) {
		    	newJet.add(new Fighter(type, model, speed, range, price));
		  
		    }
		    else {
		    	newJet.add(new JetPass(type, model, speed, range, price));
		    }
//		    airfield.add(newJet);
//		    System.out.println(newJet);
//		    System.out.println(airfield);
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
//		System.out.println(newJet);
		return newJet;
		
	}
//	public void printJets(List<Jet> airfield) {
//	    for (Jet jet: airfield){
//	    	System.out.println(jet);
//	    }
//	}


	public List<Jet> getAirfield() {
//		List<Jet> jetCopy;
//	    jetCopy = new ArrayList<>();
//	    for (Jet jet : jetCopy) {
//			jetCopy.add(jet);
//	    }
		return airfield;
	}
	    
	public void Airfield() {
		
	}

	public void addJet(Jet newJetAdded) {
		airfield.add(newJetAdded);
	}
	public void removeJet(int jetNum) {
		airfield.remove(jetNum);
	}

	@Override
	public String toString() {
		return "AirField [airfield=" + airfield + ", toString()=" + super.toString() + "]";
	}
	



























}
