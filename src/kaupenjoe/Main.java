package kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* INTERFACES & ABSTRACT CLASSES */

        Animal bengie = new Dog("bengie.png", "Bengie", 9);
        Animal jeremy = new Dog("jeremy.png", "Jeremy", 7);

        Animal whiskers = new Cat("whiskers.jpg", "Whiskers", 5);

        Animal george = new Cat("george.jpg", "George", 3);

        Bird jules = new Bird("jules.png", "Jules", 1);
        jules.move();
        jules.fly();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(whiskers);
        animals.add(jules);

        List<IFlyable> flyables = new ArrayList<>();
        flyables.add(jules);
        flyables.add(new Aeroplane());

        for(Animal animal : animals) {
            animal.move();
            animal.makeSound();
        }

        for(IFlyable flyable : flyables) {
            flyable.fly();
        }
    }
}