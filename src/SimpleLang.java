import main.ast.nodes.ExternalDeclaration;
import main.ast.nodes.FunctionDefinition;
import main.ast.nodes.Program;
import main.grammar.SimpleLangLexer;
import main.grammar.SimpleLangParser;
import main.visitor.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SimpleLang {
    public static void main(String[] args) throws IOException {
        // Read raw input
        String sourceCode = java.nio.file.Files.readString(java.nio.file.Paths.get(args[0]));

        String a = sourceCode;

//        sourceCode = FunctionPruner.transform(sourceCode);

        // Convert it
        String convertedCode = CtoCPYConvertor.transform(sourceCode);

        convertedCode = Replacer.transform(convertedCode);

        // Feed converted code to lexer
        CharStream reader = CharStreams.fromString(convertedCode);
        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
        SimpleLangParser flParser = new SimpleLangParser(tokens);
        Program program = flParser.program().programRet;


        // Capture System.out
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream tempOut = new PrintStream(buffer);
        System.setOut(tempOut);

        NameAnalyzer n = new NameAnalyzer();
        n.visit(program);

        System.out.flush();
        System.setOut(originalOut); // Restore original output

        String output = buffer.toString();

        if (!output.trim().isEmpty()) {
            // Print captured output
            System.out.println(output);
            System.exit(1);
        }

        a = FunctionPruner.transform(a);

        // Convert it
        String converted = CtoCPYConvertor.transform(a);

        converted = Replacer.transform(converted);

        // Feed converted code to lexer
        CharStream r = CharStreams.fromString(converted);
        SimpleLangLexer lexer = new SimpleLangLexer(r);
        CommonTokenStream t = new CommonTokenStream(lexer);
        SimpleLangParser fl = new SimpleLangParser(t);
        Program p = fl.program().programRet;

        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(p);
        int i = 0;
        while(!p.allFunctionsHaveNoDeadVars()) {
            for(ExternalDeclaration f : p.getTranslationUnit().getExternalDeclarations()) {
                if(f instanceof FunctionDefinition)
                    ((FunctionDefinition) f).pruneUnusedVariables();
            }
            NameAnalyzer na = new NameAnalyzer();
            na.visit(p);
            i++;
        }
        TestVisitor my_visitor = new TestVisitor();
        my_visitor.visit(p);
    }
}