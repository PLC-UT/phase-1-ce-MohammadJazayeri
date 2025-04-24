package main.ast.nodes;

import main.visitor.IVisitor;

public class AbstractDeclarator extends Node {
    private DirectAbstractDeclarator directAbstractDeclarator;

    public AbstractDeclarator() {}

    public void setDirectAbstractDeclarator(DirectAbstractDeclarator directAbstractDeclarator) {
        this.directAbstractDeclarator = directAbstractDeclarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
