package _20_Case_Study.models;

public class Customer extends Person{
    private String loaiKhach ;
    private String address;

    public Customer() {
    }

    public Customer(String loaiKhach, String address) {
        this.loaiKhach = loaiKhach;
        this.address = address;
    }

    public Customer(int id, String name, String ngaySinh, double phoneNumber, String gioiTinh, double cmnd, String email, String loaiKhach, String address) {
        super(id, name, ngaySinh, phoneNumber, gioiTinh, cmnd, email);
        this.loaiKhach = loaiKhach;
        this.address = address;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "loaiKhach='" + loaiKhach + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
