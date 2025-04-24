package main.ast.nodes;

import main.visitor.IVisitor;

public class Designator extends Node{

    private Expression expression;
    private Identifier identifier;

    public Designator() {}

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setIdentifier(String val) {
        Identifier id = new Identifier(val);
        this.identifier = id;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
