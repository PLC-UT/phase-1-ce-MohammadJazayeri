package main.ast.nodes;

import main.visitor.IVisitor;

public class Declaration extends ExternalDeclaration {
    private DeclarationSpecifiers DecSpecs;
    private InitDeclaratorList initDeclaratorList;

    private String type;

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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
