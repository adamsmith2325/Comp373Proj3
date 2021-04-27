package adamSmithComp373Proj1.VisitorPattern.visitors;
import adamSmithComp373Proj1.VisitorPattern.elements;

public interface GettersVisitor extends Visitor{
    public visit(FacilityLight facility);
    public visit(InspecLight Inspection);
    public visit(MainLight Maintainence);
    public visit(UseLight Use);
}

