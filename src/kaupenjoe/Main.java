package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* TERNARY OPERATOR */

        int health = 3;
        String status = "";
        System.out.println("What is your Status? " + status);

        if(health > 0) {
            status = "Alive";
        } else {
            status = "Non-Alive";
        }
        System.out.println("What is your Status? " + status);
        status = "";

        status = health > 0 ? "Alive" : "Non-Alive";
        System.out.println("What is your Status? " + status);
    }
}