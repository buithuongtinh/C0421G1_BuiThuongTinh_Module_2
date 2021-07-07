package _20_Case_Study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose 1 = Employee Management");
        System.out.println("choose 2 = Customer Management");
        System.out.println("choose 3 = Facility Management");
        System.out.println("choose 4 = Booking Managerment");
        System.out.println("choose 5 = Promotion Management");
        System.out.println("choose 6 = exit");
        int choice = scanner.nextInt();
        while (true){
            switch (choice){
                case 1:{
                    System.out.println("Employee Management");
                    EmployeeManagement.EmployeeManagement();
                    break;
                }
                case 2:{
                    System.out.println("Customer Management");
                    CustomerManagement.CustomerManagement();
                    break;
                }
                case 3:{
                    System.out.println("Facility Management ");
                    FacilityManagement.FacilityManagement();
                    break;
                }
                case 4:{
                    System.out.println("Booking Managerment");
                    BookingManagerment.BookingManagerment();
                    break;
                }
                case 5:{
                    System.out.println("Promotion Management");
                    PromotionManagement.PromotionManagement();
                    break;
                }
                case 6:{
                    System.exit(1);
                    break;
                }
                default:{
                    System.out.println("error");
                    break;
                }
            }
        }
    }
}
