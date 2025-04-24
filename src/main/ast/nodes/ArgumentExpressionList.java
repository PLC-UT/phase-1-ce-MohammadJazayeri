package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class ArgumentExpressionList extends Expression{
    private ArrayList<Expression> expressions = new ArrayList<>();

    public ArgumentExpressionList() {}

    public void addExpression(Expression expression) {
        this.expressions.add(expression);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
