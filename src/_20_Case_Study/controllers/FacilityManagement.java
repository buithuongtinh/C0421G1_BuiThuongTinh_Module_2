package _20_Case_Study.controllers;

import _20_Case_Study.services.class_services.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagement {
    public static void FacilityManagement(){
        Scanner scanner = new Scanner(System.in);
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("1 = Display list facility ");
        System.out.println("2 = Add new facility ");
        System.out.println("3 = Display list facility maintenance");
        System.out.println("4 = Return main menu ");
        int input = scanner.nextInt();
        switch (input) {
            case 1: {
                facilityService.display();
                break;
            }
            case 2: {
                facilityService.add();
                break;
            }
            case 3: {

                break;
            }
            case 4: {
                System.out.println("Trả về Menu chính");
                FuramaController.displayMainMenu();
            }
            default: {
                System.out.println("BẠn đã nhập Sai ! Hãy Nhập Lại: ");
                break;
            }
        }
    }
}
