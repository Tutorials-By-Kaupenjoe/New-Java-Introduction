package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* ASSIGNMENT OPERATORS */

        // Assignment =
        int mana = 100;
        System.out.println("Mana: " + mana);

        // ADDITION +=
        mana += 20; // mana = mana + 20;
        System.out.println("Mana: " + mana);

        mana++; // mana += 1; or mana = mana + 1;
        System.out.println("Mana: " + mana);

        // SUBTRACTION -=
        mana -= 60;
        System.out.println("Mana: " + mana);

        mana--;
        System.out.println("Mana: " + mana);

        // MULTIPLY *=
        mana *= 2;
        System.out.println("Mana: " + mana);

        // DIVIDE /=
        mana /= 4;
        System.out.println("Mana: " + mana);

        // MODULO (REMAINDER) %=
        mana %= 2;
        System.out.println("Mana: " + mana);

    }
}