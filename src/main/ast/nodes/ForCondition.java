package main.ast.nodes;

import main.visitor.IVisitor;

public class ForCondition extends Node {
    private ForDeclaration forDeclaration;
    private Expression expression;
    private ForExpression forExpression1;
    private ForExpression forExpression2;

    public ForCondition() {}

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setForDeclaration(ForDeclaration forDeclaration) {
        this.forDeclaration = forDeclaration;
    }

    public void setForExpression1(ForExpression forExpression1) {
        this.forExpression1 = forExpression1;
    }

    public void setForExpression2(ForExpression forExpression2) {
        this.forExpression2 = forExpression2;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
