package _20_Case_Study.models;

public class Employee extends Person{
    private String level ;
    private String viTri;
    private double luong;


    public Employee(int id, String name, String ngaySinh, String gioiTinh, String cmnd, String phoneNumber, String email, String address, String level, String viTri, double luong) {
    }

    public Employee(String level, String viTri, double luong) {
        this.level = level;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(int id, String name, String ngaySinh, String phoneNumber, String gioiTinh, String cmnd, String email, String level, String viTri, double luong) {
        super(id, name, ngaySinh, phoneNumber, gioiTinh, cmnd, email);
        this.level = level;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
