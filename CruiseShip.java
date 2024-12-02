// Mehul Bellukutty

public class CruiseShip extends Ship {
    private int passengerCapacity;
    private int crewCount;

    // Constructor
    public CruiseShip(String name, String launchDate, int passengerCapacity, int crewCount) 
    {
        super(name, launchDate);
        this.passengerCapacity = passengerCapacity;
        this.crewCount = crewCount;
    }

    // Accessors
    public int getPassengerCapacity() 
    {
        return passengerCapacity;
    }

    public int getCrewCount() 
    {
        return crewCount;
    }

    // Mutators
    public void setPassengerCapacity(int passengerCapacity) 
    {
        this.passengerCapacity = passengerCapacity;
    }

    public void setCrewCount(int crewCount) 
    {
        this.crewCount = crewCount;
    }

    @Override
    public String toString() 
    {
        return "Name: " + getName() + "\nPassenger Capacity: " + passengerCapacity + "\nCrew: " + crewCount;
    }
}
