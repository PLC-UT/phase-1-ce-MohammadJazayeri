package main.ast.nodes;

import main.visitor.IVisitor;

public class ExpressionStmt extends Stmt{
    private Expression expression;

    public ExpressionStmt() {}

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
