package adamSmithComp373Proj1.VisitorPattern.elements;

public class MainLight implements element{

    String name;
    Integer ID;

    public void accept(Visitor v){
        v.visit(this);
    }


}
