package _02_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class CheckSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhập số: ");
        int so = scanner.nextInt();
        if (so<2){
            System.out.println(so + ": ko phải là số nguyên tố ");
        }else {
            int i =2;
            boolean check =true ;
            while (i<=Math.sqrt(so)) {
                if (so % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(so + ": là số nguyên tố");
            else
                System.out.println(so + ": ko phải là số nguyên tố ");

        }


    }
}
