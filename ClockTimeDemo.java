import java.util.Scanner;

public class ClockTimeDemo {
	// Mehul Bellukutty
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) 
        {
            try 
            {
                // Asking for hours, minutes, and seconds
            	
                System.out.println("Enter the hours on the military clock:");
                int hours = Integer.parseInt(key.nextLine());

                System.out.println("Enter the minutes on the military clock:");
                int minutes = Integer.parseInt(key.nextLine());

                System.out.println("Enter the seconds on the military clock:");
                int seconds = Integer.parseInt(key.nextLine());

                // Create the first TimeConverter object
                
                TimeConverter militarytime = new TimeConverter();
                militarytime.updateTime(hours, minutes, seconds);
                System.out.print("12-hour clock time → ");
                militarytime.displayTime();

                // Ask for time in "hours:minutes:seconds" format
               
                System.out.println("Enter 24 hour clock time in the format \"hours:minutes:seconds\":");
                String timeString = key.nextLine();

                // Create the second TimeConverter object
                TimeConverter Normaltime = new TimeConverter();
                Normaltime.updateTime(timeString);
                System.out.print("12-hour clock time → ");
                Normaltime.displayTime();
                
                // Ask user if they want to continue
                System.out.println("Would you like to do this again? Enter \"Yes\" or \"No\":");
                String answer = key.nextLine();
                repeat = answer.equalsIgnoreCase("Yes");
            } 
            catch (TimeException e) 
            {
                System.out.println(e.getMessage());
            } 
            catch (Exception e) 
            {
                System.out.println("Invalid input! Please try again.");
            }
        }

        System.out.println("Exiting the program!");
        System.exit(0);
    }
}
