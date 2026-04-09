public class Car extends Vehicle {
    public Car(String motorType) {
        super(4, motorType);
    }

    @Override
    public void moving(String direction) {
        if (!isEngineRunning()) {
            System.out.println("Car cannot move because the engine is off.");
            return;
        }
        setSpeed(60.0);
        System.out.println("Car is moving " + direction + " at " + getSpeed() + " km/h.");
    }
}
