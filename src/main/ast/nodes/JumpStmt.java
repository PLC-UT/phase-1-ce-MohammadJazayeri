package main.ast.nodes;

import main.visitor.IVisitor;

public class JumpStmt extends Stmt {
    private String type;
    private Expression expression;
    private int line;

    public JumpStmt(String type) {
        this.type = type;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public int getLine() {
        return line;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getType() {
        return type;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
