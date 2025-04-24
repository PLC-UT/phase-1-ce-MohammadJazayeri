package main.ast.nodes;

import main.visitor.IVisitor;

public class Identifier extends Expression{
    private String name;
    private int line;

    public Identifier(String _name) {this.name = _name;}
    public void setName(String name) {this.name = name;}
    public String getName(){return this.name;}

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
