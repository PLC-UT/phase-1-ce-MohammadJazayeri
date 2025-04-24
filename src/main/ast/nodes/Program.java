package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;

public class Program extends Node{
    private TranslationUnit translationUnit;

    public Program() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public TranslationUnit getTranslationUnit() {
        return translationUnit;
    }

    public void setTranslationUnit(TranslationUnit translationUnit) {
        this.translationUnit = translationUnit;
    }

}
