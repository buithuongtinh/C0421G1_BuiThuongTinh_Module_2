package _17_Serialization.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String Manufacturer;
    private double price;
    private String MoTaKhac;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String manufacturer, double price, String moTaKhac) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        Manufacturer = manufacturer;
        this.price = price;
        MoTaKhac = moTaKhac;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMoTaKhac() {
        return MoTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        MoTaKhac = moTaKhac;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", price=" + price +
                ", MoTaKhac='" + MoTaKhac + '\'' +
                '}';
    }
}
