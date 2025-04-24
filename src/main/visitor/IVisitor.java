package main.visitor;

import main.ast.nodes.*;

import java.util.ArrayList;

public interface IVisitor<T> {
    T visit(Program program);
    T visit(TranslationUnit translationUnit);
    T visit(ExternalDeclaration externalDeclaration);
    T visit(FunctionDefinition functionDefinition);
    T visit(Declaration declaration);
    T visit(DeclarationSpecifiers declarationSpecifiers);
    T visit(DeclarationList declarationList);
    T visit(CompoundStmt compoundStmt);
    T visit(Identifier identifier);
    T visit(Constant constant);
    T visit(InitializerList initializerList);
    T visit(TypeName typeName);
    T visit(ArgumentExpressionList argumentExpressionList);
    T visit(CastExpression castExpression);
    T visit(TernaryExpression ternaryExpression);
    T visit(TypeSpecifier typeSpecifier);
    T visit(InitDeclaratorList initDeclaratorList);
    T visit(InitDeclarator initDeclarator);
    T visit(Initializer initializer);
    T visit(SpecifierQualifierList specifierQualifierList);
    T visit(DirectDeclarator directDeclarator);
    T visit(ParameterList parameterList);
    T visit(IdentifierList identifierList);
    T visit(ParameterDeclaration parameterDeclaration);
    T visit(AbstractDeclarator abstractDeclarator);
    T visit(DirectAbstractDeclarator directAbstractDeclarator);
    T visit(Designation designation);
    T visit(Designator designator);
    T visit(ExpressionStmt expressionStmt);
    T visit(SelectionStmt selectionStmt);
    T visit(IterationStmt iterationStmt);
    T visit(JumpStmt jumpStmt);
    T visit(BlockItem blockItem);
    T visit(ForCondition forCondition);
    T visit(ForDeclaration forDeclaration);
    T visit(ForExpression forExpression);
    T visit(BinaryExpression binaryExpression);
    T visit(Casting casting);
    T visit(A a);
    T visit(ArrayAccess arrayAccess);
    T visit(FunctionCall functionCall);
    T visit(ListOfExpressions listOfExpressions);
    T visit(UnaryExpression unaryExpression);
}

