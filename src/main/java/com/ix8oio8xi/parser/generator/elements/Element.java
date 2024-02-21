package com.ix8oio8xi.parser.generator.elements;

import com.ix8oio8xi.parser.generator.util.PackageHandler;

public interface Element {
    String name();
    boolean pure();
    String java(PackageHandler packageHandler, String nonTerminalRule);
}
