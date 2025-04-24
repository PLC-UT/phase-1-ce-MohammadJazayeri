package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;
public class DeclarationList extends Node{

    private ArrayList<Declaration> declaration;

    public DeclarationList() {}

    public void addDeclaration(Declaration declaration) {
        this.declaration.add(declaration);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
