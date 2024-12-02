// Mehul Bellukutty

public class Ship {
    private String name;
    private String launchDate; // Format is in mm/dd/yyyy

    // Constructor
    public Ship(String name, String launchDate) 
    {
        this.name = name;
        setLaunchDate(launchDate);
    }

    // Accessors
    public String getName() 
    {
        return name;
    }

    public String getLaunchDate() 
    {
        return launchDate;
    }

    // Mutators
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setLaunchDate(String launchDate) 
    {
        String[] parts = launchDate.split("/");
        
        int year = Integer.parseInt(parts[2]);
        
        if (year >= 1990 && year <= 2019) 
        {
            this.launchDate = launchDate;
        } 
        else 
        {
            System.out.println("Error: Launch date out of range (1990-2019). Setting default: 01/01/1990");
            this.launchDate = "01/01/1990";
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nLaunch Date: " + launchDate;
    }
}
