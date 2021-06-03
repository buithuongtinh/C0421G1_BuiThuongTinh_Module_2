package _02_vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class PrintPicture {
    public static void main(String[] args) {
        int choice =1 ;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
        }
    }
}
