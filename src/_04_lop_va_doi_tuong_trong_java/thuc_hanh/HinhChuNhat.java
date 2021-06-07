package _04_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class HinhChuNhat {
   double chieuRong, chieuDai;

   public HinhChuNhat(double chieuRong , double chieuDai){
       this.chieuRong = chieuRong;
       this.chieuDai = chieuDai;
   }

    public double getArea(){
        return this.chieuRong * this.chieuDai;
    }
    public double getPerimeter(){
       return (this.chieuRong + this.chieuDai)*2 ;
    }

    public String display(){
       return "Hình chữ nhật {" + "Chiều rộng=" + this.chieuRong + ", Chiều dài=" + this.chieuDai + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng:");
        double chieuRong = scanner.nextDouble();
        System.out.print("Nhập chiều dài:");
        double chieuDai = scanner.nextDouble();
        HinhChuNhat HinhChuNhat = new HinhChuNhat(chieuRong, chieuDai);
        System.out.println("Hình chử nhật của bạn  \n"+ HinhChuNhat.display());
        System.out.println("Chu vi của hình chử nhật: "+ HinhChuNhat.getPerimeter());
        System.out.println("Diện tích của hình chử nhật: "+ HinhChuNhat.getArea());
    }
}
