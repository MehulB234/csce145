import java.util.Scanner;

public class Apple 
// Mehul Bellukutty
{
    private String type;
    private double weight;
    private double price;

    // Default constructor
    public Apple() 
    {
        this.type = "Gala";
        this.weight = 0.5;
        this.price = 0.88;
    }

    // Parameterized constructor
    public Apple(String xType, double xWeight, double xPrice) 
    {
        setType(xType);
        setWeight(xWeight);
        setPrice(xPrice);
    }

    // Accessors
    public String getType() 
    {
        return type;
    }

    public double getWeight() 
    {
        return weight;
    }

    public double getPrice() 
    {
        return price;
    }

    // Mutators with validation
    public void setType(String xType) 
    {
        if (xType.equals("Red Delicious") || xType.equals("Golden Delicious") ||
            xType.equals("Gala") || xType.equals("Granny Smith")) 
        {
            this.type = xType;
        } else 
        {
            System.out.println("Invalid value for type!");
            this.type = null;
        }
    }

    public void setWeight(double xWeight) 
    {
        if (xWeight > 0 && xWeight <= 2) 
        {
            this.weight = xWeight;
        } else 
        {
            System.out.println("Invalid value for weight!");
            this.weight = 0;
        }
    }

    public void setPrice(double xPrice) 
    {
        if (xPrice >= 0) 
        {
            this.price = xPrice;
        } else 
        {
            System.out.println("Invalid value for price!");
            this.price = 0;
        }
    }

    // Method to display output
    public void writeOutput() 
    {
        System.out.println("Type: " + (type == null ? "null" : type));
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: $" + price);
    }
}