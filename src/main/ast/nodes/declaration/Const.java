package main.ast.nodes.declaration;

import main.visitor.IVisitor;

public class Const extends DeclarationSpecifier{

    private String const_;
    public Const(String _const) {
        this.const_ = _const.substring(1, _const.length() - 1);
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
