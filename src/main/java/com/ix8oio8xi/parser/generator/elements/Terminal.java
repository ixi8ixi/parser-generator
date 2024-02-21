package com.ix8oio8xi.parser.generator.elements;

import com.ix8oio8xi.parser.generator.util.PackageHandler;

public record Terminal(String name, int pos) implements Element {
    @Override
    public boolean pure() {
        return true;
    }

    @Override
    public String java(PackageHandler packageHandler, String nonTerminal) {
        if (name.equals("EPS")) {
            return "";
        }
        return """
                %s0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(%s.%s);
                String %s%s = lexer.lexeme().text();
                lexer.next();
                """.formatted(nonTerminal, packageHandler.tokenName(), name, name, pos);
    }
}
