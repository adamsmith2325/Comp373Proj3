
package com.observer.subject;

import com.observer.observers.FacilityObserver;


public enum Type{TYPE, TYPE2, TYPE3}

public class Inspection implements FacilityGetSetInterface  {

    private InspectionDAO Conn = new InspectionDAO();
    private Integer InspectionID;
    private String Name = Conn.getName();
    private Type InsType = Conn.getType();
    private String Details = Conn.getDetails();
    private Integer facility = Conn.getFacility();
    private Integer Room = Conn.getRoom();

    public Inspection(Integer ID) {
        this.InspectionID = ID;
    }

    public int getInspectionID() {
        return Conn.getInspectionID(this.InspectionID);
    }
    public void addInspectionID(int inspectionID) {
        Conn.addInspectionID(this.InspectionID);
    }

    public String getName() {
        return this.Name;
    }
    public Type getType() {
        return this.InsType;
    }
    public String getDetails() {
        return this.Details;
    }
    public int getFacility() {
        return Conn.getFacility(this.facility);
    }

    public Integer getRoom(){
        return Conn.getRoom(this.Room);
    }
    public void setRoom(int InspectionID){
        Conn.setRoom(this.InspectionID);
    }

    public void setFacility(Facility facility) {
        Conn.setFacility();
    }

    public void setFacility(Integer FacilityID) {

        Conn.setFacility();

    }

    public void setType(String InsType) {
        Conn.setType(this.InspectionID);
    }
    public void setDetails(String insDetails) {
        Conn.setDetails();
    }
}
