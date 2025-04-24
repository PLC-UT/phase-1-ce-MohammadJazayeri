package main.ast.nodes.declaration;

import main.visitor.IVisitor;

public class FunctionDefinition extends ExternalDeclaration{
    private DeclarationSpecifiers declarationSpecifiers;
    private Declarator declarator;
    private DeclarationList declarationList;
    private CompoundStatement compoundStatement;
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
