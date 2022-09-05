package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.Fighter;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JetPass;

public class JetsApplication {
	AirField af = new AirField();
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		JetsApplication jA = new JetsApplication();
		jA.run();
	}
	
	public void run() {
	
		displayMenu();
	}

	public void displayMenu() {
		
		
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("*********** WELCOME ************");
		System.out.println("********************************");
		System.out.println("************  TO  **************");
		System.out.println("********************************");
		System.out.println("**** THE JETS APPLICATION ******");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		
		boolean keepGoing = true;
		
		while (keepGoing) {
			
			System.out.print("1) List Fleet \n");
			System.out.print("2) Fly All Jets \n");
			System.out.print("3) View Fastest Jets \n");
			System.out.print("4) View Jet with Longest Range \n");
			System.out.print("5) Load All Cargo Jets \n");
			System.out.print("6) DogFight!! \n");
			System.out.print("7) Add a Jet to Fleet \n");
			System.out.print("8) Remove a Jet From Fleet \n");
			System.out.print("9) Quit Program \n");
			System.out.println("Please make a choice from the menu, choose #9 to QUIT \n");
			int userMenuChoice = scan.nextInt();
			
			switch (userMenuChoice) {
			case 1:
				for (Jet jet : af.getAirfield()) {
					System.out.println(jet.getModel());
				}
				break;
			case 2:
				for (Jet jet : af.getAirfield()) {
				jet.fly();
				}
				break;
			case 3:
				Jet fastest = af.getAirfield().get(0);
				for (Jet jet : af.getAirfield()) {
					if (fastest.getSpeed() < jet.getSpeed()) {
						fastest = jet;
					}
					
				}
				System.out.println("The fastest jet in the fleet is: " + fastest);
				break;
			case 4:
				Jet longest = af.getAirfield().get(0);
				for (Jet jet : af.getAirfield()) {
					if (longest.getRange() < jet.getRange()) {
						longest = jet;
					}
					
				}
				System.out.println("The jet with the longest range is: " + longest);
				break;
			case 5:
				for (Jet jet : af.getAirfield()) {
					if (jet instanceof CargoPlane) {
						((CargoPlane)jet).loadCargo();
					}	
					}
				break;
			case 6:
				for (Jet jet : af.getAirfield()) {
					if (jet instanceof Fighter) {
						((Fighter)jet).Fight();
					}
				}
				break;
			case 7:
//				mod, sp, rng, price
				System.out.println("To add a new jet please enter jet type (Cargo, Fighter or Passenger); ");
				String type = scan.next();
				System.out.println("Please enter Model, Speed, Range and Price. Press Enter after each field");
				String model = scan.next();
				Double speed = scan.nextDouble();
				int range = scan.nextInt();
				long price = scan.nextLong();
//				Jet newJet = null;
				if (type.equalsIgnoreCase("Cargo")) {
			    	af.addJet(new CargoPlane(type, model, speed, range, price));
			    }
			    else if(type.equalsIgnoreCase("Fighter")) {
			    	af.addJet(new Fighter(type, model, speed, range, price));
			  
			    }
			    else {
			    	af.addJet(new JetPass(type, model, speed, range, price));
			    }
				
						
				break;
			case 8:
				int remCount = 1;
				for (Jet jet : af.getAirfield()) {
					System.out.println(remCount + ". " + jet.getType() + " " + jet.getModel());
					remCount++;	
				}
				System.out.println("Please choose the number of the jet you would like to remove: ");
				int userRemNum = scan.nextInt();
				af.removeJet(userRemNum - 1);
				System.out.println("The jet you chose has been removed.");
				
				break;
			case 9:
				System.out.println("Thank you for using The Jets Program.");
					keepGoing = false;
				
				break;
			default:
				break;
			}
		}
		
	}
}

