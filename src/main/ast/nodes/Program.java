package main.ast.nodes;

import main.symbolTable.SymbolTable;
import main.symbolTable.item.FuncDecSymbolTableItem;
import main.symbolTable.item.SymbolTableItem;
import main.visitor.IVisitor;
import java.util.ArrayList;

public class Program extends Node{
    private TranslationUnit translationUnit;
    private SymbolTable symbolTable;

    public Program() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public TranslationUnit getTranslationUnit() {
        return translationUnit;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void setTranslationUnit(TranslationUnit translationUnit) {
        this.translationUnit = translationUnit;
    }

    public boolean allFunctionsHaveNoDeadVars() {
        for (SymbolTableItem item : symbolTable.getItemsOnly()) {
            if (item instanceof FuncDecSymbolTableItem) {
                FunctionDefinition fn = ((FuncDecSymbolTableItem) item).getFuncDec();
                if (!fn.allVariablesUsed()) {
                    return false;
                }
            }
        }
        return true;
    }

}
