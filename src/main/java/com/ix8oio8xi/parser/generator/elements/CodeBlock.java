package com.ix8oio8xi.parser.generator.elements;

import com.ix8oio8xi.parser.generator.util.PackageHandler;

public record CodeBlock(String code) implements Element {
    @Override
    public String name() {
        return code;
    }

    @Override
    public boolean pure() {
        return false;
    }

    @Override
    public String java(PackageHandler ignore, String ignoree) {
        return code;
    }
}
