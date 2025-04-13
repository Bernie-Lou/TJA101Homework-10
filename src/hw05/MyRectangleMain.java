package hw05;

public class MyRectangleMain {
    public static void main(String[] args) {
        // (1) 使用無參數建構子建立物件，再設定 width 和 depth
        MyRectangle rect1 = new MyRectangle();
        rect1.setWidth(10);
        rect1.setDepth(20);
        System.out.println("rect1 面積為: " + rect1.getArea());

        // (2) 使用有參數建構子建立物件，直接設定 width 和 depth
        MyRectangle rect2 = new MyRectangle(10, 20);
        System.out.println("rect2 面積為: " + rect2.getArea());
    }
}
