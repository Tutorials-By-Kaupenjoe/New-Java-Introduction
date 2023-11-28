package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* CASTING */

        // Turning one Data Type into another
        int health = 10;
        float damage = 1.5f;

        // int result = health - damage;
        float resultFloat = health - damage; // Implicit!
        System.out.println("Result: " + resultFloat); // 8.5

        int resultInteger = health - (int)damage; // explicitly casting damage from float to int
        System.out.println("Result: " + resultInteger); // 9

        resultInteger = (int)((float)health - damage); // 8.5 to int --> 8
        System.out.println("Result: " + resultInteger); // 8

        String point = "100";
        System.out.println("Result: " + point + 5);

        int result = Integer.parseInt(point) + 5;
        System.out.println("Result: " + result);
    }
}