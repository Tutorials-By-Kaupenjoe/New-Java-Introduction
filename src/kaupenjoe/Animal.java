package kaupenjoe;

public class Animal {
    public String picture;  // accessible from anywhere and changeable
    protected String name;  // accessible in sub-classes and same package!
    private int age;        // accessible ONLY within the class itself

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Whatever Animal Sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Image: " + picture);
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
        System.out.println(name + " is celebrating their Birthday! They turned " + age);
    }
}
