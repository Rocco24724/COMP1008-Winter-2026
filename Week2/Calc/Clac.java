package Week2.Calc;
import java.util.Scanner;

public class Clac {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        System.out.println("Enter first number: ");
        String firstInput = input.nextLine();
        System.out.println("Enter a operator: ");
        String operator = input.nextLine();
        System.out.println("Enter second number: ");
        String secondInput = input.nextLine();

        Calculator c1 = new Calculator();
        c1.setNumber1(firstInput);
        c1.setOperator(operator);
        c1.setNumber2(secondInput);
        
        double result = c1.calculate();
        System.out.println(c1.getNumber1() + " " + c1.getOperator() + " " + c1.getNumber2() + " = " + result);
    }

}
