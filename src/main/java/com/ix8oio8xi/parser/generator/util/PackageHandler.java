package com.ix8oio8xi.parser.generator.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class PackageHandler {
    private final Path baseLocation;
    private final String pkg;
    private final String gramName;
    private final String tokenName;
    private final String parserName;
    private final String lexerName;
    private final String lexemeName;

    public PackageHandler(Path baseLocation, String pkg, String gramName) {
        this.baseLocation = baseLocation;
        this.pkg = pkg;
        this.gramName = gramName;

        this.tokenName = className("Token");
        this.parserName = className("Parser");
        this.lexerName = className("Lexer");
        this.lexemeName = className("Lexeme");
    }

    public void generate(String generatorName, String body) {
        String className = className(generatorName);
        Path path = baseLocation.resolve(className + ".java");
        try (var output = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            output.write("package " + pkg + ";");
            output.newLine();
            output.write(body);
            output.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Unable to create file: " + e);
        }
    }

    private String className(String generatorName) {
        return gramName + generatorName;
    }

    public String tokenName() {
        return tokenName;
    }

    public String parserName() {
        return parserName;
    }

    public String lexerName() {
        return lexerName;
    }

    public String lexemeName() {
        return lexemeName;
    }
}
