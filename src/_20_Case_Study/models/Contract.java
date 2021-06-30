package _20_Case_Study.models;

public class Contract {
    private int idHopDong ;
    private int idBooking ;
    private double tienCoc ;
    private double tongTien;
    private int idCustomer ;

    public Contract() {
    }

    public Contract(int idHopDong, int idBooking, double tienCoc, double tongTien, int idCustomer) {
        this.idHopDong = idHopDong;
        this.idBooking = idBooking;
        this.tienCoc = tienCoc;
        this.tongTien = tongTien;
        this.idCustomer = idCustomer;
    }

    public int getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(int idHopDong) {
        this.idHopDong = idHopDong;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idHopDong=" + idHopDong +
                ", idBooking=" + idBooking +
                ", tienCoc=" + tienCoc +
                ", tongTien=" + tongTien +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
