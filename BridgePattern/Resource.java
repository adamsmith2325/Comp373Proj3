package adamSmithComp373Proj1.Domain.BridgePatternClasses;

public interface Resource{

    public void setResourceType();
    public String getName();
    public Integer getID();
    public void setName(String newName);
    
}