package adamSmithComp373Proj1.BridgePattern;

public class InspectionResource{
    
    Integer ID;
    String Name;


    public void setResourceType(){
          System.out.println("Inspection");
    }
    
    public Integer getID(){
        return this.ID;
    }

    public String getName(){
        return this.Name;
    }
   
    public void setName(String newName){
        this.Name = newName;
    }
   
}