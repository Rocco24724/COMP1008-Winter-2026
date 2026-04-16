public class Main {
    public static void main(String[] args) {
        Task task = new Task() {
            @Override
            public void execute() {
                System.out.println("Step 1");
                System.out.println("Step 2");
                System.out.println("Step 3");
            }
        }
    }
}
