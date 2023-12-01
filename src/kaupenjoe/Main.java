package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* CLASSES & OBJECTS */

        Dog bengie = new Dog("bengie.png", "Bengie", 9);
        Dog jeremy = new Dog("jeremy.png", "Jeremy", 7);

        System.out.println("Bengie age " + bengie.age);
        System.out.println("Jeremy age " + jeremy.age);

        bengie.birthday();

        System.out.println("Bengie age " + bengie.age);
        System.out.println("Jeremy age " + jeremy.age);

        bengie.age = 100;

        System.out.println("Bengie age " + bengie.age);
    }
}