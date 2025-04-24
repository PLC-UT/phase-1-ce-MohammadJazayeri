package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectAbstractDeclarator extends Node {
    private Expression expression;
    private AbstractDeclarator abstractDeclarator;
    private ParameterList parameterList;
    private DirectAbstractDeclarator directAbstractDeclarator;

    public DirectAbstractDeclarator() {}

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setAbstractDeclarator(AbstractDeclarator abstractDeclarator) {
        this.abstractDeclarator = abstractDeclarator;
    }

    public void setDirectAbstractDeclarator(DirectAbstractDeclarator directAbstractDeclarator) {
        this.directAbstractDeclarator = directAbstractDeclarator;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
