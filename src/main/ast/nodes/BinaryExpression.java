package main.ast.nodes;

import main.visitor.IVisitor;

public class BinaryExpression extends Expression{
    private Expression firstExpression;
    private Expression secondExpression;
    private BinaryOperator operator;
    private int line;
    private String leftHand;

    public BinaryExpression(Expression firstExpression, Expression secondExpression, BinaryOperator operator) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.operator = operator;
    }

    public BinaryExpression(Expression firstExpression, Expression secondExpression, BinaryOperator operator, String leftHand) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.operator = operator;
        this.leftHand = leftHand;
    }

    public BinaryExpression(Expression expression, BinaryOperator operator, String leftHand) {
        this.firstExpression = expression;
        this.operator = operator;
        this.leftHand = leftHand;
    }

    public void setLeftHand(String leftHand) {
        this.leftHand = leftHand;
    }

    public Expression getFirstExpression() {
        return firstExpression;
    }

    public Expression getSecondExpression() {
        return secondExpression;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    public String getOperator() {
        return this.operator.getSymbol();
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
