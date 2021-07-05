package _20_Case_Study.models;

public class Person {
    private int id;
    private String name;
    private String ngaySinh;
    private String phoneNumber;
    private String gioiTinh;
    private String cmnd ;
    private String email ;

    public Person() {
    }

    public Person(int id, String name, String ngaySinh, String phoneNumber
            , String gioiTinh, String cmnd, String email)
    {
        this.id = id;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.phoneNumber = phoneNumber;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cmnd=" + cmnd +
                ", email='" + email + '\'' +
                '}';
    }
}
