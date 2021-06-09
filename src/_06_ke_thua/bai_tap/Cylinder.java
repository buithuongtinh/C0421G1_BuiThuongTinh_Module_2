package _06_ke_thua.bai_tap;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Bán kính =" + getRadius() +
                ", màu ='" + getColor() + '\'' +
                ", Diện tích ='" + getArea() + '\'' +
                ", Thể tích  ='" + getVolume() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);

        c1 = new Cylinder(3,"vàng",2);
        System.out.println(c1);
    }


}
