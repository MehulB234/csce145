import java.util.Scanner;
public class lab03 {

	public static final double PRICE= 99.00;
	public static void main(String[] args) {
		// Mehul Bellukutty
		
		Scanner key = new Scanner (System.in);
		
		System.out.println("Enter the total quantity of software packages you have ordered! ");
		
		int quantity = key.nextInt();
		
		double discount = 0.0;
						
		// input validation
		if (quantity < 0)
		{
			System.out.println("Invalid quantity entered! Exiting the program!");
			System.exit(0);
		}
		if (quantity >= 10 && quantity <= 19)
		{
			System.out.println("Your discount is 20%!");
			discount   = 0.2;
		}
		else if (quantity >= 20 && quantity <= 49)
		{
			System.out.println("Your discount is 30%!");
			discount  = 0.3;
		}
		else if (quantity >= 50 && quantity <= 99)
		{
			System.out.println("Your discount is 40%!");
			discount  = 0.4;
		}
		else if (quantity >=100)
		{
			System.out.println("Your discount is 50%!");
			discount  = 0.5;
		}
		
		double originalbill = PRICE * quantity;
		
		double discountamt = originalbill * discount;
		
		double finalbill = originalbill - discountamt;
		
		System.out.println(" \nTotal Bill Amount (before discount) = $" + originalbill);
		
		System.out.println(" \nAmount of Discount = $"+ discountamt);
		
		System.out.println(" \nTotal Bill Amount (after discount) = $" + finalbill);

	}

}
