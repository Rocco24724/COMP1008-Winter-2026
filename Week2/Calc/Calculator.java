package Week2.Calc;

public class Calculator {

    //number 1
    //number 2
    //operator

    private String number1, number2;
    private char operator;
    private double num1, num2;

    public Calculator() {}

    public Calculator(String number1, String operator, String number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator.charAt(0);
    }

    private boolean isValidNumber (String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void setNumber1(String number1) {

        if(isValidNumber(number1)){
            this.num1 = Double.parseDouble(number1);
        }

    }

    public void setNumber2(String number2) {

        if(isValidNumber(number2)){
            this.num2 = Double.parseDouble(number2);
        }

    }

    public void setOperator(String operator) {
        if (operator.length() > 0) {
            this.operator = operator.charAt(0);
        }
    }

    public void inputValues() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter first number: ");
        String num1 = input.nextLine();
        setNumber1(num1);
        
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.nextLine();
        setOperator(op);
        
        System.out.print("Enter second number: ");
        String num2 = input.nextLine();
        setNumber2(num2);
    }

    public double getNumber1() {
        return num1;
    }

    public double getNumber2() {
        return num2;
    }

    public char getOperator() {
        return operator;
    }

    public double calculate() {
        double result = 0;
        
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.err.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.err.println("Invalid operator");
        }
        
        return result;
    }

}
