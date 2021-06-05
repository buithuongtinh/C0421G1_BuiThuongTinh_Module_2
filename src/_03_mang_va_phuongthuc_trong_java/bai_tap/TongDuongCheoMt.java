package _03_mang_va_phuongthuc_trong_java.bai_tap;
import java.util.Scanner;
public class TongDuongCheoMt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // khai báo số dòng, cột
        //ma trận vuông là dòng = cột
        int m;
        System.out.println("Nhập vào bậc của ma trận: ");
        m = scanner.nextInt();
        int a[][] = new int[m][m];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j <m;j++){
                System.out.print("a["+i+ "]["+j+"]");
                a[i][j] =scanner.nextInt();
            }
        }
        System.out.println("Ma trận a vừa nhập:");
        for(int i = 0; i <m;i++){
            for(int j = 0; j <m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
        // các phần tử nằm trên đường chéo chính
        // là các phần tử có chỉ số dòng = chỉ số cột
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j)
                    sum += a[i][j];
            }
        }
        System.out.println("Tổng các phần tử nằm đường chéo chính của ma trận vuông là: "+ sum);
    }
}
