package adamSmithComp373Proj1.VisitorPattern.elements;

public class InspecLight implements element{
    
    String name;
    Integer ID;

    public void accept(Visitor v){
        v.visit(this);
    }


}
