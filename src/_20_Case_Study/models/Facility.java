package _20_Case_Study.models;

public abstract class Facility {
    private String tenDichVu;
    private int dienTichUse;
    private double chiPhiThue;
    private int maximunPeoples ;

    public Facility() {
    }

    public Facility(String tenDichVu, int dienTichUse, double chiPhiThue, int maximunPeoples) {
        this.tenDichVu = tenDichVu;
        this.dienTichUse = dienTichUse;
        this.chiPhiThue = chiPhiThue;
        this.maximunPeoples = maximunPeoples;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDienTichUse() {
        return dienTichUse;
    }

    public void setDienTichUse(int dienTichUse) {
        this.dienTichUse = dienTichUse;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getMaximunPeoples() {
        return maximunPeoples;
    }

    public void setMaximunPeoples(int maximunPeoples) {
        this.maximunPeoples = maximunPeoples;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichUse=" + dienTichUse +
                ", chiPhiThue=" + chiPhiThue +
                ", maximunPeoples=" + maximunPeoples +
                '}';
    }
}
