package main.ast.nodes.declaration;

import main.visitor.IVisitor;
import main.ast.nodes.Node;

public abstract class TypeSpecifier extends Node{

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
