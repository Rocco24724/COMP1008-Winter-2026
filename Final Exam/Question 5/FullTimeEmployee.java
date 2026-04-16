class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee: " + name + ", salary = " + salary;
    }
    
}