package main.ast.nodes;

import main.visitor.IVisitor;

public class ParameterDeclaration extends Node {
    private DeclarationSpecifiers declarationSpecifiers;
    private Declarator declarator;
    private AbstractDeclarator abstractDeclarator;

    public ParameterDeclaration(DeclarationSpecifiers declarationSpecifiers){
        this.declarationSpecifiers = declarationSpecifiers;
    }

    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
    }

    public void setAbstractDeclarator(AbstractDeclarator abstractDeclarator) {
        this.abstractDeclarator = abstractDeclarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
