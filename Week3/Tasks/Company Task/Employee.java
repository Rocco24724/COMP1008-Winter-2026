public class Employee {
    private String employeeName;
    private double salary;
    private int employeeId;

    //Default Constructor
    public Employee(){
        this.employeeName = "Default Name";
        this.salary = 0.0;
        this.employeeId = 123456789;
    }

    //Constructor using 3 arguments
    public Employee(String employeeName, double salary, int employeeID){
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeId = employeeID;
    }
    
    // Getter and Setter for employeeName
        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        // Getter and Setter for salary
        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        // Getter and Setter for employeeId
        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }
    
}

