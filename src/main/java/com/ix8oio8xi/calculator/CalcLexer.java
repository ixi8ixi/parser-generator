package com.ix8oio8xi.calculator;
import com.ix8oio8xi.parser.common.*;
import java.util.regex.*;
import java.util.List;

public class CalcLexer {
    private String text;
    private CalcLexeme curLexeme;
    private static final Pattern SKIP = Pattern.compile("[ \\n\\r\\t]+");
    private final Matcher matcher;

    private static final List<Pair<CalcToken, Pattern>> TOKEN_LIST = List.of(new Pair<>(CalcToken.END, Pattern.compile("^$")), new Pair<>(CalcToken.NUM, Pattern.compile("(\\-)?\\d+")), new Pair<>(CalcToken.POW, Pattern.compile("\\*\\*")), new Pair<>(CalcToken.PLUS, Pattern.compile("\\+")), new Pair<>(CalcToken.MINUS, Pattern.compile("\\-")), new Pair<>(CalcToken.MUL, Pattern.compile("\\*")), new Pair<>(CalcToken.DIV, Pattern.compile("/")), new Pair<>(CalcToken.LP, Pattern.compile("\\(")), new Pair<>(CalcToken.RP, Pattern.compile("\\)")));

    public CalcLexer(String text) {
        this.text = text;
        matcher = SKIP.matcher(text);
        next();
    }

    public void next() {
        skip();
        for (var token : TOKEN_LIST) {
            matcher.usePattern(token.value());
            if (matcher.lookingAt()) {
                curLexeme = new CalcLexeme(token.key(), text.substring(matcher.start(), matcher.end()));
                text = text.substring(matcher.end());
                matcher.reset(text);
                return;
            }
        }
        throw new ParseException(text);
    }

    public CalcLexeme lexeme() {
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
        return curLexeme.token() == CalcToken.END;
    }
}
