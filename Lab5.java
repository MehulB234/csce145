import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// Mehul Bellukutty
		
		Scanner key = new Scanner (System.in);
		
		System.out.println("How many dollars ($) would you like to spend on chocolate from the vending machine?");
		
		int chocolate = key.nextInt();
		
		int TotalBars = chocolate;
		
		int coupons = chocolate;
		
		if (chocolate < 0)
		{
			System.out.println("Invalid value entered for dollar amount! Exiting the program.");
			
			System.exit(0);
		}
			
		while (coupons >= 6)
			{
				int CouponBars = coupons/6;
				
				TotalBars = TotalBars + CouponBars;
				
				coupons = coupons %6 + CouponBars;
			}
		
		System.out.println("You can buy " + TotalBars + " chocolate bars and will have " + coupons + " coupons left over!");
		
		

	}

}
