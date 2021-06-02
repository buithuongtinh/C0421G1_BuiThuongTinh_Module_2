package _01_Introduction_to_Java.thuc_hanh;
import java.util.Scanner;
public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam;
        System.out.println("Nhập năm:");
        nam = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = nam % 4 == 0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 = nam % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = nam % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.print(nam +" là năm nhuận " );
        } else {
            System.out.print(nam +" không phải năm nhuận" );
        }
    }
}

