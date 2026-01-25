public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company();
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John Smith", 50000, 1);
        employees[1] = new Employee("Alice Johnson", 60000, 2);
        employees[2] = new Employee("Mike Brown", 45000, 3);

        double lowestSalary = myCompany.getLowestSalary(employees);
        double highestSalary = myCompany.getHighestSalary(employees);

        System.out.println("Lowest Salary: " + lowestSalary);
        System.out.println("Highest Salary: " + highestSalary);
    }
}
