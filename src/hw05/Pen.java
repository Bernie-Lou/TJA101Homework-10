package hw05;

public abstract class Pen {
    private String brand;
    private double price;

    // 無參數建構子
    public Pen() {
    }

    // 有參數建構子
    public Pen(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void write();
}
