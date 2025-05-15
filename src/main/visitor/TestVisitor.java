package main.visitor;

import main.ast.nodes.*;

public class TestVisitor extends Visitor<Void>{
    @Override
    public Void visit(Program program) {
        program.getTranslationUnit().accept(this);
        return null;
    }

    public Void visit(TranslationUnit translationUnit) {
        for (ExternalDeclaration externalDeclaration : translationUnit.getExternalDeclarations()) {
            externalDeclaration.accept(this);
        }
        return null;
    }

    public Void visit(FunctionDefinition functionDefinition) {
        if(functionDefinition.getDeclarationSpecifiers() != null)
            functionDefinition.getDeclarationSpecifiers().accept(this);

        functionDefinition.getDeclarator().accept(this);
        int line = 0;
        String name = "";
        if (functionDefinition.getDeclarator().getDirectDeclarator() != null) {
            line = functionDefinition.getDeclarator().getDirectDeclarator().getLine();
            if(functionDefinition.getDeclarator().getDirectDeclarator().getDirectDeclarator() != null)
                name = functionDefinition.getDeclarator().getDirectDeclarator().getDirectDeclarator().getName();
            System.out.print("Line "+line +": Stmt function " + name + " = ");
        }

        if(functionDefinition.getDeclarationList() != null)
            functionDefinition.getDeclarationList().accept(this);
        int size = 0;
        if(functionDefinition.getBody() != null) {
            for (BlockItem blockItem : functionDefinition.getBody().getItems()) {
                if(blockItem.getStatement() instanceof  SelectionStmt) {
//                    size += ((SelectionStmt) blockItem.getStatement()).getElseIfSize();
//                    size += ((SelectionStmt) blockItem.getStatement()).getElse();
                    size += 0;
                }
                if(blockItem.getDec() != null && blockItem.getDec().getInitDeclaratorList() != null) {
                    size += blockItem.getDec().getInitDeclaratorList().getInitDeclaratorsSize() - 1;
                }
            }
            System.out.println((functionDefinition.getBody().getItems().size() +size) + " " + functionDefinition.numberOfArguments());
            functionDefinition.getBody().accept(this);

        }
        return null;
    }

    public Void visit(Declarator declarator) {
        declarator.getDirectDeclarator().accept(this);
        return null;
    }

    public Void visit(CompoundStmt compoundStmt) {
        int size = 0;
        for (BlockItem blockItem : compoundStmt.getItems()) {
            blockItem.accept(this);
            if(blockItem.getStatement() instanceof  SelectionStmt) {
                size += ((SelectionStmt) blockItem.getStatement()).getElseIfSize();
                size += ((SelectionStmt) blockItem.getStatement()).getElse();
            }
            if(blockItem.getDec() != null && blockItem.getDec().getInitDeclaratorList() != null) {
                size += blockItem.getDec().getInitDeclaratorList().getInitDeclaratorsSize() - 1;
            }
        }
        return null;
    }

    public Void visit(BlockItem blockItem) {
        if(blockItem.getStatement() != null)
            blockItem.getStatement().accept(this);
        if(blockItem.getDec() != null)
            blockItem.getDec().accept(this);
        return null;
    }

    public Void visit(SelectionStmt selectionStmt) {
        int ifLine = selectionStmt.getIfLine();
        String ifExpr = "";
        if(selectionStmt.getIfExpression() instanceof Constant) {
            ifExpr = ((Constant)selectionStmt.getIfExpression()).getVal();
        }
        else if(selectionStmt.getIfExpression() instanceof BinaryExpression) {
            ifExpr = ((BinaryExpression) selectionStmt.getIfExpression()).getOperator();
        }
        int ifSize = 0;
        for(BlockItem blockItem : ((CompoundStmt)selectionStmt.getIfStmt()).getItems()) {
            if(blockItem.getDec() != null) {
                ifSize += blockItem.getDec().getDecSpecs().getDeclarationSpecifierSize();
            }
                if(blockItem.getStatement() instanceof  SelectionStmt) {
                    ifSize += ((SelectionStmt) blockItem.getStatement()).getElseIfSize();
                    ifSize += ((SelectionStmt) blockItem.getStatement()).getElse();
                    ifSize += 1;
                }
                else if(blockItem.getStatement() instanceof JumpStmt ||blockItem.getStatement() instanceof IterationStmt
                        || blockItem.getStatement() instanceof ExpressionStmt)
                    ifSize += 1;
//            }
        }
        System.out.println("Line " + ifLine + ": Expr " + ifExpr);
        System.out.println("Line " + ifLine + ": Stmt selection = " + ifSize);

        for(BlockItem blockItem : ((CompoundStmt)selectionStmt.getIfStmt()).getItems())
            blockItem.accept(this);

        int elseIfLine = selectionStmt.getElseIfLine();
        String elseIfExpr = "";

        if(selectionStmt.getElseIfExpression() instanceof Constant) {
            elseIfExpr = ((Constant)selectionStmt.getElseIfExpression()).getVal();
        }
        int elseIfSize = 0;
        for (Stmt stmt : selectionStmt.getElseIfStmt()) {
            if (stmt instanceof CompoundStmt) {
                CompoundStmt c = (CompoundStmt) stmt;

                for (BlockItem blockItem : c.getItems()) {
                    if(blockItem.getDec() != null) {
                        elseIfSize += blockItem.getDec().getDecSpecs().getDeclarationSpecifierSize();
                    }
                    if(blockItem.getStatement() instanceof  SelectionStmt) {
                        elseIfSize += ((SelectionStmt) blockItem.getStatement()).getElseIfSize();
                        elseIfSize += ((SelectionStmt) blockItem.getStatement()).getElse();
                        elseIfSize += 1;
                    }
                    else if(blockItem.getStatement() instanceof JumpStmt ||blockItem.getStatement() instanceof IterationStmt
                            || blockItem.getStatement() instanceof ExpressionStmt)
                        elseIfSize += 1;
                    if(blockItem.getDec() != null && blockItem.getDec().getInitDeclaratorList() != null) {
                        elseIfSize += blockItem.getDec().getInitDeclaratorList().getInitDeclaratorsSize() - 1;
                    }
                }
                System.out.println("Line " + elseIfLine + ": Expr " + elseIfExpr);
                System.out.println("Line " + elseIfLine + ": Stmt selection = " + elseIfSize);
                stmt.accept(this);
            }
        }
        int elseLine = selectionStmt.getElseLine();
        int elseSize = 0;
        if(((CompoundStmt)selectionStmt.getElseStmt()) != null) {
            for(BlockItem blockItem : ((CompoundStmt)selectionStmt.getElseStmt()).getItems()) {
                if(blockItem.getDec() != null) {
                    elseSize += blockItem.getDec().getDecSpecs().getDeclarationSpecifierSize();
                }
                    if(blockItem.getStatement() instanceof  SelectionStmt) {
                        elseSize += ((SelectionStmt) blockItem.getStatement()).getElseIfSize();
                        elseSize += ((SelectionStmt) blockItem.getStatement()).getElse();
                        elseSize += 1;
                    }
                    else if(blockItem.getStatement() instanceof JumpStmt ||blockItem.getStatement() instanceof IterationStmt
                            || blockItem.getStatement() instanceof ExpressionStmt)
                        elseSize += 1;
//                }

            }
            System.out.println("Line " + elseLine + ": Stmt selection = " + elseSize);
            for(BlockItem blockItem : ((CompoundStmt)selectionStmt.getElseStmt()).getItems())
                blockItem.accept(this);
        }

        return null;
    }

    public Void visit(ExpressionStmt expressionStmt) {
        String val = "";
        int line = 0;
        if(expressionStmt.getExpression() != null) {
            if(expressionStmt.getExpression() instanceof BinaryExpression) {
                val = ((BinaryExpression) expressionStmt.getExpression()).getOperator();
                if(((BinaryExpression) expressionStmt.getExpression()).getFirstExpression() instanceof Identifier)
                    line = ((Identifier) ((BinaryExpression) expressionStmt.getExpression()).getFirstExpression()).getLine();
                else if(((BinaryExpression) expressionStmt.getExpression()).getFirstExpression() instanceof Constant)
                    line = ((Constant) ((BinaryExpression) expressionStmt.getExpression()).getFirstExpression()).getLine();
//                System.out.println("Line " + line + ": Expr " + val);
            }
            else if(expressionStmt.getExpression() instanceof FunctionCall) {
                line = ((FunctionCall) expressionStmt.getExpression()).getExpression().getLine();
                val = ((Identifier)((FunctionCall) expressionStmt.getExpression()).getExpression()).getName();
//                System.out.println("Line " + line + ": Expr " + val);
            }
            expressionStmt.getExpression().accept(this);
        }
        return null;
    }

    public Void visit(IterationStmt iterationStmt) {
        String loop = "for";
        String expr = "";
        if(iterationStmt.getForCondition() == null) {
            loop = "while";
            if(iterationStmt.getExpression() instanceof Constant)
                expr = ((Constant) iterationStmt.getExpression()).getVal();
            else if(iterationStmt.getExpression() instanceof BinaryExpression)
                expr = ((BinaryExpression) iterationStmt.getExpression()).getOperator();
        }
        if(iterationStmt.getStmt() != null) {
            int line = 0;
            int size = 0;
            if(iterationStmt.getStmt() instanceof CompoundStmt) {
                CompoundStmt compoundStmt = (CompoundStmt) iterationStmt.getStmt();
                for (BlockItem blockItem : compoundStmt.getItems()) {
//                    blockItem.accept(this);
                    if(blockItem.getStatement() instanceof  SelectionStmt) {
//                        size += ((SelectionStmt) blockItem.getStatement()).getElseIfSize();
//                        size += ((SelectionStmt) blockItem.getStatement()).getElse();
                        size += 0;
                    }
//                    if(blockItem.getDec() != null && blockItem.getDec().getInitDeclaratorList() != null) {
//                        size += blockItem.getDec().getInitDeclaratorList().getInitDeclaratorsSize() - 1;
//                    }
                }
                size += compoundStmt.getItems().size();
            }
            line = iterationStmt.getLine();
            if(loop == "while")
                System.out.println("Line " + line + ": Expr " + expr);
            System.out.println("Line " + line + ": Stmt "+ loop + " = " + size);
            iterationStmt.getStmt().accept(this);
        }
        return null;
    }

    private int handleList(ListOfExpressions listOfExpressions) {
        int depth = 0;
        if(listOfExpressions.getIdentifier() != null) {
            listOfExpressions.getIdentifier().accept(this);
            depth = listOfExpressions.getPrefixOperatorsSize();
        }

        if(listOfExpressions.getExpression() != null) {
            depth += listOfExpressions.getPrefixOperatorsSize();
            if(listOfExpressions.getExpression() instanceof UnaryExpression)
                depth += calcDepth1((UnaryExpression) listOfExpressions.getExpression());
            else if(listOfExpressions.getExpression() instanceof BinaryExpression)
                depth += calcDepth((BinaryExpression) listOfExpressions.getExpression());
            else if(listOfExpressions.getExpression() instanceof Identifier)
                listOfExpressions.getExpression().accept(this);
        }
        return depth;
    }

    private int calcDepth(BinaryExpression expr) {
        int leftDepth = 0;
        int rightDepth = 0;

        if (expr.getFirstExpression() != null) {
            if(expr.getFirstExpression() instanceof Identifier || expr.getFirstExpression() instanceof Constant)
                leftDepth += 0;
            else if(expr.getFirstExpression() instanceof UnaryExpression)
                leftDepth = calcDepth1((UnaryExpression) expr.getFirstExpression());
            else if(expr.getFirstExpression() instanceof ListOfExpressions)
                leftDepth = handleList((ListOfExpressions) expr.getFirstExpression());
            else
                leftDepth = calcDepth((BinaryExpression) expr.getFirstExpression());
        }

        if (expr.getSecondExpression() != null) {
            if(expr.getSecondExpression() instanceof Identifier || expr.getSecondExpression() instanceof Constant)
                rightDepth += 0;
            else if(expr.getSecondExpression() instanceof UnaryExpression)
                rightDepth = calcDepth1((UnaryExpression) expr.getSecondExpression());
            else if(expr.getSecondExpression() instanceof ListOfExpressions)
                rightDepth = handleList((ListOfExpressions) expr.getSecondExpression());
            else
                rightDepth = calcDepth((BinaryExpression) expr.getSecondExpression());
        }

        return 1 + Math.max(leftDepth, rightDepth);
    }

    public Void visit(BinaryExpression binaryExpression) {
//        int max = calcDepth(binaryExpression);
//        System.out.println("maximum depth is: "+ max);
        binaryExpression.getFirstExpression().accept(this);
        binaryExpression.getSecondExpression().accept(this);
        return null;
    }

    private int calcDepth1(UnaryExpression expr) {
        int innerDepth = 0;

        if (expr.getExpression() != null) {
            if(expr.getExpression() instanceof Identifier || expr.getExpression() instanceof Constant)
                innerDepth += 0;
            else if(expr.getExpression() instanceof BinaryExpression)
                innerDepth = calcDepth((BinaryExpression) expr.getExpression());
            else
                innerDepth = calcDepth1((UnaryExpression) expr.getExpression());
        }

        return 1 + innerDepth;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
//        int max = calcDepth1(unaryExpression);
//        System.out.println("U maximum depth is: "+ max);
        unaryExpression.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
//        System.out.println("I maximum depth is: "+ 0);
        return null;
    }

    public Void visit(Declaration declaration) {
        if(declaration.getInitDeclaratorList() != null)
            declaration.getInitDeclaratorList().accept(this);
        if(declaration.getDecSpecs() != null)
            declaration.getDecSpecs().accept(this);
        return null;
    }

    public Void visit(InitDeclaratorList initDeclaratorList) {
        if(initDeclaratorList.getInitDeclarators() != null) {
            for(InitDeclarator initDeclarator: initDeclaratorList.getInitDeclarators())
                initDeclarator.accept(this);
        }
        return null;
    }

    public Void visit(InitDeclarator initDeclarator) {
        if(initDeclarator.getDeclarator() != null)
            initDeclarator.getDeclarator().accept(this);
        if(initDeclarator.getInitializer() != null)
            initDeclarator.getInitializer().accept(this);
        return null;
    }

    public Void visit(DirectDeclarator directDeclarator) {
        if(directDeclarator.getIdentifier() != null)
            directDeclarator.getIdentifier().accept(this);
        return null;
    }

    public Void visit(Initializer initializer) {
        if(initializer.getExpression() != null) {
            int line = 0;
            String val = "";
            if(initializer.getExpression() instanceof Constant) {
                line = ((Constant) initializer.getExpression()).getLine();
                val = ((Constant) initializer.getExpression()).getVal();
            }
            else if(initializer.getExpression() instanceof BinaryExpression) {
                line = ((BinaryExpression) initializer.getExpression()).getLine();
                val = ((BinaryExpression) initializer.getExpression()).getOperator();
            }
            else if(initializer.getExpression() instanceof UnaryExpression) {
                line = ((UnaryExpression) initializer.getExpression()).getLine();
                val = ((UnaryExpression) initializer.getExpression()).getOperator();
            }
            else if(initializer.getExpression() instanceof ArgumentExpressionList) {
                if(((ArgumentExpressionList)initializer.getExpression()).getExpressions().size() > 1) {
                    line = ((ArgumentExpressionList)initializer.getExpression()).getExpressions().get(0).getLine();
                    val = ",";
                }
            }
            else if(initializer.getExpression() instanceof FunctionCall) {
                line = ((FunctionCall) initializer.getExpression()).getExpression().getLine();
                val = ((Identifier)((FunctionCall) initializer.getExpression()).getExpression()).getName();
            }
            System.out.println("Line " + line +": Expr " + val);
            initializer.getExpression().accept(this);
        }
        return null;
    }

    public Void visit(ListOfExpressions listOfExpressions) {
        if(listOfExpressions.getExpression() != null)
            listOfExpressions.getExpression().accept(this);
        if(listOfExpressions.getIdentifier() != null)
            listOfExpressions.getIdentifier().accept(this);
        return null;
    }

    @Override
    public Void visit(JumpStmt jumpStmt) {
        int line = jumpStmt.getLine();
        String expr = "";
        if(jumpStmt.getExpression() instanceof Constant)
            expr = ((Constant) jumpStmt.getExpression()).getVal();
        else if(jumpStmt.getExpression() instanceof Identifier)
            expr = ((Identifier) jumpStmt.getExpression()).getName();
//        System.out.println("Line " + line + ": Expr " + expr);
        return null;
    }

    public Void visit(ArgumentExpressionList argumentExpressionList) {
        for(Expression expr : argumentExpressionList.getExpressions()) {
            expr.accept(this);
        }
        return null;
    }
}
