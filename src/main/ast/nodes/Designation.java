package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class Designation extends Node{
    private ArrayList<Designator> designators = new ArrayList<>();

    public Designation() {}

    public void addDesignator(Designator designator) {
        this.designators.add(designator);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
