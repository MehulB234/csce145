import java.util.Scanner;
public class MatricesAssigment {

	public static void main(String[] args) {
		// Mehul Bellukutty
		
		int rows1, cols1, rows2, cols2;
		
		Scanner key = new Scanner (System.in);
		
		System.out.println("Input the values of the matrices so that they are equal in dimension!");
		
		while (true) 
		{
			System.out.println("How many rows are in the first matrix?");
			
			rows1 = key.nextInt();
			
			System.out.println("How many columns are in the first matrix?");
			
			cols1 = key.nextInt();
			
			System.out.println("How many rows are in the second matrix?");
			
			rows2 = key.nextInt();
			
			System.out.println("How many columns are in the second matrix?");
			
			cols2 = key.nextInt();
			
			if (rows1 == rows2 && cols1 == cols2)
			{
				break;
			}
			
			System.out.println("Your values are unequal! Please have the values of the matrices be equal in dimension!");
		}
		
		int [] [] matrix1 = new int [rows1] [cols1];
		
		int [][] matrix2 = new int [rows2] [cols2];
		
		for (int x = 0; x < rows1; x++)
		{
			System.out.println("Enter " + cols1 + " numbers for row " + (x+1) + " for matrix 1: (Leave a space in between the numbers)");
			
			for (int y = 0; y < cols1; y++)
			{
				matrix1 [x][y] = key.nextInt();
			}
		}
		
		for (int x =0; x < rows2; x++)
		{
			System.out.println("Enter " + cols2 + " numbers for row " + (x+1) + " for matrix 2: (Leave a space in between the numbers) ");
			
			for (int y = 0; y < cols2; y++)
			{
				matrix2 [x][y] = key.nextInt();
			}
			
		}
		
		for (int x = 0; x < rows2; x++)
		{
			for(int y = 0; y < cols2; y++)
			{
				matrix2[x][y] = matrix1[x][y] + matrix2[x][y];
				System.out.println (matrix2[x][y] + " ");
			}
			System.out.println("");
		}
		
	}

}
