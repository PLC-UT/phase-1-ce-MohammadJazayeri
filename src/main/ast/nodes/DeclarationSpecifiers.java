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

    public TypeSpecifier getType() {
        return (TypeSpecifier) this.declarationSpecifier.get(0);
    }

    public String getDecType() {
        return ((TypeSpecifier)this.declarationSpecifier.get(0)).getVal();
    }

    public String getDecName() {
        if(((TypeSpecifier)this.declarationSpecifier.get(1)).getIdentifier() != null)
            return ((TypeSpecifier)this.declarationSpecifier.get(1)).getIdentifier().getName();
        return "";
    }

    public ArrayList<DeclarationSpecifier> getDeclarationSpecifier() {
        return declarationSpecifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
