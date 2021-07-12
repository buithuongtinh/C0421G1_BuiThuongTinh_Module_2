package _20_Case_Study.controllers;


import _20_Case_Study.services.class_services.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagement {
    public static void CustomerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Display list customers ");
        System.out.println("2: Add new customer ");
        System.out.println("3: Edit customer ");
        System.out.println("4: Return main menu ");
        int input = scanner.nextInt();
        switch (input){
            case 1:{
                customerService.display();
                break;
            }
            case 2:{
                customerService.add();
                break;
            }
            case 3:{
                customerService.edit();
                break;
            }
            case 4:{
                System.out.println("Trả về Menu chính.");
                FuramaController.displayMainMenu();
            }
            default:{
                System.out.println("BẠn đã nhập Sai ! Hãy Nhập Lại: ");
                break;
            }
        }
    }
}
