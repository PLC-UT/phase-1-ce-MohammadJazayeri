package main.ast.nodes;

import main.visitor.IVisitor;

public class BinaryExpression extends Expression{
    private Expression firstExpression;
    private Expression secondExpression;
    private BinaryOperator operator;

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
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
