package adamSmithComp373Proj1.VisitorPattern.visitors;
import adamSmithComp373Proj1.VisitorPattern.elements;

public class SetNameVisitor implements Visitor{
   
    public void visit(FacilityLight Facility, String newName){
        Facility.name = newName; 
    }

    public void visit(InspecLight Inspec, String newName){
        Inspec.name = newName; 
    }

    public void visit(MainLight Main, String newName){
        Main.name = newName; 
    }

    public void visit(UseLight Use, String newName){
        Use.name = newName; 
    }
}

