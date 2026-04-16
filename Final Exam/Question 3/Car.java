class Car implements Drivable {
    @Override
    public void start() {
        System.out.println("Car starting");
    }

    @Override
    public void drive() {
        System.out.println("Car driving");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping");
    }
}
