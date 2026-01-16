import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // "System.out.println();" is used to print to the console
        System.out.println("Hello World");

        // Scanner function that asks the user for their name and then outputs "Hello, (users name)"
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name);
    }
}



























