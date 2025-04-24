package main.ast.nodes;

import main.visitor.IVisitor;

public class Initializer extends Expression{
    private Expression expression;
    private InitializerList initializerList;

    public Initializer() {}

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setInitializerList(InitializerList initializerList) {
        this.initializerList = initializerList;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
