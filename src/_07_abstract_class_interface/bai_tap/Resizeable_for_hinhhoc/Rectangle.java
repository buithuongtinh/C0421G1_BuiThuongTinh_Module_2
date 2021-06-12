package _07_abstract_class_interface.bai_tap.Resizeable_for_hinhhoc;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 2.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều rộng="
                + getWidth()
                + " và chiều dài="
                + getLength()
                + ", Diện tích=" +
                + getArea();
    }

    @Override
    public void resize(double percent) {
        this.length *= (percent/200);
        this.width += (percent/200) ;
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
    }
}
