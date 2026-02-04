//Rocco Minetola
//2026-01-29

public class Main {
    public static void main(String[] args) {
        //This is making a object by providing it with 7 tempertures and the city (in my example I used Toronto)
        double[] temperatures = {22.5, 23.0, 21.5, 24.0, 25.5, 22.0, 23.5};
        tempertureMonitor monitor = new tempertureMonitor("Toronto", temperatures);

        //This Sets the value of the highest temperature by calling the function I made to display the highest temperture
        double highest = monitor.findHighestTemperature();
        System.out.println("Highest Temperature: " + highest + "°C");
        //This is used to make a blank space so it looks better on the console
        System.out.println();

        //This calls the function I made to display all the temperture
        monitor.displayTemperatures();
    }
}
