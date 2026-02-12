import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Week6 {

    public static void main(String[] args) {
        //example1();
        //example2();
        //example3();
        //example4();
        //example5();
        //example6();
        //example7
    }

    static void example1(){
        //Method is a action. example --> sleeping(where, duration)

        //Method overload 
            //allowing the user to use method in many ways

        Calculator c1 = new Calculator();
        int r1 = c1.add();
        int r2 = c1.add(1, 2);
        double r3 = c1.add(3.3, 4.4);

        System.out.println(c1.getClass().getName());

        System.out.println(c1);

        //Override
            //Throw out the defualt method behavior and implement a new method behaviour

        Car car1 = new Car("Honda", "Accord", "2026");
        Car car2 = new Car("Toyota", "Prius", "2026");

        System.out.println(car1);
        System.out.println(car2);
    }

    static void example2(){
        //Exception
        

        //Error trying to make a string into a int
        //int num = Integer.parseInt("abc");

        int num = Integer.parseInt("1");
    }

    static void example3(){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another integer: ");
        int num2 = sc.nextInt();

        System.out.println(num1 / num2);
    }

    static void example4(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        try{
            int num1 = sc.nextInt();
            System.out.println("Enter another integer: ");
            int num2 = sc.nextInt();

            System.out.println(num1 / num2);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid int number inputted");
        }
        catch (ArithmeticException e) {
            System.out.println("Could not Divide by 0");
        }
        catch (Exception e) {
            System.err.println("Error!");
        }
    }

    static void example5(){

        int num = 0;
        while (num == 0){
            try{
                //Ask user for even number
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter an even number");
                num = sc.nextInt();
                if(num % 2 == 1){
                    throw new IllegalArgumentException("odd number inputed!");
                } else if (num == 0) {
                    throw new ArithmeticException("Can not get remiander if value of number is 0");
                } else if (num < 0) {
                    throw new IllegalArgumentException("Negative number inputed");
                }

                System.out.println("You have inputed a even number!");
            }
            catch (Exception e){
                num = 0;
                System.err.println(e.getClass().getName());
                System.err.println(e.getMessage());
            }
            finally{
                System.out.println("Thank you for using our program");        
            }
        }
    }

    static void example6(){
        String text = "My number is 416-123-4567";
        text = "555";

        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher();

        System.out.println(matcher.matches());

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        /*
            {N} Exact N times
            {N, } 
        
        */
    }

    static void example7(){
        //Write a regex that will validate a name in format "Firstname Lastname"
        //No middle names
        String regex = "[A-Za-z]{2,}\s[a-zA-Z]{3,}";
        String text = "Rocco Minetola";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());

        //"/d{1,}\.[0-9]{2}"
    }
}


