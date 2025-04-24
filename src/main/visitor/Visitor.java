package main.visitor;

import main.ast.nodes.*;

public abstract class Visitor<T> implements IVisitor<T> {
    @Override
    public T visit(Program program) {
        return null;
    }
    public T visit(TranslationUnit translationUnit) {return null;}
    public T visit(ExternalDeclaration externalDeclaration) {return null;}
    public T visit(FunctionDefinition functionDefinition) {return null;}
    public T visit(Declaration declaration) {return null;}
    public T visit(DeclarationSpecifiers declarationSpecifiers) {return null;}
    public T visit(DeclarationList declarationList) {return null;}
    public T visit(CompoundStmt compoundStmt) {return null;}
    public T visit(Identifier identifier) {return null;}
    public T visit(Constant constant) {return null;}
    public T visit(InitializerList initializerList) {return null;}
    public T visit(TypeName typeName) {return null;}
    public T visit(ArgumentExpressionList argumentExpressionList) {return null;}
    public T visit(CastExpression castExpression) {return null;}
    public T visit(TernaryExpression ternaryExpression) {return null;}
    public T visit(TypeSpecifier typeSpecifier) {return null;}
    public T visit(InitDeclaratorList initDeclaratorList) {return null;}
    public T visit(InitDeclarator initDeclarator) {return null;}
    public T visit(Initializer initializer) {return null;}
    public T visit(SpecifierQualifierList specifierQualifierList) {return null;}
    public T visit(DirectDeclarator directDeclarator) {return null;}
    public T visit(ParameterList parameterList) {return null;}
    public T visit(IdentifierList identifierList) {return null;}
    public T visit(ParameterDeclaration parameterDeclaration) {return null;}
    public T visit(AbstractDeclarator abstractDeclarator) {return null;}
    public T visit(DirectAbstractDeclarator directAbstractDeclarator) {return null;}
    public T visit(Designation designation) {return null;}
    public T visit(Designator designator) {return null;}
    public T visit(ExpressionStmt expressionStmt) {return null;}
    public T visit(SelectionStmt selectionStmt) {return null;}
    public T visit(IterationStmt iterationStmt) {return null;}
    public T visit(JumpStmt jumpStmt) {return null;}
    public T visit(BlockItem blockItem) {return null;}
    public T visit(ForCondition forCondition) {return null;}
    public T visit(ForDeclaration forDeclaration) {return null;}
    public T visit(ForExpression forExpression) {return null;}
    public T visit(BinaryExpression binaryExpression) {return null;}
    public T visit(Casting casting) {return null;}
    public T visit(A a) {
        return null;
    }
    public T visit(ArrayAccess arrayAccess) {
        return null;
    }
    public T visit(FunctionCall functionCall) { return null; }
    public T visit(ListOfExpressions listOfExpressions) {
        return null;
    }
    public T visit(UnaryExpression unaryExpression) {
        return null;
    }
}

