package _12_Java_Collection_Framework.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tính",21);
        hashMap.put("Bảo",20);
        hashMap.put("Nhật",22);
        hashMap.put("Linh",25);
        System.out.println("Hiển thị các mục trong HashMap");
        System.out.println(hashMap + " \n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị các mục nhập theo thứ tự tăng dần của khóa");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Tính",21);
        linkedHashMap.put("Bảo",20);
        linkedHashMap.put("Nhật",22);
        linkedHashMap.put("Linh",25);
        System.out.println("\nThe age for " + "Nhật là " +linkedHashMap.get("Nhật"));


    }
}
