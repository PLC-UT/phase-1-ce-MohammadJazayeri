package main.ast.nodes;

import main.visitor.IVisitor;

public class Declarator extends Node{
    private DirectDeclarator directDeclarator;
    private int line;

    public Declarator() {}

    public void setDirectDeclarator(DirectDeclarator directDeclarator) {
        this.directDeclarator = directDeclarator;
    }

    public DirectDeclarator getDirectDeclarator() {
        return directDeclarator;
    }

    public String getName() {return this.directDeclarator.getName();}

    public int getNumOfArgs() {
        return this.directDeclarator.getNumOfArgs();
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
        return null;
    }
}
