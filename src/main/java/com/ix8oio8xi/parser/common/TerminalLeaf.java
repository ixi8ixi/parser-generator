package com.ix8oio8xi.parser.common;

import java.util.List;

public record TerminalLeaf(String name) implements Tree {
    @Override
    public List<Tree> children() {
        return List.of();
    }
}
