package kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 1: Easy Calculator
         *
         * Create a Calculator that runs multiple times until you manually break out of it.
         * You should read the operation first, then read the first and second number.
         *
         * Depending on the operation chosen, you then have to return a different result.
         * You can do this with if statements or a switch statement.
         *
         * Please note that when reading in a String, you want to use scanner.next()
         * And when comparing strings you wanna use:
         * String s = "something";
         * s.equals("something");
         * and not ==
         *
         * After the result has been output, ask the user if they want to continue, if not end the program!
         * Estimated Time: 30-45 minutes
         *
         */

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Type in the operation (plus or +, minus or -, multiply or *, divide or /)");
            String operation = scanner.next();

            System.out.println("Type in your first number!");
            int number1 = scanner.nextInt();

            System.out.println("Type in your second number!");
            int number2 = scanner.nextInt();

            int result = 0;

            switch (operation) {
                case "plus", "+": result = number1 + number2; break;
                case "minus", "-": result = number1 - number2; break;
                case "multiply", "*": result = number1 * number2; break;
                case "divide", "/": result = number1 / number2; break;
                default: result = 0; break;
            }

            System.out.println("Your result it " + number1 + " " + operation + " " + number2 + " = " + result);

            System.out.println("\nDo you wish to calculate something else? y/n");
            if(!scanner.next().equals("y")) {
                break;
            }
        }
    }
}