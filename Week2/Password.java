package Week2;
import java.util.Scanner;

public class Password {

    static Scanner input = new Scanner(System.in);

    static void main(String[] args) {
        checkPasswordStrength();
    }

    static void checkPasswordStrength() {

        System.out.println("Please enter your password: ");
        String password = input.nextLine();

        int length = password.length();

        if (length < 6) {
            System.out.println("Weak Password");
        } else if (length <= 10) {
            System.out.println("Moderate Password");
        } else {
            System.out.println("Strong Password");
        }
    }

}
