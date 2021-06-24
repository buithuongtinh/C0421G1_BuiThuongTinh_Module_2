package _12_Java_Collection_Framework.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        while (true){
            System.out.println("-------Chương trình quản lý sản phẩm-------");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Chỉnh sủa thông tin sản phẩm ");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần");
            System.out.println("7. Sắp xếp sản phẩm  giảm  dần");
            System.out.println("8. Kết thúc chương trình .");
            System.out.println("Chọn tính năng bạn muốn : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    productManager.addProduct(new Product());
                    break;
                case 2:
                    productManager.editProductById();
                    break;
                case 3:
                    productManager.removeProductById();
                    break;
                case 4:
                    productManager.showProduct();
                    break;
                case 5:
                    productManager.findProduct();
                    break;
                case 6:
                    productManager.ascending();
                    break;
                case 7:
                    productManager.descending();
                    break;
                case 8:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn của bạn:: ");
            }
        }
    }
}
