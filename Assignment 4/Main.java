// Main.java
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Rocco Minetola", 55000);
        Manager mgr = new Manager("John Smith", 85000, "Engineering");

        System.out.println(emp);
        System.out.println(mgr);
    }
}