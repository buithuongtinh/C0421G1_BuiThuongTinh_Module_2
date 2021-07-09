package _20_Case_Study.services.class_services;

import _20_Case_Study.models.Booking;
import _20_Case_Study.services.PromotionService;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> set = new TreeSet<>();


    @Override
    public void displayVoucher() {

    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {
        new BookingServiceImpl().display();

    }

    @Override
    public void display() {

    }
}
