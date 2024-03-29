package _20_Case_Study.models;

import java.io.Serializable;

public class House extends Facility implements Serializable {
    private String tieuChuanPhong;
    private int soTang ;

    public House() {
    }

    public House(String tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String tenDichVu, int dienTichUse, double chiPhiThue, int maximunPeoples, String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDichVu, dienTichUse, chiPhiThue, maximunPeoples, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                super.toString() +
                '}';
    }
}
