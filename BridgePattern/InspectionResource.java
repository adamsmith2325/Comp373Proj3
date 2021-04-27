package adamSmithComp373Proj1.Domain.BridgePatternClasses;

public interface InspectionResource(){
    public String getName();

    public String getLocation();
   
    public String getPhone();
   
    public Integer getNumberOfRooms();
   
    public Integer getOccupiedRooms();
   
    public void setName(String newName);
   
    public void setLocation(String newLocation);
   
    public void setPhone(String newPhone);
   
    public void setNumberOfRooms(Integer newRoomsNum);
}