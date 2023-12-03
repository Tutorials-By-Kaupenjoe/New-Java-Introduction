package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* INHERITANCE & POLYMORPHISM */

        Animal bengie = new Dog("bengie.png", "Bengie", 9);
        Animal jeremy = new Dog("jeremy.png", "Jeremy", 7);

        Animal whiskers = new Cat("whiskers.jpg", "Whiskers", 5);

        System.out.println("Bengie age " + bengie.getAge());
        System.out.println("Jeremy age " + jeremy.getAge());
        System.out.println("Whiskers age " + whiskers.getAge());

        bengie.birthday();

        System.out.println("Bengie age " + bengie.getAge());
        System.out.println("Jeremy age " + jeremy.getAge());

        System.out.println("Cat Info:");
        whiskers.displayInfo();
        whiskers.makeSound();

        System.out.println("Dog Info:");
        jeremy.displayInfo();
        jeremy.makeSound();

    }
}