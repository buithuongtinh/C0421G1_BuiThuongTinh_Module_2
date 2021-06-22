package _12_Java_Collection_Framework.bai_tap;

import java.util.*;

public class ProductManager {
    public static void main(String[] args) {
        Product product = new Product(1,"Táo",15);
        Product product1 = new Product(4,"Cam",22);
        Product product2 = new Product(2,"Xoài",35);
        Product product3 = new Product(3,"Ổi",13);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        System.out.println(products);

        products.remove(2);
        System.out.println("sau khi xóa sản phẩm theo id");
        System.out.println(products);
        Map<String, Product> map = new HashMap<String, Product>();

        //sắp xếp
        System.out.println("Sắp xếp theo giá tăng dần");
        Product.PriceComparator priceComparator = new Product.PriceComparator();
        products.sort(priceComparator);
        for (Product element : products) {
            System.out.println(element);
        }
        System.out.println("Tìm kiếm sản phẩm bằng tên : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(string)) {
                check = true;
                index=i;
                break;
            }else {
                check = false;
            }
        }
        if (check) {
            System.out.println(products.get(index));
        }else {
            System.out.println("Không tìm thấy sản phẩm !");
        }
    }
}
