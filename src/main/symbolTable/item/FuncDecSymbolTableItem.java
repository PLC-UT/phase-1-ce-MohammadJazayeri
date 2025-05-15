package main.symbolTable.item;

import main.ast.nodes.FunctionDefinition;

public class FuncDecSymbolTableItem extends SymbolTableItem{
    public static final String START_KEY = "FuncDec_";

    public FunctionDefinition getFuncDec() {
        return funcDec;
    }

    public void setFuncDec(FunctionDefinition funcDec) {
        this.funcDec = funcDec;
    }

    private FunctionDefinition funcDec;

    public FuncDecSymbolTableItem(FunctionDefinition funcDec) {
        this.funcDec = funcDec;
    }

    @Override
    public String getKey() {
        return START_KEY + funcDec.getName() + funcDec.getNumOfArgs();
    }
}
