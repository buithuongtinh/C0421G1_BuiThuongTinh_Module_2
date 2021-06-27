package _15_xu_li_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
       public Triangle(double a, double b, double c) throws IllegalTriangleException {
           if (a < 0 || b < 0 || c < 0){
               throw new IllegalArgumentException("Không đc nhập số âm ");
           }else if (a + b < c || a +c <b || b +c <a ){
               throw new IllegalArgumentException("Tổng hai cạnh phải lớn hơn cạnh còn lại ");
           }else { System.out.println("Đây là 3 cạnh của một tam giác");}
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print("Nhập độ dài 3 cạnh: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();
            try {
                Triangle triangle = new Triangle(side1, side2, side3);
                check = false ;

            } catch (IllegalTriangleException ex ){
                System.out.println(ex.getMessage());
            }

        }while(check);
    }


}
