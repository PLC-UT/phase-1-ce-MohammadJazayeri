package main.ast.nodes;

import main.visitor.IVisitor;

public class Constant extends Expression {
    private String val;

    public Constant(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
