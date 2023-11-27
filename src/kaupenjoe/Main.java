package kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* CONTROL FLOW (IF & SWITCH) */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much Health do you have?");
        int health = scanner.nextInt();
        boolean isAlive = health > 0;

        if(isAlive) {
            System.out.println("You are still alive!");
        } else {
            System.out.println("You have lost the game!");
        }

        System.out.println("How many points do you have?");
        int points = scanner.nextInt();

        if(points >= 100) {
            System.out.println("You passed with HONORS!");
        } else if(points >= 50) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed!");
        }

        // SWITCH

        int level = 3;
        switch (level) {
            case 0: System.out.println("X is 0"); break;
            case 1: System.out.println("X is 1"); break;
            case 2: System.out.println("X is 2"); break;
            case 3: System.out.println("X is 3"); break;
            default: System.out.println("X is unknown!"); break;
        }
    }
}