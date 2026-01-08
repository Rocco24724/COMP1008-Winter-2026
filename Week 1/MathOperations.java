import java.util.Scanner;

public class MathOperations 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        //ask the user for 2 numbers
        //output the sum, difference, product, quoutient
        System.out.print("Enter n1: ");
        int n1 = input.nextInt();
        System.out.print("Enter n2: ");
        int n2 = input.nextInt();
        System.out.println("Sum = " + n1 + n2);
        
        //souf -> System.out.printf()
        //%d -> whole numbers
        //%f -> deciaml numbers
        //%s -> string values
        System.out.printf("Difference of %d and %d is %d",
            n1, n2, n1 - n2
        );

    }

}
