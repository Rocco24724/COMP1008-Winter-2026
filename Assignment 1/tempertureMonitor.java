//Rocco Minetola
//2026-01-29

//The purpose of this code is to take 7 temperture inputs (1 weeks worth) and one city input and finds the highest one and displays them all

public class tempertureMonitor {
    //Setting variables for my code
    private String city;
    private double[] temperatures;

    //Basic Contructor
    public tempertureMonitor(String city, double[] temperatures) {
        this.city = city;
        this.temperatures = temperatures;
    }

    //Function that checks what the highest tempertrue is by using a for loop to go through each temperture and if it is higher it sets it as the new highest
    public double findHighestTemperature() {
        double highest = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
        }
        return highest;
    }

    //Function that displays all of the tempertures over a 7 day peroid
    public void displayTemperatures() {
        System.out.println("City: " + city);
        System.out.println("Temperatures:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + "°C");
        }
    }

    //Getters and Setters
    public String getCity() {
        return city;
    }

    public double[] getTemperatures() {
        return temperatures;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTemperatures(double[] temperatures) {
        this.temperatures = temperatures;
    }
}