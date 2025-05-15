package main.ast.nodes;

import main.symbolTable.SymbolTable;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarDecSymbolTableItem;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class FunctionDefinition extends ExternalDeclaration {
    private DeclarationSpecifiers declarationSpecifiers;
    private Declarator declarator;
    private DeclarationList declarationList;
    private CompoundStmt body;
    private int line;
    private String name;
    private int numOfArgs;
    private SymbolTable symbolTable;
    private ArrayList <Integer> arguments = new ArrayList<>();
    public FunctionDefinition() {}

    public void setDeclarationSpecifiers(DeclarationSpecifiers declarationSpecifiers) {
        this.declarationSpecifiers = declarationSpecifiers;
    }

    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
        this.line = declarator.getLine();
    }

    public void setBody(CompoundStmt body) {
        this.body = body;
    }

    public void setDeclarationList(DeclarationList declarationList) {
        this.declarationList = declarationList;
    }

    public CompoundStmt getBody() {
        return body;
    }

    public DeclarationList getDeclarationList() {
        return declarationList;
    }

    public Declarator getDeclarator() {
        return declarator;
    }

    public DeclarationSpecifiers getDeclarationSpecifiers() {
        return declarationSpecifiers;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfArgs() {
        this.numOfArgs = this.declarator.getNumOfArgs();
    }

    public int getNumOfArgs() {
        return numOfArgs;
    }

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    public void findArguments() {
        int i = 0;
        for(SymbolTableItem s: this.symbolTable.getItemsOnly()) {
            if (s instanceof VarDecSymbolTableItem) {
                VarDecSymbolTableItem varItem = (VarDecSymbolTableItem) s;
                if(varItem.isArgument() && !varItem.isDirty())
                    this.arguments.add(this.symbolTable.countVarDecItems() - i - 1);
            }
            i = i + 1;
        }
    }

    public int numberOfArguments() {
        int i = 0;
        for(SymbolTableItem s: this.symbolTable.getItemsOnly()) {
            if (s instanceof VarDecSymbolTableItem) {
                VarDecSymbolTableItem varItem = (VarDecSymbolTableItem) s;
                if(varItem.isArgument() && varItem.isDirty())
                    i++;
            }
        }
        return i;
    }

    public ArrayList<Integer> getArguments() {
        return arguments;
    }

    public void clearArgs() {
        this.numOfArgs -= this.arguments.size();
        this.arguments.clear();
    }

    public boolean pruneUnusedVariables() {
        boolean removedAny = false;
        Iterator<Map.Entry<String, SymbolTableItem>> it =
                symbolTable.items.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, SymbolTableItem> entry = it.next();
            if (entry.getValue() instanceof VarDecSymbolTableItem) {
                VarDecSymbolTableItem varItem = (VarDecSymbolTableItem) entry.getValue();
                if (!varItem.isDirty()) {
                    it.remove();
                    removedAny = true;
                }
            }
        }
        return removedAny;
    }

    public void deleteUnusedVariables() {
        boolean removedAny = false;
        Iterator<Map.Entry<String, SymbolTableItem>> it =
                symbolTable.items.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, SymbolTableItem> entry = it.next();
            if (entry.getValue() instanceof VarDecSymbolTableItem) {
                VarDecSymbolTableItem varItem = (VarDecSymbolTableItem) entry.getValue();
                if (!varItem.isDirty() && !varItem.isArgument()) {
                    findDec(varItem.getVarDec());
                    it.remove();
                    removedAny = true;
                }
            }
        }
    }

    public boolean allVariablesUsed() {
        for (SymbolTableItem item : symbolTable.getItemsOnly()) {
            if (item instanceof VarDecSymbolTableItem) {
                if (!((VarDecSymbolTableItem) item).isDirty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void resetDirtyFlags() {
        for (SymbolTableItem item : symbolTable.getItemsOnly()) {
            if (item instanceof VarDecSymbolTableItem) {
                ((VarDecSymbolTableItem) item).clearDirty();
            }
        }
    }

    private void findDec(Declaration d) {
        ListIterator<BlockItem> it = this.body.getItems().listIterator();
        while (it.hasNext()) {
            BlockItem b = it.next();
            if (b.getDec() != null && b.getDec() == d) {
                it.remove();
            }
        }
    }


    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
