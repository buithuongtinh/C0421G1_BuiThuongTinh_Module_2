package _07_abstract_class_interface.bai_tap.Resizeable_for_hinhhoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Một hình tròn có bán kính="
                + getRadius()
                + ", Diện tích=" +
                + getArea();
    }


    @Override
    public void resize(double percent) {
        this.radius *= (percent / 200);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
    }
}