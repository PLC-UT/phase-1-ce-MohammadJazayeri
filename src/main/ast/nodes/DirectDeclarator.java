package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectDeclarator extends Declarator {
    private Identifier identifier;
    private Declarator declarator;

    private DirectDeclarator directDeclarator;
    private Expression expression;
    private ParameterList parameterList;
    private IdentifierList identifierList;

    public DirectDeclarator() {}

    public void setIdentifier(String identifier) {
        Identifier id = new Identifier(identifier);
        this.identifier = id;
    }

    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
    }

    public void setDirectDeclarator(DirectDeclarator directDeclarator) {
        this.directDeclarator = directDeclarator;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public void setIdentifierList(IdentifierList identifierList) {
        this.identifierList = identifierList;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
