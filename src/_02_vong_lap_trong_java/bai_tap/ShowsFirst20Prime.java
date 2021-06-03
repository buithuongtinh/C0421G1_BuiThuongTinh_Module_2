package _02_vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class ShowsFirst20Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số lượng số nguyên tố cần in ra: ");
        int numbers = input.nextInt();
        System.out.println(numbers+ " số nguyên tố đầu tiên là: ");
        int count = 0; // đếm số nguyên tố
        int i = 2 ;     //tìm số nguyên tố bắt đầu từ số

        while (count < numbers) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if(n < 2){
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
