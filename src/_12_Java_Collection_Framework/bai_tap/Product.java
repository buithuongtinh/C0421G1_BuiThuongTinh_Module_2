package _12_Java_Collection_Framework.bai_tap;

import java.util.Comparator;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public static class PriceComparator implements Comparator <Product>{
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice()>o2.getPrice()) {
                return 1;
            }else if (o1.getPrice()==o2.getPrice()) {
                return 0;
            }else {
                return -1;
            }
        }
    }

}