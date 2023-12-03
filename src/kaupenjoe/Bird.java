package kaupenjoe;

public class Bird extends Animal implements IFlyable {
    public Bird(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void makeSound() {
        System.out.println("Singing");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
