public class Motorcycle extends Vehicle {
    public Motorcycle(String motorType) {
        super(2, motorType);
    }

    @Override
    public void moving(String direction) {
        if (!isEngineRunning()) {
            System.out.println("Motorcycle cannot move because the engine is off.");
            return;
        }
        setSpeed(80.0);
        System.out.println("Motorcycle is moving " + direction + " at " + getSpeed() + " km/h.");
    }
}
