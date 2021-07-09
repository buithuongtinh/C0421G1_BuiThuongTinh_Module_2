package _20_Case_Study.services.class_services;

import _20_Case_Study.common.WriteAndReadBooking;
import _20_Case_Study.libs.ComparatorBooking;
import _20_Case_Study.models.Booking;
import _20_Case_Study.services.BookingService;

import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static WriteAndReadBooking writeAndReadBooking = new WriteAndReadBooking();
    private static final String filePath = "src\\case_study\\data\\BookingDangSuLi.txt";
    private static Collection<Booking> set = new TreeSet<Booking>(new ComparatorBooking());

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {

    }
}
