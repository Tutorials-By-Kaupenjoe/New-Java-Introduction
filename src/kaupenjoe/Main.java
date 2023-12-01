package kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* CALCULATOR | Exercise 2
        *
        * Create a Calculator similar to the first exercise!
        * However, this time use at least two custom methods (one for evaluating the operation and one for continuing)!
        *
        * Additionally, make sure if a Dividing by 0 would happen, you catch that and just return a 0 instead!
        *
        */

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is the operation? (+, plus | -, minus | *, multiply, | /, divide)");
            String operation = scanner.next();

            System.out.println("What is the first number?");
            int firstNumber = scanner.nextInt();
            System.out.println("What is the second number?");
            int secondNumber = scanner.nextInt();

            evaluateOperation(operation, firstNumber, secondNumber);

            if (wannaStop(scanner)) break;
        }
    }

    private static boolean wannaStop(Scanner scanner) {
        System.out.println("\nDo you want to calculate something else? y/n");
        if(!scanner.next().equals("y")) {
            return true;
        }
        return false;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if(b == 0) {
            System.out.println("Dividing by 0 does not work!");
            return 0;
        }

        return a / b;
    }

    public static void evaluateOperation(String operation, int a, int b) {
        int result;
        switch (operation) {
            case "+", "plus": result = sum(a, b); break;
            case "-", "minus": result = subtract(a, b); break;
            case "*", "multiply": result = multiply(a, b); break;
            case "/", "divide": result = divide(a, b); break;
            default: System.out.println("Not a valid operation"); result = 0;
        };
        System.out.println("Result is " + a + " " + operation + " " + b + " = " + result);
    }
}