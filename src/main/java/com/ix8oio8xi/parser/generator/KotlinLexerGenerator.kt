package com.ix8oio8xi.parser.generator

import com.ix8oio8xi.parser.generator.util.PackageHandler
import com.ix8oio8xi.parser.common.Pair
import java.util.stream.Collectors

class KotlinLexerGenerator(
    private val packageHandler: PackageHandler,
    private val termToPattern: List<Pair<String, String>>,
    private val skipPattern: String
) {
    fun generate() {
        val body = """
            import com.ix8oio8xi.parser.common.*;
            import java.util.regex.*;
            import java.util.List;

            public class ${packageHandler.lexerName()} {
                private String text;
                private ${packageHandler.lexemeName()} curLexeme;
                private static final Pattern SKIP = Pattern.compile("$skipPattern");
                private final Matcher matcher;

                ${generateTokenMap()}

                public ${packageHandler.lexerName()}(String text) {
                    this.text = text;
                    matcher = SKIP.matcher(text);
                    next();
                }

                public void next() {
                    skip();
                    for (var token : TOKEN_LIST) {
                        matcher.usePattern(token.value());
                        if (matcher.lookingAt()) {
                            curLexeme = new ${packageHandler.lexemeName()}(token.key(), text.substring(matcher.start(), matcher.end()));
                            text = text.substring(matcher.end());
                            matcher.reset(text);
                            return;
                        }
                    }
                    throw new ParseException(text);
                }

                public ${packageHandler.lexemeName()} lexeme() {
                    return curLexeme;
                }
                
                private void skip() {
                    matcher.usePattern(SKIP);
                    if (matcher.lookingAt()) {
                        text = text.substring(matcher.end());
                        matcher.reset(text);
                    }
                }
                
                public boolean end() {
                    return curLexeme.token() == ${packageHandler.tokenName()}.END;
                }
            }
        """.trimIndent()

        packageHandler.generate("Lexer", body)
    }

    private fun generateTokenMap() : String {
        val mapHead = "private static final List<Pair<${packageHandler.tokenName()}, Pattern>> TOKEN_LIST = List.of("
        val mapBody: String = termToPattern.stream()
            .map { "new Pair<>(${packageHandler.tokenName()}.${it.key()}, Pattern.compile(\"${it.value()}\"))" }
            .collect(Collectors.joining(", "))
        val mapTail = ");"
        return mapHead + mapBody + mapTail
    }
}