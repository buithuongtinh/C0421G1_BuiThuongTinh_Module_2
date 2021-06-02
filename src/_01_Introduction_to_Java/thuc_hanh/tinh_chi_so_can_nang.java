package _01_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class tinh_chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Nhập cân nặng của bạn (kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Nhập chiều cao của bạn ( met):");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.print("Chỉ số khối cớ thể là: "+bmi);
        if (bmi <18)
            System.out.print(bmi+": Thiếu cân ");
        else if (bmi<25.0)
            System.out.print(bmi +": Bình thường");
        else if (bmi<30.0)
            System.out.print(bmi +": thừa cân ");
        else
            System.out.print(bmi+ ": béo phì");
    }
}
