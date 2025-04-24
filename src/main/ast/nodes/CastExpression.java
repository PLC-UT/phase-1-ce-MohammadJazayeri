package main.ast.nodes;

import main.visitor.IVisitor;

public class CastExpression extends Expression {
    private Expression expression;
    private CastExpression castExpression;
    private TypeName typeName;

    private String digits;

    public CastExpression() {}

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setCastExpression(CastExpression castExpression) {
        this.castExpression = castExpression;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
