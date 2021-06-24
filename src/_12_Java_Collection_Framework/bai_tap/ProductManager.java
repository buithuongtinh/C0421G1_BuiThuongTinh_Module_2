package _12_Java_Collection_Framework.bai_tap;

import java.util.*;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>(20);

    public void addProduct(Product product) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của sản phẩm:");
        product.setName(scanner.nextLine());
        System.out.println("Nhập id cửa sản phẩm: ");
        product.setId(scanner.nextInt());
        System.out.println("Nhập giá của sản phẩm: ");
        product.setPrice(scanner.nextInt());
        products.add(product);
    }
    public void removeProductById(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID của sản phẩm cần xóa: ");
        int id = scanner.nextInt();
        boolean found = false;
        Product temp = new Product();
        if (products.isEmpty()){
            System.out.println("Không có sản phẩm nào để xóa. ");
        }else {
            for(Product product : products){
                if(product.getId() == id){
                    temp = product;
                    found = true ;
                }
            }
            if(found == false){
                System.out.println("Không tìm thấy sản phẩm cần xóa.");
            }
            products.remove(temp);
        }
    }
    public void showProduct(){
        if(products.size() == 0){
            System.out.println("Không có sản phẩm nào để show.");

        }else {
            for(Product product : products){  //câu lệnh của for each để duyệt mảng
                System.out.println(product);
            }
        }
    }
    public void editProductById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập id muốn chỉnh sữa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());//Phương thức parseInt()là một phương thức
        if (products.isEmpty()) {                           // của lớp Integer để chuyển String sang Int trong Java.
            System.out.println("Không có sản phẩm để chỉnh sửa: ");
        } else {
            for (Product product : products) {
                if (product.getId() == idEdit) {
                    System.out.println("Nhập id mới: ");
                    product.setId(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập tên mới : ");
                    product.setName(scanner.nextLine());
                    System.out.println("Nhập giá mới: ");
                    product.setPrice(scanner.nextInt());
                } else {
                    System.out.println("Không tìm thấy sản phẩm cần chỉnh sửa.");
                    break;
                }
            }
        }
    }
    public void findProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sản phẩm muốn tìm:");
        String str = scanner.nextLine();
        if(products.isEmpty()){
            System.out.println("không có sản phẩm để tìm.");
        }else {
            for (Product product : products) {
                if (product.getName().equals(str)) {
                    System.out.println("Có sản phẩm " + product.getName());
                } else {
                    System.out.println("Không tìm thấy sản phẩm");
                }
            }
        }
    }
    // giá tăng dần
    public void ascending(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        showProduct();
    }
    //giá giảm dần
    public void descending() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        showProduct();
    }

}
