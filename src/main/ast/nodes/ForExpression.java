package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class ForExpression extends Expression{
    private ArrayList<Expression> expressions = new ArrayList<>();

    public ForExpression(Expression expression) {
        this.expressions.add(expression);
    }

    public void addExpression(Expression expression) {
        this.expressions.add(expression);
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
