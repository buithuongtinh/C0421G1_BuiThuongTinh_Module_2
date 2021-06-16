package _10_danh_sach.bai_tap;

import java.util.Arrays;

public class MySimpleList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] element;

    public MySimpleList() {
        element = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MySimpleList(int size) {
        element = (E[]) new Object[size];
    }

    private void ensureCapa() {
        if (size > element.length) {
            int biggerSize = size * 2 + 1;
            element = Arrays.copyOf(element, biggerSize);
        }
    }

    public void add(E e) {
        size += 1;
        ensureCapa();
        element[size - 1] = e;
    }
    // thêm một phần tử
    public boolean add(E e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                element[i + 1] = element[i];
            }
            element[index] = e;
            return true;
        }
        return false;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return element[index];
        }
        return null;
    }
     // hình như trả về một bản sao của arrayList
    @Override
    public MySimpleList clone() {
        MySimpleList<E> clone = new MySimpleList<>(element.length);
        for (E x : element) {
            clone.add(x);
        }
        return clone;
    }

    public E[] getElement() {
        return this.element;
    }
    // trả về số lượng phần tử có trong mảng
    public int size() {
        return size;
    }
    // remove() xóa phần tử ra khỏi ArrayList theo 2 cách đó là xóa dựa vào chỉ số của phần tử
    // và xóa trực tiếp phần tử đó (không cần biết đến chỉ số của nó).
    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                element[i] = element[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }
    // xóa tất cả các phần tử có trong ArrayList
    public void clear() {
        element = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    // tìm vị trí xuất hiện đầu tiên của 1 phần tử , tìm thấy thì trả về chỉ số xh đầu tiên,ko là -1
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (element[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    // tìm kiếm phần trực tiếp phần tử , true là tìm thấy và ngược lại
    public boolean contains(E e) {
        for (E x : element) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }




    //------------------test--------------------//

    public static void main(String[] args) {
        MySimpleList<String> list = new MySimpleList<>();
        list.add("Đứng");
        list.add("Ngồi");
        list.add("không");
        list.add("yên");
        System.out.println("Các phần tử có trong list là: ");
        System.out.println(Arrays.toString(list.element));

        list.getElement();
        System.out.println(list.indexOf("yên"));
        System.out.println(list.indexOf("nằm"));

        list.remove(0);
        System.out.println("Các phần tử có trong list là: ");
        System.out.println(Arrays.toString(list.element));

        System.out.println();
        list.add("cũng",1);
        System.out.println("Các phần tử có trong list là: ");
        System.out.println(Arrays.toString(list.element));

        list.getElement();
        MySimpleList<String> clone = list.clone();
        System.out.println(clone.contains("cũng"));
        System.out.println(clone.contains("mệt"));

        System.out.println(" phần tử vị trí thứ 3 là: ");
        System.out.println(clone.get(3));

        System.out.println("số lượng phần tử có trong list là: ");
        System.out.println(clone.size());
        clone.clear();
        System.out.println("số lượng phần tử có trong list sau khi dùng clear()  là: ");
        System.out.println(clone.size());
        clone.getElement();


    }


}