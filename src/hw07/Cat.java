package hw07;

public class Cat implements Speakable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("This is Cat " + name + " speaking!");
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "'}";
    }
}
