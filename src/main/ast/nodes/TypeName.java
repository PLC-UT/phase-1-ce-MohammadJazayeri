package main.ast.nodes;

import main.visitor.IVisitor;

public class TypeName extends Expression{
    private SpecifierQualifierList specifierQualifierList;
    private AbstractDeclarator abstractDeclarator;

    public TypeName(SpecifierQualifierList specifierQualifierList) {
        this.specifierQualifierList = specifierQualifierList;
    }

    public void setAbstractDeclarator(AbstractDeclarator abstractDeclarator) {
        this.abstractDeclarator = abstractDeclarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
