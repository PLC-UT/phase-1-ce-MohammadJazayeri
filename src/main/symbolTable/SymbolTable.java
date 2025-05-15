package main.symbolTable;


import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarDecSymbolTableItem;

import java.util.*;


public class SymbolTable {
    List<String> commonCFunctions = Arrays.asList(
            "printf",
            "scanf",
            "malloc",
            "free",
            "strlen",
            "strcpy",
            "strncpy",
            "strcmp",
            "strcat",
            "strncat",
            "memcpy",
            "memset",
            "fopen",
            "fclose",
            "fread",
            "fwrite",
            "fgets",
            "fputs",
            "getc",
            "putc",
            "getchar",
            "putchar",
            "exit",
            "atoi",
            "atof",
            "abs",
            "time",
            "rand",
            "srand",
            "perror",
            "system"
    );

    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }

    public static void pop() {
        top = stack.pop();
    }

    public SymbolTable pre;
    public Map<String, SymbolTableItem> items;

    public List<SymbolTableItem> getItemsOnly() {
        return new ArrayList<>(items.values());
    }


    public SymbolTable() {
        this(null);
    }

    public SymbolTable(SymbolTable pre) {
        this.pre = pre;
        this.items = new HashMap<>();
    }

    public static Stack<SymbolTable> getStack() {
        return stack;
    }

    public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExistsException();
        items.put(item.getKey(), item);
    }

    public SymbolTableItem getItem(String key) throws ItemNotFoundException {
        SymbolTable currentSymbolTable = this;
        while(currentSymbolTable != null) {
            SymbolTableItem symbolTableItem = currentSymbolTable.items.get(key);
            if( symbolTableItem != null ){
                if(symbolTableItem instanceof VarDecSymbolTableItem)
                    ((VarDecSymbolTableItem) symbolTableItem).setDirty();
                return symbolTableItem;
            }
            currentSymbolTable = currentSymbolTable.pre;
        }

        if (key.startsWith("FuncDec_")) {
            String stripped = key.substring("FuncDec_".length());
            String funcName = stripped.replaceAll("\\d+$", "");  // remove trailing digits

            if (commonCFunctions.contains(funcName)) {
                return null;
            }
        }


        throw new ItemNotFoundException();
    }

    public int getItemsSize() {
        return this.items.size();
    }

    public int countVarDecItems() {
        int count = 0;
        for (SymbolTableItem item : items.values()) {
            if (item instanceof VarDecSymbolTableItem) {
                VarDecSymbolTableItem varItem = (VarDecSymbolTableItem) item;
                if (varItem.isArgument()) {
                    count++;
                }
            }
        }
        return count;
    }
}
