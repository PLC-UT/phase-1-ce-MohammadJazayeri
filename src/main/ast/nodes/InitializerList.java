package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class InitializerList extends Expression{

    private ArrayList<Designation> designations = new ArrayList<>();
    private ArrayList<Initializer> initializers = new ArrayList<>();

    public InitializerList() {}

    public void addDesignation(Designation designation) {
        this.designations.add(designation);
    }

    public void addInitializer(Initializer initializer) {
        this.initializers.add(initializer);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
