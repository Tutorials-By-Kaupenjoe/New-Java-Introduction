package kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 3 - Calculator with Classes
         *
         * Create the same Calculator application that we had before!
         *
         * This time however, make classes for each operation. Make a custom Interface that all of them implement!
         * Also make a Calculator class which deals with the calculation itself.
         *
         *
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("plus or + for Addition");
        System.out.println("minus or - for Subtraction");
        System.out.println("multiply or * for Multiplication");
        System.out.println("divide or / for Division");

        System.out.print("Enter the operation: ");
        String choice = scanner.nextLine();

        Operation selectedOperation;
        switch (choice.toLowerCase()) {
            case "plus", "+":
                selectedOperation = new Addition();
                break;
            case "minus", "-":
                selectedOperation = new Subtraction();
                break;
            case "multiply", "*":
                selectedOperation = new Multiplication();
                break;
            case "divide", "/":
                selectedOperation = new Division();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        Calculator calculator = new Calculator(selectedOperation);

        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        int result = calculator.calculate(firstNumber, secondNumber);
        System.out.println(calculator.getOperationString() + " = " + result);

    }
}