package _05_accessmodifier_staticmethod_staticproperty.thuc_hanh;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change(); //gọi phương thức thay đổi

        //tạo đối tượng objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }

}

