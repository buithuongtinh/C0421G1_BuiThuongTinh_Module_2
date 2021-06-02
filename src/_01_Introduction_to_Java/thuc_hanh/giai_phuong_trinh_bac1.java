package _01_Introduction_to_Java.thuc_hanh;
import java.util.Scanner;
public class giai_phuong_trinh_bac1 {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc nhất ax + b= c");
        Scanner sc =new Scanner(System.in);
        double a, b,c ;
        System.out.print("a: ");
        a = sc.nextDouble();

        System.out.print("b: ");
        b = sc.nextDouble();

        System.out.print("c: ");
        c = sc.nextDouble();
        if (a != 0){
            double nghiem = (c - b)/ a;
            System.out.printf("Equation pass with x = %f! \n ", nghiem);
        }else {
            if (b==c){
                System.out.print("The solution is all x!");
            }else {
                System.out.print("No solution!");
            }

        }
    }
}
