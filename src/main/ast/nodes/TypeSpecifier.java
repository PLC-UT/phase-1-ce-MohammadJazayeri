package main.ast.nodes;

import main.visitor.IVisitor;

public class TypeSpecifier extends DeclarationSpecifier {
    private String val;
    private Identifier identifier;

    public TypeSpecifier(String val) {
        this.val = val;
    }

    public TypeSpecifier(Identifier ID) {
        this.identifier = ID;
    }

    public String getVal() {
        return this.val;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
