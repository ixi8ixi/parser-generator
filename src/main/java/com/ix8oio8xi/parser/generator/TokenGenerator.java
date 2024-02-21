package com.ix8oio8xi.parser.generator;

import com.ix8oio8xi.parser.generator.util.PackageHandler;

import java.util.Set;
import java.util.stream.Collectors;

public class TokenGenerator {
    public static void generate(PackageHandler packageHandler, Set<String> tokens) {
        String classBody = """
                public enum %s {
                    %s
                }
                """.formatted(packageHandler.tokenName(),
                tokens.stream().map(String::toUpperCase).collect(Collectors.joining(", ")));
        packageHandler.generate("Token", classBody);
    }
}
