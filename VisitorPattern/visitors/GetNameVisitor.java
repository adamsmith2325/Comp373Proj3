package adamSmithComp373Proj1.VisitorPattern.visitors;
import adamSmithComp373Proj1.VisitorPattern.elements;

public class GetNameVisitor implements Visitor{

    public String visit(FacilityLight Facility){
        return Facility.name; 
    }

    public String visit(InspecLight Inspec){
        return Inspec.name; 
    }

    public String visit(MainLight Main){
        return Main.name; 
    }

    public String visit(UseLight Use){
        return Use.name; 
    }

}

