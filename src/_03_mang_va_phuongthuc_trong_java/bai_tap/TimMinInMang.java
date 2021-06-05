package _03_mang_va_phuongthuc_trong_java.bai_tap;
import java.util.Scanner;
public class TimMinInMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        //tìm min trong mảng , giả sử phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("phần tử có giá  trị nhỏ nhất là: "+min );

    }
}
