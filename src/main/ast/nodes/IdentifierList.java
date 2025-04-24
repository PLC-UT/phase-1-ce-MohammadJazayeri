package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class IdentifierList extends Node {
    private ArrayList<Identifier> identifiers = new ArrayList<>();

    public IdentifierList() {}

    public void addIdentifier(String val) {
        Identifier id = new Identifier(val);
        this.identifiers.add(id);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
