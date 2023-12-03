package kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* ANONYMOUS CLASSES */

        Animal bengie = new Dog("bengie.png", "Bengie", 9);
        Animal jeremy = new Dog("jeremy.png", "Jeremy", 7);

        Animal whiskers = new Cat("whiskers.jpg", "Whiskers", 5);

        Animal george = new Cat("george.jpg", "George", 3);

        Bird jules = new Bird("jules.png", "Jules", 1) {
            @Override
            public void move() {
                super.move();
            }
        };
        jules.move();
        jules.fly();

        Animal joel = new Animal("joel.jpg", "Joel", 2) {
            @Override
            public void move() {
                System.out.println("Hamster is running in his wheel!");
            }

            @Override
            public void makeSound() {
                System.out.println("Very tiny hamster noises");
            }
        };

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(whiskers);
        animals.add(jules);
        animals.add(joel);

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