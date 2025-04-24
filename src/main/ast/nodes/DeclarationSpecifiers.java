package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class DeclarationSpecifiers extends Node {
    private ArrayList<DeclarationSpecifier>  declarationSpecifier = new ArrayList<>();

    public DeclarationSpecifiers() {}

    public void addDecSpecifier(DeclarationSpecifier declarationSpecifier_) {
        this.declarationSpecifier.add(declarationSpecifier_);
    }

    public int getDeclarationSpecifierSize() {
        return this.declarationSpecifier.size()/2;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
