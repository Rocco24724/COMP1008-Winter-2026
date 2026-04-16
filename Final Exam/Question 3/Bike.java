class Bike implements Drivable {
    @Override
    public void start() {
        System.out.println("Bike starting");
    }

    @Override
    public void drive() {
        System.out.println("Bike driving");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopping");
    }
}