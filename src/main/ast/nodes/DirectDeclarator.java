package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectDeclarator extends Declarator {
    private Identifier identifier;
    private Declarator declarator;
    private int line;
    private DirectDeclarator directDeclarator;
    private Expression expression;
    private ParameterList parameterList;
    private IdentifierList identifierList;


    public DirectDeclarator() {}

    public void setIdentifier(String identifier) {
        Identifier id = new Identifier(identifier);
        this.identifier = id;
    }

    public String getName() {
        return this.identifier.getName();
    }

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public int getLine() {
        return line;
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
    public DirectDeclarator getDirectDeclarator() {
        return directDeclarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
