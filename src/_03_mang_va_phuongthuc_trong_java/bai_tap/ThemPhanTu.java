package _03_mang_va_phuongthuc_trong_java.bai_tap;
import java.util.Scanner;
public class ThemPhanTu {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        // vòng lặp này dùng để kiểm tra n nhập vào:
        // nếu n <= 0 thì cho nhập lại số phần tử cho đến khi thỏa mãn điều kiện.
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhập X là số cần chèn: ");
        int x = scanner.nextInt();

        System.out.println("Nhập vào vị trí index cần chèn X vào trong mảng: ");
        int index = scanner.nextInt();


        int[] result=new int[n+1];
        if(index<0 || index>n+1){
            System.out.println("Can't Insert");
        }
        else{
            for(int i=0;i<index;i++){
                result[i]=array[i];
            }
            result[index]=x;
            for (int i = index+1; i < n+1; i++) {
                result[i]=array[i-1];
            }
        }
        for(int end : result){
            System.out.print(end+"\t");
        }
    }

}
