package _03_mang_va_phuongthuc_trong_java.bai_tap;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        String a[] = new String[4];
        String b[] = new String[2];
        String[] ab = new String[a.length + b.length];
        int i, j, d, s = 0;
        Scanner x = new Scanner(System.in);
        System.out.println("nhập mảng 1");

        for (i = 0; i < a.length; i++) {
            a[i] = x.next();
            for (d = i; d < a.length; d++) {
                ab[d] = a[i];
            }
        }
        System.out.println("nhập mảng 2");

        for (j = 0; j < b.length; j++) {
            b[j] = x.next();
            for (d = a.length + j; d < ab.length; d++)
                ab[d] = b[j];
        }
        System.out.println();
        System.out.println("Mảng mới là: ");
        System.out.println("--------------------");
        for (s = 0; s < ab.length; s++) {
            System.out.print(ab[s] + " ");
        }
    }
}
