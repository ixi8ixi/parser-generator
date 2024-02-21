package com.ix8oio8xi.parser.generator.elements;

import com.ix8oio8xi.parser.generator.util.PackageHandler;

public record NonTerminal(String name, String args, int pos) implements Element {
    public static final String NT_RETURN_CLASS_PREFIX = "SYNT";

    @Override
    public boolean pure() {
        return true;
    }

    @Override
    public String java(PackageHandler packageHandler, String nonTerminal) {
        String treeAdd = nonTerminal + "0.children.add(" + name + pos + ");" + System.lineSeparator();
        return NT_RETURN_CLASS_PREFIX + name + " " + name + pos + " = " + name + args + ";"
                + System.lineSeparator() + treeAdd;
    }
}
