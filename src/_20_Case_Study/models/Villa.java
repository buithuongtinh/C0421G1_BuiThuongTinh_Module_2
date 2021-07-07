package _20_Case_Study.models;

public class Villa extends Facility{
    private String tieuChuanPhong;
    private double dienTichPool ;
    private int soTang ;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, double dienTichPool, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichPool = dienTichPool;
        this.soTang = soTang;
    }

    public Villa(String tenDichVu, int dienTichUse, double chiPhiThue, int maximunPeoples, String kieuThue, String tieuChuanPhong, double dienTichPool, int soTang) {
        super(tenDichVu, dienTichUse, chiPhiThue, maximunPeoples, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichPool = dienTichPool;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichPool() {
        return dienTichPool;
    }

    public void setDienTichPool(double dienTichPool) {
        this.dienTichPool = dienTichPool;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }


    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichPool=" + dienTichPool +
                ", soTang=" + soTang +
                '}';
    }
}
