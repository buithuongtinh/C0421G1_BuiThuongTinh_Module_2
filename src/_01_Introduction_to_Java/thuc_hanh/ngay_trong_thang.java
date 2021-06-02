package _01_Introduction_to_Java.thuc_hanh;
import java.util.Scanner;
public class ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng bạn muốn biết số ngày: ");
        int thang = scanner.nextInt();
        String ngay;
        switch (thang){
            case 2:
//                System.out.print("tháng 2 có 28 hoặc 29 ngày ");lặp mã
                ngay = "28 hoặc 29 ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.print("tháng "+thang + "có 31 ngày ");
                ngay = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.print("tháng "+thang + "có 30 ngày ");
                ngay = "30";
                break;
            default:
//                System.out.print("Không hợp lệ!");
                ngay = "";
                break;
        }
        if (!ngay.equals("")) System.out.print("Tháng " +thang+ " có " +ngay+ " ngày.");
        else System.out.print("Không hợp lệ!");
    }
}
