package main.ast.nodes;

import main.visitor.IVisitor;

public class UnaryExpression extends Expression {
    private Expression expression;
    private UnaryOperator operator;

    public UnaryExpression(Expression expression, UnaryOperator unaryOperator) {
        this.expression = expression;
        this.operator = unaryOperator;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
