package adamSmithComp373Proj1.VisitorPattern.elements;
import adamSmithComp373Proj1.VisitorPattern.visitors.*;


public class Facility implements element{

    String name;
    Integer ID;

    public void accept(Visitor v){
        v.visit(this);
    }

}


