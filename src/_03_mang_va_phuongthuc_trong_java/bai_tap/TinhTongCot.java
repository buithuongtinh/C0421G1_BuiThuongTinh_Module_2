package _03_mang_va_phuongthuc_trong_java.bai_tap;

import java.util.Scanner;


public class TinhTongCot {
    public static void main(String[] args) {
        // khai báo số dòng, cột
        int m , n ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        //khai báo ma trận a có m dòng n cột
        int a[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j <n;j++){
                System.out.print("a["+i+ "]["+j+"]");
                a[i][j] =scanner.nextInt();
            }
        }
        System.out.println("Ma trận a vừa nhập:");
        for(int i = 0; i <m;i++){
            for(int j = 0; j <n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        int c;
        do{
            System.out.println("Nhập c là cột muốn tính tổng: ");
             c = scanner.nextInt();
        }while(c > (n-1));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // kiểm tra nếu j == c thì mới tính tổng
                if (j== c)
                    sum += a[i][j];
            }
        }
        System.out.println("Tổng các phần tử ở cột "+c+" là: "+ sum);
    }
}
