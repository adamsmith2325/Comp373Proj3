package adamSmithComp373Proj1.BridgePattern;


public class BaseGettersSetters extends DatabaseOperationSet{

    Resource resource;

    public BaseGettersSetters(Resource resource2){
        super(resource2);
    }

    public void setResourceType(){
        resource.setResourceType();
    }

    public String getName(){
        return resource.getName();
    }

    public Integer getID(){
        return resource.getID();
    }

    public void setName(String newName2){
        resource.setName(newName2);
    }

}