package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class ListOfExpressions extends Expression {
    private ArrayList<String> prefixOperators = new ArrayList<>();
    private TypeName typeName;
    private Expression expression;
    private InitializerList initializerList;
    private UnaryOperator unaryOperator;
    private CastExpression castExpression;
    private Identifier identifier;
    private Constant constant;
    private String sizeof;

    public ListOfExpressions() {}

    public void setCastExpression(CastExpression castExpression) {
        this.castExpression = castExpression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    public void setInitializerList(InitializerList initializerList) {
        this.initializerList = initializerList;
    }

    public void setUnaryOperator(UnaryOperator unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    public void addPrefixOperators(String prefixOperator) {
        this.prefixOperators.add(prefixOperator);
    }

    public void setIdentifier(String identifier) {
        Identifier id = new Identifier(identifier);
        this.identifier = id;
    }

    public void setConstant(String constant) {
        Constant C = new Constant(constant);
        this.constant = C;
    }

    public void setSizeof(String sizeof) {
        this.sizeof = sizeof;
    }

    public Expression getExpression() {
        return expression;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public int getPrefixOperatorsSize() {
        return this.prefixOperators.size();
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
