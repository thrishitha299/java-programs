import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Calculator");
        System.out.println("Supported Operations: +, -, *, /");

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
