public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Gasoline");
        Truck truck = new Truck("Diesel");
        Motorcycle motorcycle = new Motorcycle("Gasoline");

        DriverLicense carLicense = new DriverLicense("Car", false);
        DriverLicense truckLicense = new DriverLicense("Truck", false);
        DriverLicense motoLicense = new DriverLicense("Motorcycle", true);

        driveVehicle(car, carLicense, "forward");
        driveVehicle(truck, truckLicense, "left");
        driveVehicle(motorcycle, motoLicense, "right");
    }

    private static void driveVehicle(Vehicle vehicle, DriverLicense license, String direction) {
        String type = vehicle.getClass().getSimpleName();
        System.out.println("\nTrying to drive a " + type + " with license type " + license.getLicenseType() + ":");
        if (license.canDrive(type)) {
            vehicle.turnOn();
            vehicle.moving(direction);
            vehicle.turnOff();
        } else if (license.licenseIsSuspended()) {
            System.out.println("Cannot drive " + type + " because the license is suspended.");
        } else {
            System.out.println("Cannot drive " + type + " with a " + license.getLicenseType() + " license.");
        }
    }
}
