package _04_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    private double a ;
    private double b ;
    private double c ;
    private double discriminant ;

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean hasSolution(){
        if(discriminant>=0)
            return true;
        else
            return false;
    }
    public double getDiscriminant(){
        return discriminant  = b*b - 4 * a * c ;
    }
    public double  getRoot1(){
        if (hasSolution())
            return ((-b)+ Math.sqrt(b*b - 4*a*c))/(2*a) ;
        else
            return 0;
    }
    public double  getRoot2(){
        if (hasSolution())
            return ((-b)- Math.sqrt(b*b - 4*a*c))/(2*a);
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a:");
        double a = scanner.nextDouble();
        System.out.print("Nhập b:");
        double b = scanner.nextDouble();
        System.out.print("Nhập c:");
        double c = scanner.nextDouble();
        PhuongTrinhBacHai phuongTrinhBacHai = new PhuongTrinhBacHai(a, b, c);
        System.out.println("tham số a là:" + phuongTrinhBacHai.getA());
        System.out.println("tham số b là:" + phuongTrinhBacHai.getB());
        System.out.println("tham số c là:"+ phuongTrinhBacHai.getC());
        double delta = phuongTrinhBacHai.getDiscriminant();
        if (delta>0 ){
            System.out.println("Phương trình có 2 nghiệm:\n" +
                    "x1 = "+ phuongTrinhBacHai.getRoot1()+"\n" +
                    "x2 = "+ phuongTrinhBacHai.getRoot2());
        }else if (delta==0){
            System.out.println("Phương trình có 1 nghiệm x = "+ phuongTrinhBacHai.getRoot1());
        }else
            System.out.println("Phường trình vô nghiệm !");

    }
}
