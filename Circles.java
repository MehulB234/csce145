import java.util.Scanner;
public class Circles {
	
	public static final double PI = 3.14; // Have to store Pi as a variable for the formula
	
	// Mehul Bellukutty
	
	public static void main(String[] args) {
		
		int EachRadiiCounter = 0;
		
		Scanner key = new Scanner (System.in);
		
		boolean validAmount = false;
		
		int numberofcircles;
		
		do //Asks for the # of circles being stored
		{
			System.out.println("How many circles do you want to store today?");
			
			numberofcircles = key.nextInt();
			
			if (numberofcircles < 0)
			{
				System.out.println("Invalid amount entered! Please try again with a valid amount.");
			}
			
			else if (numberofcircles == 0)
			{
				System.out.println("Cannot sort an empty list! Please try again with a valid amount.");
			}
			
			else if (numberofcircles > 0)
			{
				validAmount = true;
			}
		}
		while (validAmount == false);
		
		double [] CirclesArray = new double [numberofcircles];
		
		for (int i = 0; i < CirclesArray.length; i++)
		{
			System.out.println("Enter the radius of circle at index " + i + ": ");
			
			double radius = key.nextDouble();
			
			double radiusCalculations = PI * (radius * radius); // This is the formula for the area of a circle
			
			CirclesArray [i] = radiusCalculations;
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Do you want your list sorted from smallest to largest or largest to smallest? "
				+ "Enter \"0\" for the first option and \"1\" for the second option!");
		
		int userResponse = key.nextInt();
		
		if (userResponse == 0) // This option would be smallest to largest
		{
			for (int i = 0; i < CirclesArray.length; i++)
				
			{
				int minIndex = i;
				
				double smallestRadius = CirclesArray[i];
				
				for (int j = i + 1; j < CirclesArray.length; j++)
				{
					if (CirclesArray[i] < smallestRadius)
					{
						smallestRadius = CirclesArray [i];
						
						minIndex = j;
					}
				}
				
				if (CirclesArray[i] > smallestRadius)
				{
					double temp = CirclesArray[i];
					
					CirclesArray[i] = CirclesArray[minIndex];
					
					CirclesArray [minIndex] = temp;
				}
			}
			
			System.out.println();
			
			System.out.println();
			
			System.out.println("List of area of circles provided");
			
			double[] eachValuesArray = new double [numberofcircles];
			
			int[] count = new int [CirclesArray.length];
			
			for(int i = 0; i < CirclesArray.length; i++)
			{
				count[i] = 1;
				
				for (int j = 0; j < CirclesArray.length; j++)
				{
					if (CirclesArray[i] == CirclesArray[j]) {
						count[i]++; 
						
						count [j] = 0;
					}
						
				}
			}
		for (int i = 0; i < count.length; i++)	
		{
			if (count[i] == 1)
			{
				eachValuesArray [EachRadiiCounter] = CirclesArray[i];
				
				EachRadiiCounter++;
			}
		}
		
		System.out.println("Unique Values of Array Entered: ");
		
		for (int k = 0; k < EachRadiiCounter; k++)
		{
			System.out.println(eachValuesArray[k]);
			
			if (k < EachRadiiCounter)
			{
				System.out.println(",");
			}
		}	
		
		}
		
		if (userResponse == 1) //This is sorting largest to smallest
		{
			for (int i = 0; i < CirclesArray.length; i++)
			{
				int maxIndex = i;
				
				double largestRadius = CirclesArray[i];
				
				for (int j = i + 1; j < CirclesArray.length; j++)
				{
					if (CirclesArray[i] > largestRadius)
					{
						largestRadius = CirclesArray[i];
						
						maxIndex = j;
					}
					
					if (CirclesArray[i] < largestRadius)
					{
						double temp = CirclesArray[i];
						
						CirclesArray[i] = CirclesArray[maxIndex];
						
						CirclesArray[maxIndex] = temp;
					}
				}
			}
			
			double [] eachValuesArray = new double [numberofcircles];
			
			for (int i = 0; i < CirclesArray.length; i++)
			{
				boolean notUnique = false;
				
				for (int j = 0; j < EachRadiiCounter; j++)
				{
					if (eachValuesArray[j] == CirclesArray[i])
					{
						notUnique = true;
						
						break;
					}
				}
				
				if (notUnique == false)
				{
					eachValuesArray[EachRadiiCounter] = CirclesArray[i];
					
					EachRadiiCounter++;
				}
			}
			
			double [] newCirclesArray = new double [EachRadiiCounter];
			
			System.out.println();
			
			System.out.println();
			
			System.out.println("List of area of circles provded!");
			
			for (int i = 0; i < EachRadiiCounter; i++)
			{
				newCirclesArray[i] = eachValuesArray[i];
			}
			
			System.out.println();
			
			for (int i = 0; i < newCirclesArray.length; i++)
			{
				System.out.print(newCirclesArray[i]+ " ");
			}
			
			System.out.println();
			
			System.out.println();
			
			System.out.println("System sorting over. Exiting program!");
			
			System.exit(0);	
		}
		
		else if (userResponse != 0 && userResponse != 1)
		{
			System.out.println();
			
			System.out.println("Invalid number entered. Please pick between 1 or 2! Exiting the program!");
			
			System.exit(0);
		}
		
	}

}
