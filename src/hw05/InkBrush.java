package hw05;

public class InkBrush extends Pen {

    public InkBrush() {
        super();
    }

    public InkBrush(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void write() {
        System.out.println("write:沾墨汁再寫");
    }

    public double getRealPrice() {
        return getPrice() * 0.9;
    }
}
