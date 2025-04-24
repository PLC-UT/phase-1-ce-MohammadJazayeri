package main.ast.nodes;

import main.visitor.IVisitor;

public class Declaration extends ExternalDeclaration {
    private DeclarationSpecifiers DecSpecs;
    private InitDeclaratorList initDeclaratorList;

    public Declaration() {}

    public void setDecSpecs(DeclarationSpecifiers decSpecs) {
        DecSpecs = decSpecs;
    }

    public void setInitDeclaratorList(InitDeclaratorList initDeclaratorList) {
        this.initDeclaratorList = initDeclaratorList;
    }

    public DeclarationSpecifiers getDecSpecs() {
        return DecSpecs;
    }

    public InitDeclaratorList getInitDeclaratorList() {
        return initDeclaratorList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
