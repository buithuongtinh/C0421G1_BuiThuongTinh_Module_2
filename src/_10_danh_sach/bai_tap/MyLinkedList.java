package _10_danh_sach.bai_tap;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;    //head đối tượng lớp Node
    private int numNode; //xác định số phần tử trong danh sách,mặc định gán là 0.
    private boolean flag;
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    //Phương thức thêm một phần tử mới vào danh sách
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }
    // Phương thức thêm một phần tử mới vào đầu danh sách
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }
    //Phương thức thêm một phần tử mới vào cuối danh sách
    public void addLast(Object data) {
        if (head == null)
            addFirst(data);
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);
        }
    }
    // Phương thức xóa 1 phần tử tại vị trí index
    public void remove(int index) {
        Node temp = head;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }

        numNode--;
    }
    // Phương thức truy cập một phần tử trong danh sách
    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.next;
        System.out.println(temp.data);
    }
    // Phương thức size trả về số lượng các phần tử có trong danh sách
    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }
    // Phương thức contains kiểm tra phần tử o có trong danh sách không
    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            }
            else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }
    //  Phương thức indexOf trả về vị trí của phần tử o trong danh sách
    public int indexOf(Object data) {
        Node temp = head;
        int q = 0;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.data).equals(data)) {
                q = i;
                break;
            }
            else {
                temp = temp.next;
            }
        }
        return q;
    }
    //  Phương thức printList() in các phần tử trong danh sách
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
