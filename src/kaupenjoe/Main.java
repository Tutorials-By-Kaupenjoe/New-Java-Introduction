package kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* INPUT & OUTPUT */

        /* OUTPUT */
        // Outputting a String
        System.out.println("Hello, I am Kaupenjoe! And this is a Java Introduction for Minecraft Modding!");

        // You can also output variables (which will output their VALUE)
        int life = 42;
        System.out.println(life);

        // You can also output Strings and variables like this
        int grade = 80;
        System.out.println("Your grade is " + grade);


        /* INPUT */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // HAS TO BE A NUMBER!
        System.out.println("You just typed " + number);

        scanner.nextLine();
        String input = scanner.nextLine();
        System.out.println("You now just typed (String): " + input);

    }
}