package kaupenjoe;

public class Dog {
    public String picture;  // accessible from anywhere and changeable
    protected String name;  // accessible in sub-classes and same package!
    private int age;        // accessible ONLY within the class itself

    public static int numberOfDogs = 0;

    // Default Constructor
    // public Dog() {
    //
    // }

    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;

        numberOfDogs++;
    }

    public void birthday() {
        age++;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }
}
