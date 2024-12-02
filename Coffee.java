import java.util.Scanner;

 // Mehul Bellukutty
  // This class represents a single cup of coffee with its properties and methods.
public class Coffee 
{
    private String name; // Name of the coffee
    private double caffeineContent; // Caffeine content in milligrams
    private String type; // Type of coffee

    // Default constructor
    public Coffee() 
    {
        this.name = "none";
        this.caffeineContent = 50;
        this.type = "unknown";
    }

    // Constructor with parameters
    public Coffee(String xName, double xcaffeineContent, String xType) 
    {
        this.setName(xName);
        this.setCaffeineContent(xcaffeineContent);
        this.setType(xType);
    }

    // Methods
    public void readInput() 
    {
        Scanner key = new Scanner(System.in);

        System.out.print("What’s the name of the coffee? ");
        name = key.nextLine();

        while (true) {
            System.out.print("What’s the caffeine content? ");
            if (key.hasNextDouble()) {
                double caffeineAmount = key.nextDouble();
                if (caffeineAmount >= 50 && caffeineAmount <= 300) {
                    caffeineContent = caffeineAmount;
                    break;
                } else {
                    System.out.println("Caffeine content must be between 50 and 300 mg.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                key.next();
            }
        }
        key.nextLine();
    }

    // Accessors
    public String getName() 
    {
        return this.name;
    }

    public double getCaffeineContent() 
    {
        return this.caffeineContent;
    }

    public String getType() 
    {
        return this.type;
    }

    // Mutators
    public void setName(String xName) 
    {
        this.name = xName;
    }

    public void setCaffeineContent(double xcaffeineContent)
    {
        if (xcaffeineContent >= 50 && xcaffeineContent <= 300) 
        {
            this.caffeineContent = xcaffeineContent;
        } else 
        {
            System.out.println("Invalid caffeine content. Must be between 50 and 300 mg.");
        }
    }

    public void setType(String xType) 
    {
        this.type = xType;
    }

    // Risky Amount Method
    public double riskyAmount() 
    {
        return 180.0 / ((caffeineContent / 100.0) * 6.0);
    }

    // Equals
    public boolean equals(Coffee other)
    {
        if (other == null) return false;
        return this.name.equals(other.name) && this.caffeineContent == other.caffeineContent;
    }

    // ToString
    public String toString() 
    {
        return "Coffee Name: " + this.name + "\nCaffeine Amount: " + this.caffeineContent + " mg";
    }
}
