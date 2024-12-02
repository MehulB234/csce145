import java.util.Scanner;

public class Lab02 {

	private static final double acceleration = 9.8;

	public static void main(String[] args) {
		// Mehul Bellukutty
		
		Scanner key = new Scanner (System.in);
		
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A");
		
		double initial  = key.nextDouble();
		
		System.out.println ("How much time (in seconds) does the ball take to reach point B?");
		
		double time = key.nextDouble();
		
		double velocity = initial + acceleration * time ;
		
		double distance = initial * time + 0.5 * acceleration * Math.pow(time, 2);
		
		System.out.println("Final Velocity = " + velocity  + " m/s");
		
		System.out.println("Distance Traveled by the ball (S) = " + distance + " meters");
	
	}
}