import java.util.Scanner;
public class FirstAssignment {

	public static void main(String[] args) {
		// Mehul Bellukutty
		
		Scanner key = new Scanner (System.in);
		// creating a new scanner item
		
		System.out.println("What is your first name?");
		
		String firstname = key.nextLine();
		
		System.out.println("What is your last name?");
		
		String lastname = key.nextLine ();
		// Asking for their name and storing the input of the user. 
		
		System.out.println("What is your age (in years)?");
		
		int age = key.nextInt();
		// asking for their age and storing as an integer as it will be between 0-100 so it makes more sense to store it as an integer. 
		
		System.out.println("What is your phone number? (Enter without any dashes or parantheses)");
		
		key.nextLine();
		// I had to do this to make sure the integer wasn't affecting the string,as whenever I would test it, it was interfering with it. 
		
		String phonenumber = key.nextLine();
		
		System.out.println("What is your major at UofSC?");
		
		String major = key.nextLine();
		
		System.out.println("What year are you? (freshman, sophmore, junior or senior)");
		
		String year = key.nextLine();
		
		System.out.println("What is today's date (MM/DD/YYYY format)?");
		
		String date = key.nextLine();
		// I just asked for the user's major, year and the date and stored it. 
		
		System.out.println("What is your favorite sport to play?");
		
		String sport = key.nextLine();
		
		System.out.println("What is your favorite flavor of chips?");
		
		String flavor = key.nextLine();
		
		System.out.println("What city were you born in?");
		
		String birthplace = key.nextLine();
		// I asked three new questions about their favorite sport to play, their favorite flavor of chips and what city they were born in. 
		
		int birthyear = 2024 - age;
		// This is the formula to get their age, it may be a little inaccurate for people with birthdays in October, November and December 
		// as they will turn 19 soon. 
		
		String month = date.substring(0,2);
		
		String day = date.substring(3,5);
		
		String yr = date.substring(6,10);
		// I am using strings and substrings to separate the month, day and year and organize it back into the European format. 
		
		String areacode = phonenumber.substring(0,3);
		
		String prefix = phonenumber.substring (3,6);
		
		String line = phonenumber.substring(6,10);
		// I am using strings and substrings to separate the area code, prefix and the line number and then organizing it
		// into a proper phone number that can be easily read and understood. 
		
		System.out.println("Here's a quick intro for " + firstname + " " + lastname + "! \nYou were born in the year " + birthyear + " in the city of " + birthplace + "."
				+ " In your free time you love to eat " + flavor + " potato chips and you also love to play " +sport + ". You are a "
						+ year + " at UofSC majoring in " + major + "." + 
				" You can be reached at " + "(" +areacode + ")" +prefix + "-" +line + "." + " You are now officialy a gamecock!"+
		"\nLast updated: " +day + "." +month +"." +yr);
		// This is the finished paragraph, 	
		
}
}
