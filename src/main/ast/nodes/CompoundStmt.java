package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class CompoundStmt extends Stmt{

    private ArrayList <BlockItem> items = new ArrayList<>();

    public CompoundStmt() {}

    public void addItem(BlockItem item) {
        this.items.add(item);
    }

    public ArrayList<BlockItem> getItems() {
        return this.items;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
