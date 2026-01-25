public class Company {
    private int numEmployees;
    private String[] employees;

    //Constructor for teh array of employees
    public Company() {
        numEmployees = 3;
        employees = new String[numEmployees];
        employees[0] = "John Smith";
        employees[1] = "Alice Johnson";
        employees[2] = "Mike Brown";
    }

    //Constructor using 3 arguments
    public Company(int numEmployees, String[] employees){
        this.numEmployees = numEmployees;
        this.employees = employees;
    }

    // Getter and Setter for numEmployees
    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    // Getter and Setter for employees
    public String[] getEmployees() {
        return employees;
    }

    public void setEmployees(String[] employees) {
        this.employees = employees;
    }

    public double getLowestSalary(Employee[] empArray) {
    double min = empArray[0].getSalary();
    for (int i = 1; i < empArray.length; i++) {
        if (empArray[i].getSalary() < min) {
            min = empArray[i].getSalary();
        }
    }
    return min;
    }

    public double getHighestSalary(Employee[] empArray) {
    double max = empArray[0].getSalary();
    for (int i = 1; i < empArray.length; i++) {
        if (empArray[i].getSalary() > max) {
            max = empArray[i].getSalary();
        }
    }
    return max;
    }
}


    