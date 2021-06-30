package _20_Case_Study.models;

public class Booking {
    private int idBooking ;
    private double startDay;
    private double endDay;
    private int idCustomer;
    private String tenDichVu;
    private String loaiDichVu;

    public Booking() {
    }

    public Booking(int idBooking, double startDay, double endDay, int idCustomer, String tenDichVu, String loaiDichVu) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.idCustomer = idCustomer;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getStartDay() {
        return startDay;
    }

    public void setStartDay(double startDay) {
        this.startDay = startDay;
    }

    public double getEndDay() {
        return endDay;
    }

    public void setEndDay(double endDay) {
        this.endDay = endDay;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                ", idCustomer=" + idCustomer +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", loaiDichVu='" + loaiDichVu + '\'' +
                '}';
    }
}
