
public class TimeConverter {
	// Mehul Bellukutty
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM; // This means it is true for AM, false for PM

    // Default constructor
    public TimeConverter() 
    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true;
    }

    // Parameterized constructor
    public TimeConverter(int hours, int minutes, int seconds) 
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.notPM = true; // The Default is AM
    }

    // Accessor methods
    public int getHours() 
    {
        return hours;
    }

    public int getMinutes() 
    {
        return minutes;
    }

    public int getSeconds() 
    {
        return seconds;
    }

    public boolean isNotPM() 
    {
        return notPM;
    }

    // Mutator methods
    public void setHours(int hours) throws TimeException 
    {
        if (hours < 0 || hours > 23) 
        {
            throw new TimeException();
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) throws TimeException 
    {
        if (minutes < 0 || minutes > 59) 
        {
            throw new TimeException();
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws TimeException 
    {
        if (seconds < 0 || seconds > 59) 
        {
            throw new TimeException();
        }
        this.seconds = seconds;
    }

    public void setNotPM(boolean notPM) 
    {
        this.notPM = notPM;
    }

    // Method to update time
    public void updateTime(int hours, int minutes, int seconds) throws TimeException 
    {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);

        if (this.hours >= 12) 
        {
            this.notPM = false; // It is PM
            if (this.hours > 12) 
            {
                this.hours -= 12; // Convert hours greater than 12 into the 12-hour format
            }
        } 
        else 
        {
            this.notPM = true; // It is AM
            if (this.hours == 0) 
            {
                this.hours = 12; // Midnight is 12 AM
            }
        }
    }

    // Method to update time from a string
    public void updateTime(String time) throws TimeException 
    {
        try {
            String[] parts = time.split(":");
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int s = Integer.parseInt(parts[2]);

            updateTime(h, m, s);
        } catch (Exception e) 
        {
            throw new TimeException();
        }
    }

    // Method to display time in 12-hour format
    public void displayTime() 
    {
        String period = notPM ? "AM" : "PM";
        System.out.println(String.format("%d:%02d:%02d %s", hours, minutes, seconds, period));
    }
}
