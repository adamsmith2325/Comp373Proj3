package adamSmithComp373Proj1.BridgePattern;

public class UseResource{
    
    Integer ID;
    String Name;


    public void setResourceType(){
          System.out.println("Use");
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