package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* ACCESS MODIFIERS */

        Dog bengie = new Dog("bengie.png", "Bengie", 9);
        Dog jeremy = new Dog("jeremy.png", "Jeremy", 7);

        System.out.println("Bengie age " + bengie.getAge());
        System.out.println("Jeremy age " + jeremy.getAge());

        bengie.birthday();

        System.out.println("Bengie age " + bengie.getAge());
        System.out.println("Jeremy age " + jeremy.getAge());

        System.out.println("How many Dogs are there? " + Dog.numberOfDogs);

        Dog charlie = new Dog("charlie.jpg", "Charlie", 11);

        System.out.println("How many Dogs are there? " + Dog.numberOfDogs);

    }
}