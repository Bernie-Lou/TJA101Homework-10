package hw07;

public class Dog implements Speakable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("This is Dog " + name + " speaking.");
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "'}";
    }
}