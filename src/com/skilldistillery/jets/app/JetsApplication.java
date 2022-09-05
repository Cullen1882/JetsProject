package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
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
			case '1':
				System.out.println(AirField.getAirfield());;
				break;
			case '2':
				break;
			case '3': 
				break;
			case '4':
				break;
			case '5':
				break;
			case '6':
				break;
			case '7':
				break;
			case '8':
				break;
			case '9':
				break;
			default:
				break;
			}
		}
		
	}
}
