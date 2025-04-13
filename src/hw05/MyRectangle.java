package hw05;

public class MyRectangle {
    // 屬性
    private double width;
    private double depth;

    // 無參建構子
    public MyRectangle() {
        // 不做任何事，保留預設值 0.0
    }

    // 有參建構子
    public MyRectangle(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }

    // setter 方法
    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    // ✅ 新增的 getter 方法
    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    // 面積方法
    public double getArea() {
        return width * depth;
    }
}


