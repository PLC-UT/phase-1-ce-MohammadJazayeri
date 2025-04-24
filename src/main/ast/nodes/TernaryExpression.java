package main.ast.nodes;

import main.visitor.IVisitor;

public class TernaryExpression extends Expression{
    private Expression firstExpression;
    private Expression secondExpression;
    private Expression thirdExpression;

    public TernaryExpression(Expression firstExpression, Expression secondExpression, Expression thirdExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.thirdExpression = thirdExpression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
