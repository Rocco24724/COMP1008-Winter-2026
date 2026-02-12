public class Car {
    String make, model, year;

    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String toString(){
        return "The " + make + " " + model + " was released in " + year;
    }
}
