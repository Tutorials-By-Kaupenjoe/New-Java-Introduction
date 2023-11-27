package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* LOOPS (FOR & WHILE) */

        // Outputting all numbers from 0 to 99...
        System.out.println(0);
        System.out.println(2);
        System.out.println(4);
        System.out.println(6);
        System.out.println(8);
        System.out.println(10);

        // Now output years between 1000 and 2000, but only leap years!
        System.out.println(1000);
        System.out.println(1004);
        System.out.println(1008);
        //... this is gonna take forever!

        System.out.println("-------");

        // FOR

        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        System.out.println("-------");

        for(int i = 0; i < 100; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        for(int i = 1000; i <= 2000; i++) {
            if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                // System.out.println(i);
            }
        }

        int health = 10;
        while (health > 0) {
            System.out.println("Player still alive with " + health + " HP");
            health--;
        }

        health = 10;
        while (health > 0) {
            health--;
            if(health == 6) {
                continue;
            }

            if(health == 2) {
                break;
            }
            System.out.println("Player still alive with " + health + " HP");
        }


    }
}