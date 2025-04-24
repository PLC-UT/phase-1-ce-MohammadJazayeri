package main.ast.nodes;

public enum UnaryOperator {
    POST_INC("++"),
    POST_DEC("--"),
    PRE_INC("++"),
    PRE_DEC("--"),
    PLUS("+"),
    MINUS("-"),
    TILDE("~"),
    NOT("!"),
    STAR("*"),
    AND("&"),
    SIZEOF("sizeof");

    private final String symbol;

    UnaryOperator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

