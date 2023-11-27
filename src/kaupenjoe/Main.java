package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* INTEGERS & MATH */

        int a = 100;
        int b = 200;

        // ADDITION
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // SUBTRACTION
        int sub = a - b;
        System.out.println("Subtraction: " + sub);

        // MULTIPLICATION
        int multi = a * b;
        System.out.println("Multiplication: " + multi);

        // DIVISION
        int division = a / b;
        System.out.println("Division: " + division);

        division = b / a;
        System.out.println("Division: " + division);

        // NO DIVISION BY 0
        // division = b / 0;
        // System.out.println("Division: " + division);

        // REMAINDER (MODULO)
        int remainder = 100 % 2;
        System.out.println("Remaining from 100/2: " + remainder);

        remainder = 100 % 3;
        System.out.println("Remaining from 100/3: " + remainder);

        remainder = 100 % 4;
        System.out.println("Remaining from 100/4: " + remainder);

        // SOME MATH METHODS
        System.out.println("Absolute: " + Math.abs(-100));

        System.out.println("Ceiling: " + Math.ceil(1.23));    // Rounding Up
        System.out.println("Round: " + Math.round(1.23));     // Rounding
        System.out.println("Floor: " + Math.floor(1.23));     // Rounding Down

        System.out.println("Minimum: " + Math.min(10, 200));
        System.out.println("Maximum: " + Math.max(37, 750));
    }
}