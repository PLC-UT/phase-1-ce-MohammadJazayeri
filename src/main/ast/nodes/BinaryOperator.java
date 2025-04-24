package main.ast.nodes;

public enum BinaryOperator {
    PLUS("+"),
    MINUS("-"),
    MULT("*"),
    DIVIDE("/"),
    MOD("%"),
    LSHIFT("<<"),
    RSHIFT(">>"),
    LESS("<"),
    GREATER(">"),
    LESSEQUAL("<="),
    GREATEREQUAL(">="),
    EQUAL("=="),
    NOTEQUAL("!="),
    AND("&"),
    XOR("^"),
    OR("|"),
    OROR("||"),
    ANDAND("&&"),
    ASSIGN("=");

    private final String symbol;

    BinaryOperator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
