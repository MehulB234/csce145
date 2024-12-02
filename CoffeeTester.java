import java.util.Scanner;
 // Mehul Bellukutty
 // This class tests the Coffee class by creating instances and checking their properties.

public class CoffeeTester 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) 
        {
            // Creatng 2 coffee objects
            Coffee a1 = new Coffee();
            a1.readInput(); // Get details for the first coffee

            System.out.println(a1.toString());
            System.out.printf("It would take %.1f cups of %s before it’s dangerous to drink more.\n",
                              a1.riskyAmount(), a1.getName());

            Coffee a2 = new Coffee();
            a2.readInput(); // Get details for the second coffee

            System.out.println(a2.toString());
            System.out.printf("It would take %.1f cups of %s before it’s dangerous to drink more.\n",
                              a2.riskyAmount(), a2.getName());

            // Check if both coffee objects are the same
            System.out.println("Are both coffees the same? " + a1.equals(a2));

            // Continue or Stop?
            System.out.print("Do you want to create more coffee objects? Enter 'Yes' or 'No': ");
            String response = key.nextLine();
            continueProgram = response.equalsIgnoreCase("Yes");
        }
        
        System.out.println("Thank you for using the Coffee Hour Program!");
        System.exit(0);
    }
}