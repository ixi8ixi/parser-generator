package com.ix8oio8xi.parser.generator;

import com.ix8oio8xi.parser.generator.util.PackageHandler;

public class LexemeGenerator {
    public static void generate(PackageHandler packageHandler) {
        String body = """
                public record %s(%s token, String text) {}
                """.formatted(packageHandler.lexemeName(), packageHandler.tokenName());
        packageHandler.generate("Lexeme", body);
    }
}
