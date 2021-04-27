package adamSmithComp373Proj1.VisitorPattern.visitors;
import adamSmithComp373Proj1.VisitorPattern.elements;

public class GetIDVisitor implements Visitor{

    public Integer visit(FacilityLight Facility){
        return Facility.ID; 
    }

    public Integer visit(InspecLight Inspec){
        return Inspec.ID; 
    }

    public Integer visit(MainLight Main){
        return Main.ID; 
    }

    public Integer visit(UseLight Use){
        return Use.ID; 
    }

}

