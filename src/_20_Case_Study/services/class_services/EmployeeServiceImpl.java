package _20_Case_Study.services.class_services;

import _20_Case_Study.models.Employee;
import _20_Case_Study.services.EmployeeService;
import _20_Case_Study.utils.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> listEmploy  = new ArrayList<>();
    private static WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
    private static final String filePath = "src\\_20_Case_Study\\data\\employee.csv";




    @Override
    public void add() {
        int id = 0;
        if (listEmploy.isEmpty()) {
            id = 1;
        } else {
            id = listEmploy.get(listEmploy.size() - 1).getId() + 1;
        }

        System.out.println("Nhập Họ tên nhân viên: ");
        String name = scanner.next();
        System.out.println("Nhập vào ngày tháng năm sinh:");
        String ngaySinh = scanner.next();
        System.out.println("Nhập vào giới tính:");
        String gioiTinh = scanner.next();
        System.out.println("Nhập vào CMND:");
        String cmnd = scanner.next();
        System.out.println("Nhập vào sdt:");
        String phoneNumber = scanner.next();
        System.out.println("Nhập vào email:");
        String email = scanner.next();
        System.out.println("Nhập vào địa chỉ:");
        String address = scanner.next();

        System.out.println("Chọn Trình độ nhân viên ? ");
        System.out.println("1 = Trung cấp");
        System.out.println("2 = Cao đẳng");
        System.out.println("3 = Đại Học");
        System.out.println("4 = Sau đại học");
        String level = scanner.next();
        switch (level) {
            case "1": {
                System.out.println("Trung cấp");
                level = "Trung cấp";

                break;
            }
            case "2": {
                System.out.println("Cao đẳng,");
                level = "Cao đẳng";

                break;
            }
            case "3": {
                System.out.println("Đại Học");
                level = "Đại Học";
                break;
            }
            case "4": {
                System.out.println("Sau đại học");
                level = "Sau đại học";
                break;
            }
            default: {
                System.out.println("Bạn chọn sai rồi !");
                break;
            }
        }


        System.out.println("Chọn Vị Trí nhân viên ? ");
        System.out.println("1 = Lễ tân");
        System.out.println("2 = Phục Vụ");
        System.out.println("3 = Chuyên Viên");
        System.out.println("4 = Giám sát");
        System.out.println("5 = Quản Lý");
        System.out.println("6 = Giám Đốc");
        String viTri = scanner.next();
        switch (viTri) {
            case "1": {
                System.out.println("Lễ tân");
                viTri = "Lễ tân";

                break;
            }
            case "2": {
                System.out.println("Phục Vụ");
                viTri = "Phục Vụ";

                break;
            }
            case "3": {
                System.out.println("Chuyên Viên");
                viTri = "Chuyên Viên";
                break;
            }
            case "4": {
                System.out.println("Giám sát");
                viTri = "Giám sát";
                break;
            }
            case "5": {
                System.out.println("Quản Lý");
                viTri = "Quản Lý";
                break;
            }
            case "6": {
                System.out.println("Giám Đốc");
                viTri = "Giám Đốc";
                break;
            }
            default: {
                System.out.println("Bạn chọn sai rồi !");
                break;
            }
        }

        System.out.println("Nhập vào Lương: ");
        double luong = scanner.nextDouble();

        listEmploy.add(
                new Employee(
                id,name,ngaySinh,gioiTinh,cmnd,phoneNumber,email,address,level,viTri,luong
                )
        );
        writeAndReadFile.Write(filePath,listEmploy);

    }

    @Override
    public void edit() {
        readFileEmploy();
        System.out.println("nhập vào id bn muốn sửa");
        int inputIdEdit = scanner.nextInt();
        for (int i = 0; i < listEmploy.size(); i++) {

            if (listEmploy.get(i).getId() == inputIdEdit) {
                System.out.println(listEmploy.get(i));

                listEmploy.get(i).getId();

                System.out.println("nhập vào name nhân viên");
                String inputName = scanner.next();
                listEmploy.get(i).setName(inputName);

                System.out.println("nhập vào ngày tháng năm sinh");
                String inputBirthday = scanner.next();
                listEmploy.get(i).setNgaySinh(inputBirthday);

                System.out.println("nhập vào giới tính");
                String inputGender = scanner.next();
                listEmploy.get(i).setGioiTinh(inputGender);

                System.out.println("nhập vào CMND");
                String inputCmnd = scanner.next();
                listEmploy.get(i).setCmnd(inputCmnd);

                System.out.println("nhập vào sdt");
                String inputNumber = scanner.next();
                listEmploy.get(i).setPhoneNumber(inputNumber);

                System.out.println("nhập vào email");
                String inputEmail = scanner.next();
                listEmploy.get(i).setEmail(inputEmail);

                System.out.println("nhập vào địa chỉ");
                String inputAddress = scanner.next();
                listEmploy.get(i).setAddress(inputAddress);

                System.out.println("nhập vào trình độ");
                System.out.println("1 = Trung cấp");
                System.out.println("2 = Cao Đẳng");
                System.out.println("3 = Đại học");
                System.out.println("4 = sau Đại học");
                String Level = scanner.next();
                switch (Level) {
                    case "1": {
                        System.out.println("Trung cấp");
                        Level = "Trung cấp";
                        listEmploy.get(i).setLevel(Level);
                        break;
                    }
                    case "2": {
                        System.out.println("Cao Đẳng ");
                        Level = "Cao Đẳng";
                        listEmploy.get(i).setLevel(Level);
                        break;
                    }
                    case "3": {
                        System.out.println("Đại học");
                        Level = "Đại học";
                        listEmploy.get(i).setLevel(Level);
                        break;
                    }
                    case "4": {
                        System.out.println("sau Đại học");
                        Level = "sau Đại học";
                        listEmploy.get(i).setLevel(Level);
                        break;
                    }
                    default: {
                        System.out.println("bn nhâp sai");
                        break;
                    }
                }


                System.out.println("nhập vào vị trí");
                System.out.println("1 = lễ tân");
                System.out.println("2 = phục vụ");
                System.out.println("3 = chuyên viên");
                System.out.println("4 = Giám sát");
                System.out.println("5 = quản lí");
                System.out.println("6 = giám đốc");
                String vitri = scanner.next();
                switch (vitri) {
                    case "1": {
                        System.out.println("lễ tân");
                        vitri = "lễ tân";
                        listEmploy.get(i).setViTri(vitri);
                        break;
                    }
                    case "2": {
                        System.out.println("phục vụ");
                        vitri = "phục vụ";
                        listEmploy.get(i).setViTri(vitri);
                        break;
                    }
                    case "3": {
                        System.out.println("chuyên viên");
                        vitri = "chuyên viên";
                        listEmploy.get(i).setViTri(vitri);
                        break;
                    }
                    case "4": {
                        System.out.println("giám sát");
                        vitri = "giám sát";
                        listEmploy.get(i).setViTri(vitri);
                        break;
                    }
                    case "5": {
                        System.out.println("quản lí");
                        vitri = "quản lí";
                        listEmploy.get(i).setViTri(vitri);
                        break;
                    }
                    case "6": {
                        System.out.println("giám đốc");
                        vitri = "giám đốc";
                        listEmploy.get(i).setViTri(vitri);
                        break;
                    }
                    default: {
                        System.out.println("bn nhập sai");
                        break;
                    }

                }
                System.out.println("nhập vào lương");
                double luong = scanner.nextDouble();
                listEmploy.get(i).setLuong(luong);

                writeAndReadFile.Write(filePath, listEmploy);
                break;
            }
        }

    }

    private void readFileEmploy() {
       WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
       writeAndReadFile.Read(filePath);
    }

    @Override
    public void display() {

    }
}
