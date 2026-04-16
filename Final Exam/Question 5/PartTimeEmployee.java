class PartTimeEmployee extends Employee {
    double hourlyRate;

    PartTimeEmployee(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee: " + name + ", hourlyRate = " + hourlyRate;
    }
}