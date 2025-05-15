package main.symbolTable.item;

import main.ast.nodes.Declaration;

public class VarDecSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "VarDec_";

    public Declaration getVarDec() {
        return varDec;
    }

    public void setVarDec(Declaration varDec) {
        this.varDec = varDec;
    }

    private Declaration varDec;
    private String name;

    private boolean dirty;
    private boolean argument;

    public VarDecSymbolTableItem(Declaration varDec, String name) {
        this.varDec = varDec;
        this.name = name;
        this.dirty = false;
        this.argument = false;
    }

    @Override
    public String getKey() {return START_KEY  + this.name;}

    public void setDirty() {
        this.dirty = true;
    }

    public void setArgument() {
        this.argument = true;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isArgument() {
        return argument;
    }

    public void clearDirty() {
        this.dirty = false;
    }

    public void setDeclaration(Declaration d) {
        this.varDec = d;
    }
}
