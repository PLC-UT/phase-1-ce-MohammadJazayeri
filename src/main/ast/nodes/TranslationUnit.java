package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class TranslationUnit extends Node {
    private ArrayList<ExternalDeclaration> externalDeclarations = new ArrayList<>();

    public TranslationUnit() {}
//    public TranslationUnit(ExternalDeclaration externalDeclaration) {
//        externalDeclarations.add(externalDeclaration);
//    }

    public ArrayList<ExternalDeclaration> getExternalDeclarations() {
        return externalDeclarations;
    }

    public void setExternalDeclarations(ArrayList<ExternalDeclaration> externalDeclarations) {
        this.externalDeclarations = externalDeclarations;
    }

    public void addExternalDeclaration (ExternalDeclaration e) { externalDeclarations.add(e);}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
