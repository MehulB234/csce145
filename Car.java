public class Car extends Vehicle {
    private double gasMileage;
    private int numberOfPassengers;

    // Default constructor
    public Car() 
    {
        super();
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    // Parameterized constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, 
               double gasMileage, int numberOfPassengers) 
    {
        super(manufacturerName, numberOfCylinders, ownerName);
        if (gasMileage < 0 || numberOfPassengers < 0) 
        {
            throw new IllegalArgumentException("Gas mileage and number of passengers must be nonnegative.");
        }
        this.gasMileage = gasMileage;
        this.numberOfPassengers = numberOfPassengers;
    }

    // Accessors and Mutators
    public double getGasMileage() 
    {
        return gasMileage;
    }

    public void setGasMileage(double gasMileage) 
    {
        if (gasMileage < 0) 
        {
            throw new IllegalArgumentException("Gas mileage must be nonnegative.");
        }
        this.gasMileage = gasMileage;
    }

    public int getNumberOfPassengers() 
    {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) 
    {
        if (numberOfPassengers < 0) 
        {
            throw new IllegalArgumentException("Number of passengers must be nonnegative.");
        }
        this.numberOfPassengers = numberOfPassengers;
    }

    // equals method
    @Override
    public boolean equals(Object obj) 
    {
        if (!super.equals(obj)) return false;
        Car car = (Car) obj;
        return Double.compare(car.gasMileage, gasMileage) == 0 &&
               numberOfPassengers == car.numberOfPassengers;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Gas Mileage: " + gasMileage + " gallons\n" +
               "Number of Passengers: " + numberOfPassengers;
    }
}
