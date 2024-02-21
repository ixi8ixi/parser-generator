package com.ix8oio8xi.parser.generator;

import com.ix8oio8xi.parser.generator.util.FirstFollowMaker;
import com.ix8oio8xi.parser.generator.util.PackageHandler;
import com.ix8oio8xi.parser.generator.elements.NonTerminalMethod;

import java.util.List;

public class ParserGenerator {
    private final PackageHandler packageHandler;
    private final List<NonTerminalMethod> methods;
    private final FirstFollowMaker firstFollowMaker;
    private final String importBlock;
    private final String initBlock;

    public ParserGenerator(PackageHandler packageHandler, List<NonTerminalMethod> methods, FirstFollowMaker firstFollowMaker,
                           String importBlock, String initBlock) {
        this.packageHandler = packageHandler;
        this.methods = methods;
        this.firstFollowMaker = firstFollowMaker;
        this.importBlock = importBlock;
        this.initBlock = initBlock;
    }

    public void generate() {
        StringBuilder parserBody = new StringBuilder();
        generateImports(parserBody);
        generateHeader(parserBody);
        generateInitBlock(parserBody);
        generateConstructorAndFields(parserBody);
        generateEnsureMethod(parserBody);
        generateReturnAttributes(parserBody);
        generateNonTerminalMethods(parserBody);
        generateParseMethod(parserBody);
        parserBody.append("}");
        packageHandler.generate("Parser", parserBody.toString());
    }

    private void generateImports(StringBuilder parserBody) {
        String imports = """
                
                import com.ix8oio8xi.parser.common.*;
                import java.util.List;
                import java.util.ArrayList;
                %s
                
                """.formatted(importBlock != null ? importBlock : "");
        parserBody.append(imports);
    }

    private void generateHeader(StringBuilder parserBody) {
        String header = """
                @SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
                public class %s {
                """.formatted(packageHandler.parserName());
        parserBody.append(header);
    }

    private void generateConstructorAndFields(StringBuilder parserBody) {
        String fields = """
                    private final %s lexer;
                    
                    public %s(String text) {
                        this.lexer = new %s(text);
                    }
                    
                """.formatted(packageHandler.lexerName(), packageHandler.parserName(), packageHandler.lexerName());
        parserBody.append(fields);
    }

    private void generateInitBlock(StringBuilder parserBody) {
        if (initBlock != null) {
            parserBody.append(initBlock);
        }
    }

    private void generateEnsureMethod(StringBuilder parserBody) {
        parserBody.append("""
                    public void ensure(%s token) {
                        if (token != lexer.lexeme().token()) {
                            throw new ParseException("Unexpected input: " + lexer.lexeme().text());
                        }
                    }
                
                """.formatted(packageHandler.tokenName()));
    }

    private void generateNonTerminalMethods(StringBuilder parserBody) {
        for (NonTerminalMethod method : methods) {
            parserBody.append(method.buildMethod(packageHandler, firstFollowMaker)).append(System.lineSeparator());
        }
    }

    private void generateReturnAttributes(StringBuilder parserBody) {
        for (NonTerminalMethod method : methods) {
            parserBody.append(method.buildSyntClass()).append(System.lineSeparator());
        }
    }

    private void generateParseMethod(StringBuilder parserBody) {
        String start = methods.get(0).nonTerminalName();
        parserBody.append("""
                    public SYNT%s parse() {
                        var result = %s();
                        if (!lexer.end()) {
                            throw new ParseException("End of input expected");
                        }
                        return result;
                    }
                """.formatted(start, start));
    }
}
