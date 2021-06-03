package _02_vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class PrintPicture {
    public static void main(String[] args) {
        int choice =1 ;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1.In hình chữ nhật");
            System.out.println("2.In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3.In hình tam giác vuông, có cạnh góc vuông ở top-left ");
            System.out.println("4.In hình tam giác cân. ");
            System.out.println("5. Exit");
            System.out.print("NHập số bạn chọn: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1.In hình chữ nhật");
                    for (int i = 1; i <= 3; ++i){
                        for (int j = 1; j <= 6; ++j)
                            System.out.print("* ");
                            System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("2.In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                    for(int i=1; i<=5; i++){
                        for(int j=1; j<i; j++)
                            System.out.print("* ");
                            System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("3.In hình tam giác vuông, có cạnh góc vuông ở top-left ");
                    for(int i=7;i>=1;i--){
                        for(int j=1;j<=i;j++)
                            System.out.print("* ");
                            System.out.print("\n");
                    }
                    break;
                case 4:
                    System.out.println("4.In hình tam giác cân. ");
                    int m = 5, n = 5;
                    for (int i = 1; i <= 5; i++){
                        for (int j = 1; j <= 2 * 5 - 1; j++){
                            if (j >= m && j <= n)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        m--;
                        n++;
                        System.out.print("\n");
                    }
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("No choice!");
            }
        }
    }

}
