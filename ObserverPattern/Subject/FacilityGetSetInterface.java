package com.observer.subject;

import com.observer.observers.FacilityObserver;

public interface FacilityGetSetInterface {
    


//Get functionalities



 public String getName();

 public String getLocation();

 public String getPhone();

 public Integer getNumberOfRooms();

 public Integer getOccupiedRooms();


 //Set functionalities

 public void setName(String newName);

 public void setLocation(String newLocation);

 public void setPhone(String newPhone);

 public void setNumberOfRooms(Integer newRoomsNum);


}
