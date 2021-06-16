package _10_danh_sach.bai_tap;

import java.util.LinkedList;

public class MyLinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add(0,"Đứng");
        list.add(1, "Ngồi");
        list.add(2,"không");
        list.add(3,"yên");

        System.out.println("Các phần tử có trong list là: ");
        System.out.println(list);

        System.out.println("ví dụ sử dụng phương thức addFirst phần tử \"Tôi\": ");
        //thêm vào đầu mảng
        list.addFirst("Tôi");
        System.out.println(list);

        System.out.println("ví dụ sử dụng phương thức addLast phần tử \"Rồi\": ");
        //thêm vào cuối mảng
        list.addLast("Rồi");
        System.out.println(list);

        System.out.println("ví dụ sử dụng phương thức indexOf() phần tử \"Rồi\" : ");
        //kiểm tra xem Ngồi có tồn tại trong list nếu có trả về chỉ số xuất hiện đầu tiên của phần tử
        System.out.println(list.indexOf("Ngồi"));
        //nếu ko thì trả về -1
        System.out.println(list.indexOf("Mệt"));

        System.out.println("ví dụ sử dụng phương thức contains() phần tử \"Tôi\" : ");
        // kiểm tra xem Tôi có tồn tại trong list hay không?
        System.out.println(list.contains("Tôi"));
        // Kết quả trả về là true nếu tìm thấy, ngược lại trả về false.
        System.out.println(list.contains("Bạn"));

        System.out.println("Số phần tử của list ban đầu : " + list);
        System.out.println("Các phần tử của list ban đầu: " + list.size());
        // remove phần tử có chỉ số index = 1 khỏi list
        list.remove(1);
        System.out.println("\nCác phần tử của list sau khi remove phần tử co index = 1: "
                + list);
        System.out.println("Số phần tử của list sau khi remove phần tử co index = 1: "
                + list.size());
        // remove phần tử có chỉ số index = 1 khỏi list
        list.remove("Ngồi");
        System.out.println("\nSố phần tử của list sau khi remove phần tử \"Ngồi\": "
                + list);
        System.out.println("Các phần tử của list sau khi remove phần tử \"Ngồi\": "
                + list.size());

        list.clear();
        System.out.println("\nCác phần tử của list sau khi clear: " + list);
        System.out.println("Số  phần tử của list sau khi clear: " + list.size());
    }
}
