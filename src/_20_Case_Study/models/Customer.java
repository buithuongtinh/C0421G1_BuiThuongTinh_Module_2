package _20_Case_Study.models;

public class Customer extends Person{
    private String loaiKhach ;


    public Customer() {
    }

    public Customer(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public Customer(int id, String name, String ngaySinh, String phoneNumber, String gioiTinh, String cmnd, String email, String address, String loaiKhach) {
        super(id, name, ngaySinh, phoneNumber, gioiTinh, cmnd, email, address);
        this.loaiKhach = loaiKhach;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "loaiKhach='" + loaiKhach + '\'' +
                super.toString() +
                '}';
    }
}
