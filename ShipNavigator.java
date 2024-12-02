// Mehul Bellukutty

import java.util.Scanner;

public class ShipNavigator {
    public static void main(String[] args) {
    	
        Scanner key = new Scanner(System.in);
        String continueFlag;

        System.out.println("Welcome to the Ship Navigator!!!");

        do 
        {
            // Ship details
            System.out.print("Enter the name of the ship: ");
            String name = key.nextLine();
            System.out.print("Enter its launch date (mm/dd/yyyy): ");
            String launchDate = key.nextLine();

            // Ship type
            System.out.print("Is it a cruise ship or a cargo ship? ");
            String type = key.nextLine().toLowerCase();

            if (type.equalsIgnoreCase("cruise ship")) 
            {
                System.out.print("Enter the ship's passenger capacity: ");
                int passengerCapacity = key.nextInt();
                System.out.print("How many crew members are on this ship? ");
                int crewCount = key.nextInt();
                key.nextLine();

                CruiseShip cruiseShip = new CruiseShip(name, launchDate, passengerCapacity, crewCount);
                System.out.println("Creating a cruise ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cruiseShip);

            }
            else if (type.equalsIgnoreCase("cargo ship")) 
            {
                System.out.print("Enter the ship's tonnage (DWT): ");
                double tonnage = key.nextDouble();
                System.out.print("Enter the maximum speed of the ship (in mph): ");
                double maxSpeed = key.nextDouble();
                key.nextLine();

                CargoShip cargoShip = new CargoShip(name, launchDate, tonnage, maxSpeed);
                System.out.println("Creating a cargo ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cargoShip);

            }
            else 
            {
                System.out.println("Invalid ship type. Please enter 'cruise ship' or 'cargo ship'.");
            }

            System.out.print("Do you want to construct another ship object? Enter yes or no: ");
            continueFlag = key.nextLine();

        } 
        while (continueFlag.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");
        System.exit(0);  
        }
}
