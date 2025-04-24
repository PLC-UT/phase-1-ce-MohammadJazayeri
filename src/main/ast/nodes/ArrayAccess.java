package main.ast.nodes;

import main.visitor.IVisitor;

public class ArrayAccess extends Expression{
    private Expression array;
    private Expression index;

    public ArrayAccess(Expression array, Expression index) {
        this.array = array;
        this.index = index;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
