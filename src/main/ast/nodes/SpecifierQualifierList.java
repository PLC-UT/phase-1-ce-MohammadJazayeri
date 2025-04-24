package main.ast.nodes;

import main.visitor.IVisitor;

public class SpecifierQualifierList extends Node{
    private TypeSpecifier typeSpecifier;
    private SpecifierQualifierList specifierQualifierList;

    public SpecifierQualifierList() {}

    public void setSpecifierQualifierList(SpecifierQualifierList specifierQualifierList) {
        this.specifierQualifierList = specifierQualifierList;
    }

    public void setTypeSpecifier(TypeSpecifier typeSpecifier) {
        this.typeSpecifier = typeSpecifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
