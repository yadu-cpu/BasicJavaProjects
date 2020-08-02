package ClassAndObjects;

import java.io.IOException;
import java.util.Scanner;

public class Car {
	 static String carColour;
	 static String carModelName;
	 static int carPrice;
	 static int carMilege;
	 static String carBrandName;

	public static void i10() {
		System.out.println("I10 details");
		carColour = "Grey";
		carModelName = "Sports 1.0";
		carPrice = 600000;
		carMilege = 20;
		System.out.println("Available car colour is " + carColour);
		System.out.println("Available car model is " + carModelName);
		System.out.println("Available car price is " + carPrice);
		System.out.println("Available car milege is " + carMilege);
	
	}

	public static void i20() {
		System.out.println("I20 details");
		carColour = "Black";
		carModelName = "Sports 2.0";
		carPrice = 700000;
		carMilege = 22;
		System.out.println("Available car colour is " + carColour);
		System.out.println("Available car model is " + carModelName);
		System.out.println("Available car price is " + carPrice);
		System.out.println("Available car milege is " + carMilege);
	
	}

	public static void reno() {
		System.out.println("Reno Kwid details");
		carColour = "White";
		carModelName = "Sports";
		carPrice = 300000;
		carMilege = 22;
		System.out.println("Available car colour is " + carColour);
		System.out.println("Available car model is " + carModelName);
		System.out.println("Available car price is " + carPrice);
		System.out.println("Available car milege is " + carMilege);
		
	}

	public static void brezza() {
		System.out.println("Vettara Brezza details");
		carColour = "Red";
		carModelName = "Vetara";
		carPrice = 900000;
		carMilege = 19;
		System.out.println("Available car colour is " + carColour);
		System.out.println("Available car model is " + carModelName);
		System.out.println("Available car price is " + carPrice);
		System.out.println("Available car milege is " + carMilege);


	}

	public static void main(String args[]) throws IOException {
		
			System.out.println("1.I10");
			System.out.println("2.I20");
			System.out.println("3.Reno");
			System.out.println("4.Brezza");
			System.out.println("Please enter Car Brand Name you want to");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
		switch (str) {

		case "I10":
					i10();
					break;
		case "I20":
					i20();
					break;
		case "Reno":
			reno();
			break;
		case "Brezza":
			brezza();
						break;
		}
	}

}
