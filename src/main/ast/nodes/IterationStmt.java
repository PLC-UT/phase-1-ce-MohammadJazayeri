package main.ast.nodes;

import main.visitor.IVisitor;

public class IterationStmt extends Stmt {
    private Expression expression;
    private Stmt stmt;
    private ForCondition forCondition;
    private int line;

    public IterationStmt() {}

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setForCondition(ForCondition forCondition) {
        this.forCondition = forCondition;
    }

    public void setStmt(Stmt stmt) {
        this.stmt = stmt;
    }

    public Stmt getStmt() {
        return stmt;
    }

    public ForCondition getForCondition() {
        return forCondition;
    }

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
