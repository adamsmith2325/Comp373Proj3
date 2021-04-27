package com.observer.observer;
import adamSmithComp373Proj1.DAL.FacilityDAO;

import java.util.ArrayList;

public class Facility implements Observer {

    //Required Class Attributes
    private FacilityDAO Connection  = new FacilityDAO();
    private Integer FacilityID;
    private String Name = Connection.getName(this.FacilityID);
    private String Location = Connection.getLocation(this.FacilityID);
    private String phoneNumber = Connection.getPhone(this.FacilityID);
    private Integer numOfRooms = Connection.getNumberOfRooms(this.FacilityID);
    public Integer OccupiedRooms = Connection.getOccupiedRooms(this.FacilityID);


    public Facility(Integer ID){
        this.FacilityID = ID;
    }