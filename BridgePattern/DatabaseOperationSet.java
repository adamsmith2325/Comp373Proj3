package adamSmithComp373Proj1.BridgePattern;
import adamSmithComp373Proj1.BridgePattern.*;

public abstract class DatabaseOperationSet{

    protected Resource resource;

    public DatabaseOperationSet(Resource resource2){
        this.resource = resource2;
    }
    
    abstract public void setResourceType();
    abstract public void getName();
    abstract public void getID();
    abstract public void setName(String newName);
        
    }