package hw08;

import java.util.Objects;
public class Train {
    // 屬性宣告
    private int number;     // 班次
    private String type;    // 車種
    private String start;   // 出發地
    private String dest;    // 目的地
    private double price;   // 票價
    
    //預設建構子   
    public Train() {
    }

    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Train train = (Train) obj;
        return number == train.number &&
               type.equals(train.type) &&
               start.equals(train.start) &&
               dest.equals(train.dest) &&
               Double.compare(train.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }
}
