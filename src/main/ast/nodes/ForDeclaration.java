package main.ast.nodes;

import main.visitor.IVisitor;

public class ForDeclaration extends Declaration {
    private DeclarationSpecifiers declarationSpecifiers;
    private InitDeclaratorList initDeclaratorList;

    public ForDeclaration(DeclarationSpecifiers declarationSpecifiers) {
        this.declarationSpecifiers = declarationSpecifiers;
    }

    public void setInitDeclaratorList(InitDeclaratorList initDeclaratorList) {
        this.initDeclaratorList = initDeclaratorList;
    }

    public DeclarationSpecifiers getDeclarationSpecifiers() {
        return declarationSpecifiers;
    }

    public InitDeclaratorList getInitDeclaratorList() {
        return initDeclaratorList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
