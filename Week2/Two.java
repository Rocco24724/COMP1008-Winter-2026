package Week2;
import java.util.Scanner;

public class Two {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        makingDecisions2();
    }

    static boolean validateAgeValue(String value) {
        for(int i = 0; i < value.length(); i++){
            char c = value.charAt(i);
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    static void makingDecisions() {
        //Create a program that asks for users age
        //outputs which age category they fall into
        // 5 => enfant
        // 5-12 => child
        // 13-19 => teenager
        // 20-65 => adult
        // 65+ => senior
        //using both if statements and switch statements

        (System.out).println("Please enter your age: ");
        String answer = input.nextLine(); //Gets input as a string

        if(!validateAgeValue(answer)){
            System.err.println("Invalid age value");
            return; //ends the method execution77
        }

        int age = Integer.parseInt(answer); //Converts string to integer

        if(age < 5){
            System.out.println("enfant");
        } else if (age <= 12){
            System.out.println("child");
        } else if (age <= 19){
            System.out.println("teenager");
        } else if (age <= 65){
            System.out.println("adult");
        } else {
            System.out.println("senior");
        }

        System.out.println("*".repeat(10));
    }

    static void makingDecisions2(){
        System.out.println("Enter Age category: ");
        String answer = input.nextLine();

        String result = switch (answer.toLowerCase()){

            case "enfant" -> "Age is less than 5";
            case "child" -> "Age is between 5 and 12";
            case "teenager" -> "Age is between 13 and 19";
            case "adult" -> "Age is between 20 and 65";
            case "senior" -> "Age is greater than 65";
            default -> "Unknown age category";
        };

        System.out.printf("Based on your age category of %s, your age range is %s\n", answer, result);
    }
}
