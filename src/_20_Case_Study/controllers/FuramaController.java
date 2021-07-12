package _20_Case_Study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------Main Menu---------------");
        System.out.println("<1> Employee Management");
        System.out.println("<2> Customer Management");
        System.out.println("<3> Facility Management");
        System.out.println("<4> Booking Management");
        System.out.println("<5> Promotion Management");
        System.out.println("<6> exit");
        System.out.println("Enter your choice: ");
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
                    System.out.println("Booking Management");
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
