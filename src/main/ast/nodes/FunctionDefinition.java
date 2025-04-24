package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class FunctionDefinition extends ExternalDeclaration {
    private DeclarationSpecifiers declarationSpecifiers;
    private Declarator declarator;
    private DeclarationList declarationList;
    private CompoundStmt body;
    private int line;
    public FunctionDefinition() {}

    public void setDeclarationSpecifiers(DeclarationSpecifiers declarationSpecifiers) {
        this.declarationSpecifiers = declarationSpecifiers;
    }

    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
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

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
