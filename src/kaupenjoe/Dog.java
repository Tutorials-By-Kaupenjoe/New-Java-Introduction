package kaupenjoe;

public class Dog {
    public String picture;
    public String name;
    public int age;

    // Default Constructor
    // public Dog() {
    //
    // }

    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void birthday() {
        age++;
    }
}
