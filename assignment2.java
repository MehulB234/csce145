import java.util.Scanner;
import java.util.Random;
public class assignment2 {
	public static final int MAX = 100;
	public static int maxattempts = 0;
	public static void main(String[] args) {
		// Mehul Bellukutty
		Scanner key = new Scanner (System.in); // Created new scanner
		
		Random r = new Random(); // Used this for my random password generator. 
		
		System.out.println("You went exploring into an abandoned hotel and your flashlight has just ran out of batteries. "
				+ "You are currently on the 4th floor stairs, with their being 12 floors at this hotel. "
				+ "You can either go up the stairs to the 5th floor, down the stairs to the 3rd floor, or to the 4th floor. "
				+ "Enter \"3rd\" , \"4th\", or \"5th\" ");
		// Giving them 3 options, 3rd floor, 4th floor or 5th floor. 
		
		String response = key.next();
		
		if(response.equalsIgnoreCase("3rd"))
		{
			System.out.println("You went down to the 3rd floor! For some strange reason, "
					+ "the 3rd floor door has a keypad lock requiring a positive two digit number. It states on the keypad that you have 5 attempts, and after that, the police are alerted. "
					+ "Would you like to attempt to guess the keypad lock or go down to the 2nd floor? Enter \"guess\" or \"2nd\" ");
			response = key.next();
			
			if (response.equalsIgnoreCase("2nd"))
			{
				System.out.println("You went to the 2nd floor! "
						+ "There is a big white sign that states that the floor is under construction, "
						+ "but there doesn't seem to be any noise through the door. Would you like to knock on the door or just open it? "
						+ "Enter \"knock\" or \"open\" ");
				response = key.next();
				
				if(response.equalsIgnoreCase ("knock"))
				{
					System.out.println("A man with a very deep voice tells you to go away, as construction is currently going on."
							+ "You listen to the man and leave the floor feeling demoralized which results in you leaving the hotel...");
					System.exit(0);
				}
				
				else if (response.equalsIgnoreCase ("open"))
				{
					System.out.println("A construction worker at the end of the hall sees you and questions how old you are. Enter your age here: ");
					int age = key.nextInt();
					
					if (age < 18 || age > 65) // This is also a compound boolean expression. 
					{
						System.out.println("The man yells at you, saying that you are " +age + " and are not fit to work on this floor and to leave the area now! "
								+ "You get scared and leave the hotel...");
						System.exit(0);
					}
					else if (age > 18 || age < 65) // This is a numeric comparison. 
					{
						System.out.println("The man yells at you, saying that you are " +age + " and should be helping him to fix this door. "
								+ "You get stuck working construction for the rest of the night and finally leave the hotel in the morning...");
						System.exit(0);
					}
				}
			}
			else if (response.equalsIgnoreCase ("guess"))
			{
				int secretNumber = r.nextInt(MAX); // generating a value between 0 and 99 so it will be different for every different player of the game
				System.out.println("Hello, this is a secure electronic keypad. You have 5 attempts before the police will be alerted");
				
				boolean correctGuess = false;
				
				while (correctGuess == false)
				{
					System.out.println("Enter your guess:");
					
					int guess = key.nextInt();
						
					if (guess > 99 || guess < 0 ) // This is a compound boolean expression.
					{
						System.out.println("Invalid value entered!");
						System.exit(0);
						//input validation
					}
					
					if (guess < secretNumber)
					{
						maxattempts ++; // I learned how to make attempts add up and count in my CS class in HS, makes it so each attempt is being counted.
						System.out.println("Your guess is too low! Pick a larger value!");
					}
					
					else if (guess > secretNumber)
					{
						maxattempts ++;
						System.out.println("Your guess is too high! Pick a smaller value");
					}
					
					else if (guess == secretNumber)
					{
						maxattempts ++;
						System.out.println("Your guess is correct!!!");
						correctGuess = true;
					}
					
					else
					{
						System.out.println("Invalid value entered!");
					}	
				
					if (maxattempts > 5) // The attempts are limited to 5 through this code. This is also a numeric comparison. 
					{
						System.out.println("The police have been alerted! You have been caught and escorted out by the police! "
								+ "Your fun exploring the hotel has now come to an end, and you have been taken back to your house...");
						System.exit(0);
					}
					
					if (correctGuess == true)
					{
						System.out.println("You have been granted access into the 3rd floor. Proceed with caution! "
								+ "\n You see a figure moving at the end of the hall. "
								+ "You can either run after the figure or leave the building. Enter \"run\" or \"leave\" ");
						response = key.next();
						
						if (response.equalsIgnoreCase ("run"))
						{
							System.out.println("You chase after the creature, and eventually catch up to it in the final room of the floor."
									+ "You can either ask him a question, or take a picture and leave. Enter \"Question\" or \"picture\"");
							response = key.next();
							
							if (response.equalsIgnoreCase("question"))
							{
								System.out.println("You question the creature to why he is here and he can only mutter 3 words, telling you that java \n is \n fun...");
								System.exit(0);
							}
							
							else if (response.equalsIgnoreCase("picture"))
							{
								System.out.println("You take a picture and then leave the hotel, only to realize "
										+ "12 hours later that the creature did not show up in the picture...");
								System.exit(0);
							}
						
						else if (response.equalsIgnoreCase ("leave"))
						{
							System.out.println("You leave the building after being frightened by the sight of the creature and go home"
									+ "to your cozy bed instead of being stuck at a scary hotel...");
							System.exit(0);
						}		
					}	
				}
			}
		// This is all the code that was required for the 3rd floor part of the adventure story. 	
		}
		}
		
		else if(response.equalsIgnoreCase("4th"))
		{
			System.out.println("You have made it to the 4th floor! Would you like to go left or right? Enter \"left\" or \"right\" ");
			
			response = key.next();
			
			if (response.equalsIgnoreCase ("left"))
			{
				System.out.println("You turned left on the 4th floor and have just ran into 2 security guards telling you that you have to leave the premises right now"
						+ "You sigh and agree to cooperate with the security guards, and leave the hotel with a frown and a flashlight without working batteries...");
				System.exit(0);
			}
			
			else if (response.equalsIgnoreCase ("right"))
			{
				System.out.println("You turned right on the 4th floor and have accidently ran into a dead end that has a vending machine! "
						+ "Would you like to buy something from the vending machine or would you like to leave the hotel? "
						+ "Enter \"buy\" or \"leave\"");
				
				response = key.next();
				
				if (response.equalsIgnoreCase ("buy"))
				{
					System.out.println("The vending machine takes your money and doesn't give you anything! You kick it out of "
							+ "frustration and end up leaving the hotel");
					System.exit(0);
				}
				
				else if (response.equalsIgnoreCase("leave"))
				{
					System.out.println("You leave the hotel after being so bored of your adventure over the last 1 hour. You end up realizing "
							+ "that sometimes, abandoned places doesn't mean fun and sometimes aren't actually abandoned...");
					System.exit(0);
				}
			}
		}	// This was all the code required for the 4th floor part of the adventure story. 
		
		else if(response.equalsIgnoreCase("5th"))
		{
			System.out.println("You go all the way up to the 5th floor, and end up at a giant ball pit that requires you to answer a math question to enter into the gaga ball pit. "
					+ "You can either answer the question on the lock and open"
					+ " the door to the pit, or realize"
					+ "that your adventure was all for not and leave back to your home. Enter \"answer\" or \"leave\" ");
			response = key.next();
			
			if (response.equalsIgnoreCase("answer"))
			{
				System.out.println("Please answer this question: What is 1 * 1? ");
				
				int answer = key.nextInt();
				
				int passcode = 1;
				
				if (answer == passcode)// This is a String Comparison. 
				{
					System.out.println("The lock tells you 'Congrats! You can get into the ball pit!' You then proceed to play in the gaga ball pit for an hour before realizing that it "
							+ "is too late and that it is time that you  head back home...");
				}
				else if (answer != passcode) // This is a numeric comparison. 
				{
					System.out.println("Wrong!!! It's time for you to go home. You proceed to go home with your head down in shame...");
				}
			}	
		}
	} // This was all the code required for the 5th floor section of the adventure story. 

}

// For this adventure story there are 10 endings with about 5 of the endings requiring 3 decisions or more. 
