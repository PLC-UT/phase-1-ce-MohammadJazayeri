package main.ast.nodes;

import main.visitor.IVisitor;

public class BlockItem extends Node {
    private Stmt statement;
    private Declaration dec;

    public BlockItem() {}

    public void setDec(Declaration dec) {
        this.dec = dec;
    }

    public void setStatement(Stmt statement) {
        this.statement = statement;
    }

    public Declaration getDec() {
        return this.dec;
    }

    public Stmt getStatement() {
        return this.statement;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
