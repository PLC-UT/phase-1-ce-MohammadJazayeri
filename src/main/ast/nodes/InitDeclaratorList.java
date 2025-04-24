package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;
public class InitDeclaratorList extends Node{
    private ArrayList<InitDeclarator> initDeclarators = new ArrayList<>();

    public InitDeclaratorList() {}

    public void addInitDeclarators(InitDeclarator initDeclarators) {
        this.initDeclarators.add(initDeclarators);
    }

    public int getInitDeclaratorsSize() {
        return this.initDeclarators.size();
    }

    public ArrayList<InitDeclarator> getInitDeclarators() {
        return initDeclarators;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
