public class Concert {
	// Mehul Bellukutty
    private String bandName;
    private int capacity;
    private int ticketsSoldByPhone;
    private int ticketsSoldAtVenue;
    private double priceByPhone;
    private double priceAtVenue;

    // This is the default constructor
    public Concert() 
    {
        this.bandName = "None";
        this.capacity = 0;
        this.ticketsSoldByPhone = 0;
        this.ticketsSoldAtVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    public Concert(String bandName, int capacity, double priceByPhone, double priceAtVenue) 
    {
        this.bandName = bandName;
        this.capacity = capacity;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    public Concert(String bandName, int capacity, int ticketsSoldByPhone, int ticketsSoldAtVenue, double priceByPhone, double priceAtVenue) 
    {
        this.bandName = bandName;
        this.capacity = capacity;
        this.ticketsSoldByPhone = ticketsSoldByPhone;
        this.ticketsSoldAtVenue = ticketsSoldAtVenue;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Accessors
    public String getBandName() 
    {
        return bandName;
    }

    public int getCapacity() 
    {
        return capacity;
    }
   
    public int getNumTicketsSoldByPhone() 
    {
        return ticketsSoldByPhone;
    }

    public int getNumTicketsSoldAtVenue() 
    {
        return ticketsSoldAtVenue;
    }

    public double getPriceByPhone() 
    {
        return priceByPhone;
    }

    public double getPriceAtVenue() 
    {
        return priceAtVenue;
    }

    // Mutators
    public void setBandName(String bandName) 
    {
        this.bandName = bandName;
    }
    
    public void setCapacity(int capacity) 
    {
        if (capacity >= 0) 
        {
            this.capacity = capacity;
        }
        else
        {
        	System.out.println("Invalid input entered!");
        }
    }
    
    public void setNumTicketsSoldByPhone(int ticketsSoldByPhone) 
    {
        if (ticketsSoldByPhone >= 0) 
        {
            this.ticketsSoldByPhone = ticketsSoldByPhone;
        }
        else 
        {
        	System.out.println("Invalid input entered!");
        }
    }
    
    public void setNumTicketsSoldAtVenue(int ticketsSoldAtVenue) 
    {
        if (ticketsSoldAtVenue >= 0) 
        {
            this.ticketsSoldAtVenue = ticketsSoldAtVenue;
        }
        else 
        {
        	System.out.println("Invalid input entered!");
        }
    }
    
    public void setPriceByPhone(double priceByPhone) 
    {
        if (priceByPhone >= 0) 
        {
            this.priceByPhone = priceByPhone;
        }
        else 
        {
        	System.out.println("Invalid input entered!");
        }
    }
    
    public void setPriceAtVenue(double priceAtVenue) 
    {
        if (priceAtVenue >= 0) 
        {
            this.priceAtVenue = priceAtVenue;
        }
        else
        {
        	System.out.println("Invalid input entered!");
        }
    }
    
    // Methods
    public int totalNumberOfTicketsSold() 
    {
        return ticketsSoldByPhone + ticketsSoldAtVenue;
    }

    public int ticketsRemaining() 
    {
        return capacity - totalNumberOfTicketsSold();
    }

    public void buyTicketsAtVenue(int numberOfTickets)
    {
        if (totalNumberOfTicketsSold() + numberOfTickets <= capacity) 
        {
            ticketsSoldAtVenue += numberOfTickets;
        } 
        else 
        {
            System.out.println("The concert is sold out!");
        }
    }

    public void buyTicketsByPhone(int numberOfTickets) 
    {
        if (totalNumberOfTicketsSold() + numberOfTickets <= capacity) 
        {
            ticketsSoldByPhone += numberOfTickets;
        } 
        else 
        {
            System.out.println("The concert is sold out!");
        }
    }

    public double totalSales() {
        return (ticketsSoldAtVenue * priceAtVenue) + (ticketsSoldByPhone * priceByPhone);
    }
}
