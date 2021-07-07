package _20_Case_Study.services;


import _20_Case_Study.models.Facility;

import java.util.Map;

public interface FacilityService  extends  Service{
    void addNewVilla();
    void addNewHouse();
    void addNewRoom();
    Map<Facility,Integer>getVilla();
    Map<Facility,Integer>getHouse();
    Map<Facility,Integer> getRoom();
    Map<Facility,Integer>getAll();
}
