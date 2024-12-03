import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

class Weather {
    // Instance variables
    String location;
    Date day;
    double temperature;
    boolean isRaining;
    int wind;

    public Weather(String loc) {
        // Initialize the location
        location = loc;

        // Get the current date
        Calendar cal = Calendar.getInstance();
        day = cal.getTime();

        // Create a Random object
        Random randGen = new Random();

        // random values for temperature and wind
        temperature = (randGen.nextDouble() * (100 - 30)) + 30; // Random temperature between 30 and 100 degrees
        wind = randGen.nextInt(30 - 5 + 1) + 5; // Random wind speed between 5 and 30 mph

        // random boolean value for rain
        isRaining = randGen.nextBoolean();
    }

    // display the weather report
    public void displayWeatherReport() {
        // Format the date
        DateFormat DFormat = DateFormat.getDateInstance();
        String curr_date = DFormat.format(day);
        
        // chance of rain
        String rainChance = isRaining ? "Higher" : "Lower";

        // the weather report
        System.out.println(curr_date + " " + location + " weather report");
        System.out.println("Temperature: " + String.format("%.2f", temperature) + " degrees");
        System.out.println("Wind: " + wind + " mph");
        System.out.println("Chance of rain: " + rainChance);
    }
}
