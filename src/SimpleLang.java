import main.ast.nodes.Program;
import main.grammar.SimpleLangLexer;
import main.grammar.SimpleLangParser;
import main.visitor.TestVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;
import main.visitor.Converter;

public class SimpleLang {
    public static void main(String[] args) throws IOException {
        // Read raw input
        String sourceCode = java.nio.file.Files.readString(java.nio.file.Paths.get(args[0]));

        // Convert it
        String convertedCode = Converter.convert(sourceCode);

        // Feed converted code to lexer
        CharStream reader = CharStreams.fromString(convertedCode);
        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
        SimpleLangParser flParser = new SimpleLangParser(tokens);
        Program program = flParser.program().programRet;

        // Visit the AST
        TestVisitor my_visitor = new TestVisitor();
        my_visitor.visit(program);
    }
}