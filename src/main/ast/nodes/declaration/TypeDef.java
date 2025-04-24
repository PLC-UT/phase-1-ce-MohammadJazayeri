package main.ast.nodes.declaration;

import main.visitor.IVisitor;

public class TypeDef extends DeclarationSpecifier{
    private String typeDef;
    public TypeDef(String typeDef) {
        this.typeDef = typeDef.substring(1, typeDef.length() - 1);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
