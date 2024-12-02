import java.util.Scanner;

public class AppleTester {
	// Mehul Bellukutty
    public static void main(String[] args) {
    	
        Scanner key = new Scanner(System.in);

        System.out.println("Welcome to the Apple tester!!!");

        // Using the default constructor to create the 1st apple. 
        
        System.out.println("Creating the first apple!");
        
        Apple a1 = new Apple();
        
        System.out.println("Default values of the first apple object:");
        
        a1.writeOutput();

        // Get the input for the 2nd apple object
        
        System.out.println("Enter the type of the second apple object:");
        
        String type = key.nextLine();
        
        System.out.println("Enter the weight of the second apple object:");
        
        double weight = key.nextDouble();
        
        System.out.println("Enter the price of the second apple object:");
        
        double price = key.nextDouble();

        // Creating the second apple object using the parameterized constructor
        
        System.out.println("Creating the second apple object!");
        
        Apple a2 = new Apple(type, weight, price);

        // Displaying the values of the second apple
        
        System.out.println("Values of the second apple object:");
        
        a2.writeOutput();

    }
}