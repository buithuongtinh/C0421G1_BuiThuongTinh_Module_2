package _18_String_Regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NameClass {
    //Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P    ^[CAP]
    //Không chứa các ký tự đặc biệt
    //Theo sau ký tự bắt đầu là 4 ký tự số \d{4}C
    //Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

    private static final String NAMECLASS_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên class: ");
        String input = scanner.next();

        boolean pattern = Pattern.matches(NAMECLASS_REGEX,input);

        while(!pattern){
            System.out.println("Bạn đã nhập sai! Hãy nhập lại tên lớp: ");
            input = scanner.next();
            pattern = Pattern.matches(NAMECLASS_REGEX,input);

        }
        System.out.println("BẠn nhập đúng rồi đó.");

    }
}
