package main.ast.nodes;

import main.visitor.IVisitor;

public class Casting extends Expression {
    private TypeName typeName;
    private CastExpression castExpression;

    public Casting(TypeName typeName, CastExpression castExpression) {
        this.castExpression = castExpression;
        this.typeName = typeName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
