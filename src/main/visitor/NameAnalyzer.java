package main.visitor;

import main.ast.nodes.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.item.FuncDecSymbolTableItem;
import main.symbolTable.item.VarDecSymbolTableItem;
import org.antlr.v4.runtime.atn.PredicateTransition;

import java.util.*;

public class NameAnalyzer extends Visitor<Void>{

    @Override
    public Void visit(Program program) {
        SymbolTable.top = new SymbolTable();
        SymbolTable.root = SymbolTable.top;

        program.setSymbolTable(SymbolTable.top);
        program.getTranslationUnit().accept(this);

        return null;
    }

    @Override
    public Void visit(TranslationUnit translationUnit) {
        for (ExternalDeclaration externalDeclaration : translationUnit.getExternalDeclarations()) {
            externalDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {

        int line = 0;
        if (functionDefinition.getDeclarator().getDirectDeclarator() != null)
            line = functionDefinition.getDeclarator().getDirectDeclarator().getLine();

        FuncDecSymbolTableItem func_dec_item = new FuncDecSymbolTableItem(functionDefinition);
        try {
            SymbolTable.top.put(func_dec_item);
        } catch (ItemAlreadyExistsException e) {
            System.out.println("Redefinition of function \"" + functionDefinition.getName() +"\" in line " + line);
        }


        SymbolTable func_dec_symbol_table = new SymbolTable(SymbolTable.top);
        functionDefinition.setSymbolTable(func_dec_symbol_table);
        SymbolTable.push(func_dec_symbol_table);


        if(functionDefinition.getDeclarationSpecifiers() != null)
            functionDefinition.getDeclarationSpecifiers().accept(this);

        functionDefinition.getDeclarator().accept(this);
        String name = "";
        if(functionDefinition.getDeclarator().getDirectDeclarator().getParameterList() != null)
            for(ParameterDeclaration p : functionDefinition.getDeclarator().getDirectDeclarator().getParameterList().getParameterDeclarations()) {
                if(p.getDeclarationSpecifiers() != null) {
                    name = p.getDeclarationSpecifiers().getDecName();
                    VarDecSymbolTableItem var_dec_item = new VarDecSymbolTableItem(p, name);
                    var_dec_item.setArgument();
                    try {
                        SymbolTable.top.put(var_dec_item);
                    } catch (ItemAlreadyExistsException e) {
                        System.out.println("Redeclaration of variable \"" + name +"\" in line " + line);
                    }
                }
            }

        if(functionDefinition.getDeclarationList() != null)
            functionDefinition.getDeclarationList().accept(this);

        functionDefinition.getBody().accept(this);

        functionDefinition.findArguments();

        List<Integer> indices = new ArrayList<>(functionDefinition.getArguments());
        indices.sort(Comparator.reverseOrder());

        if(functionDefinition.getDeclarator().getDirectDeclarator().getParameterList() != null)
            for(int i : indices) {

                functionDefinition.getDeclarator().getDirectDeclarator().getParameterList().getParameterDeclarations().remove(i);
            }

        functionDefinition.deleteUnusedVariables();

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(CompoundStmt compoundStmt) {
        List<BlockItem> items = compoundStmt.getItems();
        ListIterator<BlockItem> it = items.listIterator();
        boolean seenReturn = false;

        while (it.hasNext()) {
            BlockItem bi = it.next();

            // First, remove non-assignment ExpressionStmt
            Stmt stmt = bi.getStatement();
            if (stmt instanceof ExpressionStmt) {
                Set<String> assignmentOps = Set.of(
                        "=", "*=", "/=", "%=", "+=", "-=", "<<=", ">>=", "&=", "^=", "|="
                );
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                if(exprStmt.getExpression() instanceof BinaryExpression) {
                    String op = ((BinaryExpression) exprStmt.getExpression()).getOperator();

                    if (!assignmentOps.contains(op)) {
                        it.remove();
                        continue;
                    }
                }
            }

            if (seenReturn) {
                it.remove();
                continue;
            }

            bi.accept(this);

            stmt = bi.getStatement();
            if (stmt instanceof JumpStmt) {
                JumpStmt js = (JumpStmt) stmt;
                if ("return".equals(js.getType())) {
                    seenReturn = true;
                }
            }
        }

        return null;
    }


    @Override
    public Void visit(BlockItem blockItem) {
        if(blockItem.getStatement() != null)
            blockItem.getStatement().accept(this);
        if(blockItem.getDec() != null)
            blockItem.getDec().accept(this);
        return null;
    }

    @Override
    public Void visit(Declaration declaration) {
        String type = "";
        String name = "";
        if(declaration.getInitDeclaratorList() != null) {
            type = declaration.getDecSpecs().getType().getVal();
            declaration.setType(type);
            for (InitDeclarator initDeclarator: declaration.getInitDeclaratorList().getInitDeclarators()) {
                name = initDeclarator.getDeclarator().getDirectDeclarator().getName();
                int line = initDeclarator.getDeclarator().getLine();
                VarDecSymbolTableItem var_dec_item = new VarDecSymbolTableItem(declaration, name);
                try {
                    SymbolTable.top.put(var_dec_item);
                } catch (ItemAlreadyExistsException e) {
                    System.out.println("Redeclaration of variable \"" + name +"\" in line " + line);
                }
            }
        }
        else {
            name = declaration.getDecSpecs().getDecName();
            type = declaration.getDecSpecs().getDecType();
            VarDecSymbolTableItem var_dec_item = new VarDecSymbolTableItem(declaration, name);
            try {
                SymbolTable.top.put(var_dec_item);
            } catch (ItemAlreadyExistsException e) {
                System.out.println("Redeclaration of variable \"" + name +" ");
            }
        }
        return null;
    }

    @Override
    public Void visit(ExpressionStmt expressionStmt) {
        if(expressionStmt.getExpression() != null){
            if(expressionStmt.getExpression() instanceof FunctionCall)
                expressionStmt.getExpression().accept(this);
            else if(expressionStmt.getExpression() instanceof BinaryExpression) {
                String op = ((BinaryExpression) expressionStmt.getExpression()).getOperator();
                Set<String> assignmentOps = Set.of(
                        "=", "*=", "/=", "%=", "+=", "-=", "<<=", ">>=", "&=", "^=", "|="
                );
                if (assignmentOps.contains(op))
                    expressionStmt.getExpression().accept(this);

            }
            else if(expressionStmt.getExpression() instanceof UnaryExpression)
                expressionStmt.getExpression().accept(this);
            else {
                expressionStmt.setExpression(null);
                }
        }
        return null;
    }

    @Override
    public Void visit(SelectionStmt selectionStmt) {
        int ifLine = selectionStmt.getIfLine();

        selectionStmt.getIfExpression().accept(this);

        SymbolTable selectionStmtSymbolTable = new SymbolTable(SymbolTable.top);
        selectionStmt.setSymbolTable(selectionStmtSymbolTable);
        SymbolTable.push(selectionStmtSymbolTable);

        selectionStmt.getIfStmt().accept(this);

        SymbolTable.pop();

        int elseIfLine = selectionStmt.getElseIfLine();
        if(selectionStmt.getElseIfExpression() != null)
            selectionStmt.getElseIfExpression().accept(this);


        for (Stmt stmt : selectionStmt.getElseIfStmt()) {
            SymbolTable s = new SymbolTable(SymbolTable.top);
            selectionStmt.setSymbolTable(s);
            SymbolTable.push(s);

            stmt.accept(this);

            SymbolTable.pop();
        }

        int elseLine = selectionStmt.getElseLine();
        if(selectionStmt.getElseStmt() != null) {
            SymbolTable s = new SymbolTable(SymbolTable.top);
            selectionStmt.setSymbolTable(s);
            SymbolTable.push(s);


            selectionStmt.getElseStmt().accept(this);

            SymbolTable.pop();
        }

        return null;
    }

    @Override
    public Void visit(IterationStmt iterationStmt) {

        if(iterationStmt.getExpression() != null)
            iterationStmt.getExpression().accept(this);

        SymbolTable iterStmtSymbolTable = new SymbolTable(SymbolTable.top);
        iterationStmt.setSymbolTable(iterStmtSymbolTable);
        SymbolTable.push(iterStmtSymbolTable);

        if(iterationStmt.getForCondition() != null)
            iterationStmt.getForCondition().accept(this);

        iterationStmt.getStmt().accept(this);

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ForCondition forCondition) {
        if(forCondition.getForDeclaration() != null)
            forCondition.getForDeclaration().accept(this);
        if(forCondition.getExpression() != null)
            forCondition.getExpression().accept(this);
        if(forCondition.getForExpression1() != null)
            forCondition.getForExpression1().accept(this);
        if(forCondition.getForExpression2() != null)
            forCondition.getForExpression2().accept(this);

        return null;
    }

    @Override
    public Void visit(ForExpression forExpression) {
        for(Expression e : forExpression.getExpressions())
            e.accept(this);
        return null;
    }

    @Override
    public Void visit(ForDeclaration forDeclaration) {
        forDeclaration.getDeclarationSpecifiers().accept(this);
        if(forDeclaration.getInitDeclaratorList() != null) {
            String name = "";
            for(InitDeclarator i : forDeclaration.getInitDeclaratorList().getInitDeclarators()) {
                if(i.getDeclarator() != null)
                    if(i.getDeclarator().getDirectDeclarator() != null)
                        if(i.getDeclarator().getDirectDeclarator().getIdentifier() != null) {
                            name = i.getDeclarator().getDirectDeclarator().getIdentifier().getName();
                            VarDecSymbolTableItem var_dec_item = new VarDecSymbolTableItem(forDeclaration, name);
                            try {
                                SymbolTable.top.put(var_dec_item);
                            } catch (ItemAlreadyExistsException e) {
                                System.out.println("Redeclaration of variable \"" + name +" ");
                            }
                        }
            }
        }
            forDeclaration.getInitDeclaratorList().accept(this);
        return null;
    }

    @Override
    public Void visit(DeclarationSpecifiers declarationSpecifiers) {
        for(DeclarationSpecifier d : declarationSpecifiers.getDeclarationSpecifier())
            if(d instanceof TypeSpecifier)
                if(((TypeSpecifier) d).getIdentifier() != null)
                    ((TypeSpecifier) d).getIdentifier().accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        try {
            SymbolTable.top.getItem(VarDecSymbolTableItem.START_KEY + identifier.getName());
        } catch (ItemNotFoundException e) {
            System.out.println("Variable \"" + identifier.getName() + "\" not declared in line : " + identifier.getLine());
        }
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        binaryExpression.getFirstExpression().accept(this);
        binaryExpression.getSecondExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        int line = functionCall.getExpression().getLine();
        String name = ((Identifier)functionCall.getExpression()).getName();
        Expression expr = functionCall.getArgsExpr();
        int numOfArgs = 0;
        if(expr != null) {
            if(expr instanceof Constant || expr instanceof Identifier)
                numOfArgs = 1;
            else if(expr instanceof ArgumentExpressionList){
                numOfArgs = ((ArgumentExpressionList) expr).getExpressions().size();
            }

            expr.accept(this);
        }

        FuncDecSymbolTableItem f;
        try {
            f = (FuncDecSymbolTableItem) SymbolTable.top.getItem(FuncDecSymbolTableItem.START_KEY + name + numOfArgs);
            if (f != null) {
                FunctionDefinition funcDef = f.getFuncDec();
                if(funcDef.getArguments().size() != 0) {
                    List<Integer> indices = new ArrayList<>(funcDef.getArguments());
                    indices.sort(Comparator.reverseOrder()); // Sort in descending order

                    for (int i : indices) {
                        if(expr instanceof Identifier || expr instanceof Constant)
                            functionCall.setArgumentExpressionList(null);
                        else
                            ((ArgumentExpressionList) expr).getExpressions().remove(i);
                    }
                }
                funcDef.clearArgs();
            }
        } catch (ItemNotFoundException e) {
            System.out.println("Function \"" + name + "\" not declared in line : " + line);
        }

        return null;
    }

    @Override
    public Void visit(ArgumentExpressionList argumentExpressionList) {
        for(Expression e: argumentExpressionList.getExpressions()) {
            if(e != null)
                e.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess) {
        arrayAccess.getArray().accept(this);
        arrayAccess.getIndex().accept(this);
        return null;
    }
}
