public class Main {
    public static void main(String[] args) {
        Employee[] staff = {
            new FullTimeEmployee("Alice", 85000),
            new PartTimeEmployee("Bob", 22.5),
            new FullTimeEmployee("John", 75000),
            new PartTimeEmployee("Dave", 20.75)
        };

        for (Employee emp : staff) {
            System.out.println(emp);
        }
    }
}
