package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class ArgumentExpressionList extends Expression{
    private ArrayList<Expression> expressions = new ArrayList<>();
    private int line;

    public ArgumentExpressionList() {}

    public void addExpression(Expression expression) {
        this.expressions.add(expression);
    }

    @Override
    public int getLine() {
        return line;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
