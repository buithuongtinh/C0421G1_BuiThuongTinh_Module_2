package _02_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang =1;
        double laiSuat = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số tiền gửi: ");
        tien = input.nextDouble();
        System.out.println("Số tháng gửi: ");
        thang = input.nextInt();
        System.out.println("Lãi suất hàng tháng: ");
        laiSuat = input.nextDouble();

        double tongLai = 0;
        for (int i = 0;i < thang;i++){
            tongLai += tien * (tongLai/100) / 12 * thang;
        }
        System.out.println("Tổng số tiền lãi: "+ tongLai);


    }
}
