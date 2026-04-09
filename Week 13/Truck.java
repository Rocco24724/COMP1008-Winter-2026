public class Truck extends Vehicle {
    public Truck(String motorType) {
        super(6, motorType);
    }

    @Override
    public void moving(String direction) {
        if (!isEngineRunning()) {
            System.out.println("Truck cannot move because the engine is off.");
            return;
        }
        setSpeed(45.0);
        System.out.println("Truck is moving " + direction + " at " + getSpeed() + " km/h.");
    }
}
