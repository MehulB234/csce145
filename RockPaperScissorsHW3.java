import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsHW3 {

	public static void main(String[] args) {
		// Mehul Bellukutty
		
		Scanner key = new Scanner(System.in); // New scanner item
		
		Random r = new Random(); // To be able to use random
		
		System.out.println("Welcome to a game of Rock, Paper, Scissors! \n");
		
		int userpoints = 0; // Points the user gets for winning a round. First to 2 will win. 
		
		int computerpoints = 0; // Points the computer gets for winning a round. First to 2 will win. 
		
		String keepgoing = "yes";
		
		while (keepgoing.equalsIgnoreCase("yes")) // Had to make a while loop
		{
			for(int round = 1; round <= 3; round++) // round can go up to 3 rounds. 
			{
				System.out.println("Round " + round + ": What do you choose? ");
				
				String choice = key.nextLine();
			
				if (choice.equalsIgnoreCase("rock")) 
				
				{	
					int answer = r.nextInt(0,2);
					
					String computer = "";
					
					switch(answer) // Switch to get a random decision between rock, paper and scissors for the computer. 
					{
					case 0:
						computer = "rock";
						break;
					case 1:
						computer = "paper";
						break;
					case 2:
						computer = "scissors";
						break;
					}
					
					if (computer.equals("rock")) 
					{	
						System.out.println("The computer picked rock, you tied.\n");
					} 
				
					else if (computer.equals("paper")) 
					{
						System.out.println("The computer picked paper, the computer wins.\n");
						computerpoints++;	
					} 
					
					else if (computer.equals("scissors")) 
					{
						System.out.println("The computer picked scissors, you win!\n");
						userpoints++;
					}	
					
				} 
				else if (choice.equalsIgnoreCase("Paper")) 
				{
					int answer = r.nextInt(0,2);
					
					String computer = "";
					
					switch(answer) 
					{
					case 0:
						computer = "rock";
						break;
					case 1:
						computer = "paper";
						break;
					case 2:
						computer = "scissors";
						break;
					}
					if (computer.equals("rock")) 
					{
						System.out.println("The computer picked rock, you win!\n");
						userpoints++;	
					} 
					else if (computer.equals("paper")) 
					{
						System.out.println("The computer picked paper, you tied\n");
						
					} 
					else if (computer.equals("scissors")) 
					{
						System.out.println("The computer picked scissors, the computer wins.\n");
						computerpoints++;
					} 
				} 
				else if (choice.equalsIgnoreCase("Scissors")) 
				{
					int answer = r.nextInt(0,2);
					
					String computer = "";
					
					switch(answer) 
					{
					case 0:
						computer = "rock";
						break;
					case 1:
						computer = "paper";
						break;
					case 2:
						computer = "scissors";
						break;
					}
					
					if (computer.equals("rock")) 
					{	
						System.out.println("The computer picked rock, the computer wins.\n");
						computerpoints++;
						
					} 
					else if (computer.equals("paper")) 
					{
						System.out.println("The computer picked paper, you win!\n");
						userpoints++;
						
					} 
					else if (computer.equals("scissors")) 
					{
						System.out.println("The computer picked scissors, you tied.\n");
						
					}
						
				} 
				else 
				{
					System.out.println("Input Invalid, The computer wins.\n");
					computerpoints++;
				}
				if (userpoints >= 2) 
				{
					break;
				} 
				else if (computerpoints >= 2) 
				{
					break;
				}
			}

			if (userpoints == 2) 
			{
				System.out.println("You win the game!\n");

			} 
			else if (computerpoints == 2) 
			{
				System.out.println("\nThe computer wins the game.\n");

			} 
			else 
			{
				System.out.println("The game is a draw \n");
			}

			System.out.println("Do you want to play another game of rock, paper, scissors? Type \"yes\" to keep going and \"no\" to stop.");
			String rematch = key.nextLine();

			if (rematch.equalsIgnoreCase("yes")) // To play the game over again. 
			{
				keepgoing = "yes";
				userpoints = 0;
				computerpoints = 0;
			} 
			
			else if (rematch.equalsIgnoreCase("no")) // To stop playing the game. 
			{
				keepgoing = "no";
				System.out.println("\nThanks for Playing!");
			} 
			
			else 
			{
				System.out.println("Input invalid, system will exit."); // This is input validation. 
				System.exit(0);
			}
		
		}
	}

}
