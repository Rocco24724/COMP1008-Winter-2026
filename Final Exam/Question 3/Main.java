public class Main {
    public static void main(String[] args) {
        Drivable[] vehicles = { new Car(), new Bike() };

        for (Drivable vehcile : vehicles) {
            vehcile.start();
            vehcile.drive();
            vehcile.stop();
            System.out.println("");
        }
    }
}
