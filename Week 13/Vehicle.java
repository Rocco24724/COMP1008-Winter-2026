public abstract class Vehicle {
    private int numWheels;
    private String motorType;
    private double speed;
    private boolean engineRunning;

    public Vehicle(int numWheels, String motorType) {
        this.numWheels = numWheels;
        this.motorType = motorType;
        this.speed = 0.0;
        this.engineRunning = false;
    }

    public abstract void moving(String direction);

    public void turnOn() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println(getClass().getSimpleName() + " engine is now ON.");
        } else {
            System.out.println(getClass().getSimpleName() + " engine is already ON.");
        }
    }

    public void turnOff() {
        if (engineRunning) {
            engineRunning = false;
            speed = 0.0;
            System.out.println(getClass().getSimpleName() + " engine is now OFF.");
        } else {
            System.out.println(getClass().getSimpleName() + " engine is already OFF.");
        }
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }
}
