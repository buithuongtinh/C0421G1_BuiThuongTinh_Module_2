package _05_accessmodifier_staticmethod_staticproperty.bai_tap;

public class TestStudent {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.toString());
        student.setName("Wick");
        student.setClasses("C03");
        System.out.println(student.toString());
    }
}
