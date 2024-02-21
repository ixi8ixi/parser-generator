package com.ix8oio8xi;

import com.ix8oio8xi.gram.file.antlr.GramparserLexer;
import com.ix8oio8xi.gram.file.antlr.GramparserParser;
import com.ix8oio8xi.parser.generator.KotlinLexerGenerator;
import com.ix8oio8xi.parser.generator.LexemeGenerator;
import com.ix8oio8xi.parser.generator.ParserGenerator;
import com.ix8oio8xi.parser.generator.TokenGenerator;
import com.ix8oio8xi.parser.generator.util.FirstFollowMaker;
import com.ix8oio8xi.parser.generator.util.PackageHandler;
import com.ix8oio8xi.gram.file.visitor.GrammarBuilderVizitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GeneratorRunner {
    public static void main(String[] args) throws IOException {
        runGenerator(
                "C:\\NewUniversity\\TM\\FourthGradle\\src\\main\\grm\\calc.grm",
                "C:\\NewUniversity\\TM\\FourthGradle\\src\\main\\java\\com\\ix8oio8xi\\calculator",
                "com.ix8oio8xi.calculator"
        );
    }

    private static void runGenerator(String grammarLocation, String parserDestination,
                                    String parserPackage) throws IOException {
        String ipt = Files.readString(Paths.get(grammarLocation));
        GrammarBuilderVizitor grammarBuilderVizitor = parseGrammar(ipt);

        PackageHandler handler = new PackageHandler(Paths.get(parserDestination),
                parserPackage, grammarBuilderVizitor.getGrammarName());

        FirstFollowMaker firstFollow = grammarBuilderVizitor.firstFollow();

        TokenGenerator.generate(handler, firstFollow.terminals());
        LexemeGenerator.generate(handler);
        KotlinLexerGenerator lex = new KotlinLexerGenerator(handler, grammarBuilderVizitor.terminalToPattern(),
                grammarBuilderVizitor.skipPattern());
        lex.generate();
        ParserGenerator parserGenerator = new ParserGenerator(handler, grammarBuilderVizitor.getNtMethods(), firstFollow,
                grammarBuilderVizitor.importBlock(), grammarBuilderVizitor.initBlock());
        parserGenerator.generate();
    }

    private static GrammarBuilderVizitor parseGrammar(String input) {
        GramparserLexer lexer = new GramparserLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramparserParser parser = new GramparserParser(tokens);
        ParseTree tree = parser.gram();

        GrammarBuilderVizitor grammarBuilderVizitor = new GrammarBuilderVizitor();
        grammarBuilderVizitor.visit(tree);
        return grammarBuilderVizitor;
    }
}