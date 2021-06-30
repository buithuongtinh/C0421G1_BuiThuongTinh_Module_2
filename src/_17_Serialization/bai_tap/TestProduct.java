package _17_Serialization.bai_tap;
import _17_Serialization.thuc_hanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TestProduct {
     Product product = new Product();
    private static List<Product> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------------Quản Lý Sản Phẩm ---------------- ");
            System.out.println("1 : hiển thị danh sách");
            System.out.println("2 : thêm sản phẩm");
            System.out.println("3 : tìm kiếm theo id sản phẩm");
            System.out.println("4 : kết thúc.");
            System.out.println("Nhập vào chức năng muốn chọn: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    readFile("product.txt");
                    for (Product products : list) {
                        System.out.println(products);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nhập vào id sản phẩm");
                    int idProduct = scanner.nextInt();
                    System.out.println("Nhập vào tên sản phẩm");
                    String nameProduct = scanner.next();
                    System.out.println("Nhập vào hãng sản xuất");
                    String Manufacturer = scanner.next();
                    System.out.println("Nhập vào số tiền");
                    double price = scanner.nextDouble();
                    System.out.println("Mô tả khác");
                    String MoTaKhac = scanner.next();
                    list.add(new Product(idProduct, nameProduct, Manufacturer, price, MoTaKhac));
                    writeFile("product.txt", list);
                    break;
                }
                case 3: {
                    System.out.println("nhập vào id sản phẩm muốn tìm kiếm");
                    int searchNumber = scanner.nextInt();
                    search(searchNumber);
                    break;
                }
                case 4:
                    System.exit(4);

                default: {
                    System.out.println("Bạn nhập cái j vậy ?");
                    break;
                }
            }
        }
    }
    public static void writeFile(String pathFile, List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(String pathFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(pathFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void search(int id) {
        boolean check = false;
        for (Product products:list){
            if (id == products.getIdProduct()){
                check = true;
                System.out.println(products);
            }
        }
        if (check == false){
            System.out.println("ko có");
        }
    }
}

