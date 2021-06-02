package _01_Introduction_to_Java.thuc_hanh;
import java.util.Scanner;
public class su_dung_toan_tu {
    public static void main(String[] args) {
        float rong;
        float dai;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều rộng: ");
        rong = scanner.nextFloat();

        System.out.println("nhập chiều dai: ");
        dai = scanner.nextFloat();
        float area = dai * rong;

        System.out.println("Diện tích là: " +area);
    }

}
