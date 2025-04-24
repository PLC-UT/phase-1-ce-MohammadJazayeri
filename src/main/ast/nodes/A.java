package main.ast.nodes;

import main.visitor.IVisitor;

public class A extends Expression {
    private TypeName typeName;
    private InitializerList initializerList;

    public A(TypeName typeName, InitializerList initializerList) {
        this.initializerList = initializerList;
        this.typeName = typeName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
