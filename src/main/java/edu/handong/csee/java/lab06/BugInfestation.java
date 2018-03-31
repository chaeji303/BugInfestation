package edu.handong.csee.java.lab06;

public class BugInfestation {
	
	int houseVolume, startPopulation, countWeeks, population;
	int totalBugVolume, newBugs, newBugVolume;
	int GROWTH_RATE = 0.95;
	int ONE_BUG_VOLUME = 0.002;

	
	
	



	public static void main(String[] args) { //main
	
		Scanner keyboard = new Scanner(System.in); //
		
		System.out.println("Enter the total volume of your house"); //message for user
		System.out.println("in cubic feet: "); //message for user
		int volume = keyboard.nextInt(); //
		
		System.out.println("Enter the estimated number of"); //message for user
		System.out.println("roaches in your house: "); //message for user
		int roach = keyboard.nextInt();
		
		keyboard.houseVolume = volume;
		keyboard.startPopulation = roach;
		
		System.out.println("Starting with a roach population of " + roach ); //message for user
		System.out.println("and a house with a volume of " + cubic + "cubic feet,"); //message for user
		System.out.println("after 18 weeks,"); //message for user
		System.out.println("the house will be filled with " + + "roaches."); //message for user
		System.out.println("They will fill a volume of " + + "cubic feet."); //message for user
		System.out.println("Better call Debugging Experts Inc."); //message for user

	}


