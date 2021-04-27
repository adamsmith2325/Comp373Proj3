package adamSmithComp373Proj1.VisitorPattern.visitors;
import adamSmithComp373Proj1.VisitorPattern.elements;

public interface Visitor {
    public void visit(FacilityLight facility);
    public void visit(InspecLight Inspection);
    public void visit(MainLight Maintainence);
    public void visit(UseLight Use);
}
