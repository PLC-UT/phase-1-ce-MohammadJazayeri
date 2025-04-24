package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;
import java.util.ArrayList;
public class DeclarationSpecifiers extends Node{
    private ArrayList<DeclarationSpecifier> declarationSpecifier;

    public DeclarationSpecifiers(DeclarationSpecifier declarationSpecifier) {
        this.declarationSpecifier.add(declarationSpecifier);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
