package _05_accessmodifier_staticmethod_staticproperty.bai_tap;

public class Circle {
    private double radius = 1  ;
    private String color = "red";

    public Circle() {

    }

    public Circle(double r) {
        radius = r;
        color = "red" ;
    }
    // a public method trả về bán kính
    public double getRadius() {
        return radius;
    }
    // a public method để tính diện tích hình tròn
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ",Area='" + getArea() + '\'' +
                '}';
    }
}
