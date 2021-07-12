package _20_Case_Study.controllers;

import _20_Case_Study.services.class_services.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    private  static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static void EmployeeManagement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Display list employees ");
        System.out.println("2: Add new employee ");
        System.out.println("3: Edit employee ");
        System.out.println("4: Return main menu ");
        int input = scanner.nextInt();
        boolean check = true;
        switch (input){
            case 1:{
                employeeService.display();
                break;
            }
            case 2:{
                employeeService.add();
                break;
            }
            case 3:{
                employeeService.edit();
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
