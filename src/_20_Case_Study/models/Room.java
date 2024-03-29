package _20_Case_Study.models;

import java.io.Serializable;

public class Room extends Facility implements Serializable {
    private String freeservice ;

    public Room() {
    }

    public Room(String freeservice) {
        this.freeservice = freeservice;
    }

    public Room(String tenDichVu, int dienTichUse, double chiPhiThue, int maximunPeoples, String kieuThue, String freeservice) {
        super(tenDichVu, dienTichUse, chiPhiThue, maximunPeoples, kieuThue);
        this.freeservice = freeservice;
    }

    public String getFreeservice() {
        return freeservice;
    }

    public void setFreeservice(String freeservice) {
        this.freeservice = freeservice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeservice='" + freeservice + '\'' +
                super.toString() +
                '}';
    }
}
