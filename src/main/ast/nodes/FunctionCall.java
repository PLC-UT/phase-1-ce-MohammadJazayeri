package main.ast.nodes;

import main.visitor.IVisitor;

public class FunctionCall extends Expression {
    private Expression expression;
    private ArgumentExpressionList argumentExpressionList;

    public FunctionCall(Expression expression) {
        this.expression = expression;
    }

    public void setArgumentExpressionList(ArgumentExpressionList argumentExpressionList) {
        this.argumentExpressionList = argumentExpressionList;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
