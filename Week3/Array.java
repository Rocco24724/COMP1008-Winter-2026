public class Array {

    public static void main(String[] args) {
        
    }

    static void example1() {
        String[] names = new String[10];
        names[0] = "John";
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("*".repeat(10));

        for(int num : numbers) {
            System.out.println(num);
        }
    }
}
