package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;

public class SelectionStmt extends Stmt {
    private Expression ifExpression;
    private ArrayList<Stmt> elseIfStmt = new ArrayList<>();
    private ArrayList<Expression> elseIfExpr = new ArrayList<>();
    private Stmt ifStmt;
    private Stmt elseStmt;

    public SelectionStmt(Expression expression, Stmt ifStmt) {
        this.ifExpression = expression;
        this.ifStmt = ifStmt;
    }

    public void setElseStmt(Stmt elseStmt) {
        this.elseStmt = elseStmt;
    }

    public void addElseIf(Stmt stmt, Expression expr) {
        this.elseIfStmt.add(stmt);
        this.elseIfExpr.add(expr);
    }

    public Stmt getElseStmt() {
        return elseStmt;
    }

    public Stmt getIfStmt() {
        return ifStmt;
    }

    public ArrayList<Stmt> getElseIfStmt() {
        return elseIfStmt;
    }

    public int getElseIfSize() {
        if(elseIfStmt != null)
            return elseIfStmt.size();
        else
            return 0;
    }

    public int getElse() {
        if(elseStmt != null)
            return 1;
        else
            return 0;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
