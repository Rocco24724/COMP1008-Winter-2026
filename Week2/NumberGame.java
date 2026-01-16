package Week2;
import java.util.Scanner;

public class NumberGame {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        guessGame();
    }

    static boolean isValidNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static void guessGame() {
        //Create a program that asks the user to guess a number between 1 and 10
        //If they guess correctly, output "Correct!"
        //If they guess incorrectly, output "Wrong, try again!"

        int numberToGuess = 7; // The number to be guessed
        int guessedNumber = -1; // Initialize with a value that cannot be guessed

        while (guessedNumber != numberToGuess) {
            System.out.println("Guess a number between 1 and 10: ");
            String userInput = input.nextLine();

            if (!isValidNumber(userInput)) {
                System.err.println("Invalid input. Please enter a number between 1 and 10.");
                continue;
            }

            guessedNumber = Integer.parseInt(userInput);
            
            if (guessedNumber < 1 || guessedNumber > 10) {
                System.err.println("Number out of range. Please enter a number between 1 and 10.");
                continue; // Prompt the user again
            }

            if (guessedNumber == numberToGuess) {
                System.out.println("Correct!");
                break; // Exit the loop
            } else {
                System.out.println("Wrong, try again!");
            }
        }
        
    }
}