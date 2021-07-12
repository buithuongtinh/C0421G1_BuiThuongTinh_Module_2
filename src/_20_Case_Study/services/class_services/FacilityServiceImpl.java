package _20_Case_Study.services.class_services;

import _20_Case_Study.controllers.FacilityManagement;
import _20_Case_Study.models.Facility;
import _20_Case_Study.models.House;
import _20_Case_Study.models.Room;
import _20_Case_Study.models.Villa;
import _20_Case_Study.services.FacilityService;
import _20_Case_Study.common.WriteAndReadFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityVilla = new LinkedHashMap<>();
    private static Map<Facility, Integer> facilityHouse = new LinkedHashMap<>();
    private static Map<Facility, Integer> facilityRoom = new LinkedHashMap<>();
    private static Map<Facility,Integer> facility = new LinkedHashMap<>();
    private static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    private static final String VillaPath = "src\\_20_Case_Study\\data\\villa.csv";
    private static final String HousePath = "src\\_20_Case_Study\\data\\house.csv";
    private static final String RoomPath = "src\\_20_Case_Study\\data\\room.csv";
    private static final String FacilityPath ="src\\_20_Case_Study\\data\\facility.csv";
    private static WriteAndReadFacility writeAndRead = new WriteAndReadFacility();
    private static FacilityManagement facilityManagement = new FacilityManagement();

    static {
        facilityHouse.put(new House("nhà",100,5000,4,"tháng","Phòng thường",2),1);
        facilityRoom.put(new Room("phòng",20,1000,1,"giờ","tặng nước"),3);
        facilityVilla.put(new Villa("villa",300,20000,10,"ngày","Phòng vip",20,2),1);

    }




    @Override
    public void add() {
        System.out.println("Chọn 1 : addVilla");
        System.out.println("Chọn 2 : addRoom");
        System.out.println("Chọn 3 : addhouse");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:{
                addNewVilla();
                break;
            }
            case 2:{
                addNewRoom();
                break;
            }
            case 3:{
                addNewHouse();
                break;
            }

        }

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        getVilla();
        for (Facility facility : facilityVilla.keySet()) {
            System.out.println(facility + " " + facilityVilla.get(facility));
        }
        getHouse();
        for (Facility facility : facilityHouse.keySet()) {
            System.out.println(facility + "" + facilityHouse.get(facility));

        }
        getRoom();
        for (Facility facility : facilityRoom.keySet()) {
            System.out.println(facility + " " + facilityRoom.get(facility));
        }

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập vào tên Villa ");
        String name = scanner.next();

        System.out.println("Nhập vào diện tích của villa ");
        int area = scanner.nextInt();

        System.out.println("Nhập vào số tiền");
        int moneyRend = scanner.nextInt();

        System.out.println("Nhập vào số lượng người ở");
        int maxPeople = scanner.nextInt();

        System.out.println("Nhập vào loại cho thuê");

        String rentalType = scanner.next();

        System.out.println("Nhập vào phòng tiêu chuẩn");
        String roomStandard = scanner.next();

        System.out.println("Nhập vào diện tích hồ bơi");
        int arePool = scanner.nextInt();

        System.out.println("Nhập vào số tầng");
        int numberOfFloor = scanner.nextInt();

        facilityVilla.put(new Villa(name, area, moneyRend, maxPeople, rentalType, roomStandard, arePool, numberOfFloor), 1);
        writeAndRead.Write(VillaPath,facilityVilla);
        facility.putAll(facilityVilla);
        writeAndRead.Write(FacilityPath,facility);

    }

    @Override
    public void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào name ");
        String name = scanner.next();

        System.out.println("nhập vào diện tích");
        int area = scanner.nextInt();

        System.out.println("nhập vào số tiền");
        int moneyRend = scanner.nextInt();

        System.out.println("nhập vào số lượng người ở");
        int maxPeople = scanner.nextInt();

        System.out.println("nhập vào loại cho thuê");
        String rentalType = scanner.next();

        System.out.println("nhập vào phòng tiêu chuẩn");
        String roomStandard = scanner.next();

        System.out.println("nhập vào số tầng");
        int numberOfFloor = scanner.nextInt();

        facilityHouse.put(new House(name, area, moneyRend, maxPeople, rentalType, roomStandard, numberOfFloor), 1);
        writeAndRead.Write(HousePath, facilityHouse);
        facility.putAll(facilityHouse);
        writeAndRead.Write(FacilityPath,facility);


    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập vào Tên: ");
        String name = scanner.next();

        System.out.println("Nhập vào diện tích:");
        int area = scanner.nextInt();

        System.out.println("Nhập vào số tiền:");
        int moneyRend = scanner.nextInt();

        System.out.println("Nhập vào số lượng người ở:");
        int maxPeople = scanner.nextInt();

        System.out.println("Nhập vào loại cho thuê:");
        String rentalType = scanner.next();

        System.out.println("Nhập vào phòng tiêu chuẩn:");
        String serviceFree = scanner.next();


        facilityRoom.put(new Room(name, area, moneyRend, maxPeople, rentalType, serviceFree), 1);
        writeAndRead.Write(RoomPath, facilityRoom);
        facility.putAll(facilityRoom);
        writeAndRead.Write(FacilityPath,facility);
    }


    @Override
    public Map<Facility, Integer> getVilla() {
        facilityVilla = writeAndRead.Read(VillaPath);
        return facilityVilla;
    }

    @Override
    public Map<Facility, Integer> getHouse() {
        facilityHouse = writeAndRead.Read(HousePath);
        return facilityHouse;
    }

    @Override
    public Map<Facility, Integer> getRoom() {
        facilityRoom = writeAndRead.Read(RoomPath);
        return facilityRoom;
    }

    @Override
    public Map<Facility, Integer> getAll() {
        return null;
    }
}