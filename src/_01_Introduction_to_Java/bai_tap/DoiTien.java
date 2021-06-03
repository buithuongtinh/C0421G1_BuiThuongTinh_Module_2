package _01_Introduction_to_Java.bai_tap;
import java.util.Scanner;
public class DoiTien {
    public static void main(String[] args) {
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn đổi bao nhiêu tiền USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Giá trị VND: "+ quydoi);

    }
}
