package main.ast.nodes;

import main.visitor.IVisitor;

public class JumpStmt extends Stmt {
    private String type;
    private Expression expression;

    public JumpStmt(String type) {
        this.type = type;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
