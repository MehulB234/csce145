import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		// Mehul Bellukutty
		
		Scanner key = new Scanner(System.in);

		System.out.println("How many books did you purchase at BN booksellers this month?");
		
		int books = key.nextInt();
		
		String points = "";
		
		if (books < 0)
		{
			System.out.println("Invalid value entered! Exiting the program!");
			System.exit(0);
		}
			switch(books)
			{
			case 0:
				points = "You have earned 0 points.\n"
						+ "Make a book purchase to start earning points!";
				break;
			case 1:
				points = "Congratulations!!! You have earned 5 points!\n"
						+ "You may redeem these points on your next book purchase!";
				break;
			case 2:
				points = "Congratulations!!! You have earned 15 points!\n"
						+ "You may redeem these points on your next book purchase!";
				break;
			case 3:
				points = "Congratulations!!! You have earned 30 points!\n"
						+ "You may redeem these points on your next book purchase!";
				break;
				
			default:
				System.out.println("Congratulations!!! You have earned 60 points!\n"
						+ "You may redeem these points on your next book purchase!");
				}
		
		System.out.println(points);
		
	}

}
