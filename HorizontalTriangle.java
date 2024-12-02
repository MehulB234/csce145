import java.util.Scanner;
public class HorizontalTriangle {

	public static void main(String[] args) {
		// Mehul Bellukutty
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the height of the triangle: ");

		int height=key.nextInt();
		
		for(int i=1; i<=height; i++)
		{
			for(int j=1; j<=i;j++) 
			{
				System.out.print("*");	
			}
			
			System.out.println();
		}

		for(int i=height-1;i>=1;i--)
		{
			for(int j=1; j<=i;j++) 
			{
				System.out.print("*");	
			}
			
			System.out.println();
		}
		
		System.out.println("\nEnd of program!");
	}

}
