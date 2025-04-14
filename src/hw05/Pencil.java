package hw05;

public class Pencil extends Pen {

    public Pencil() {
        super(); // 呼叫父類別無參建構子
    }

    public Pencil(String brand, double price) {
        super(brand, price); // 呼叫父類別有參建構子
    }

    @Override
    public void write() {
        System.out.println("write:削鉛筆再寫");
    }

    public double getRealPrice() {
        return getPrice() * 0.8;
    }
}