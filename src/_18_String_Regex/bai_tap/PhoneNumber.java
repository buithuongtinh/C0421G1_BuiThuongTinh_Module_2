package _18_String_Regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    //Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
    //x là ký tự số
    //Không chứa các ký tự đặc biệt

    private static final String PHONENUMBER_REGEX = "^\\d{2}-[0]\\d{9}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập SĐT: ");
        String input = scanner.next();

        boolean pattern = Pattern.matches(PHONENUMBER_REGEX,input);

        while(!pattern){
            System.out.println("Bạn đã nhập sai! Hãy nhập lại SĐT: ");
            input = scanner.next();
            pattern = Pattern.matches(PHONENUMBER_REGEX,input);

        }
        System.out.println("BẠn nhập đúng rồi đó.");

    }

}
