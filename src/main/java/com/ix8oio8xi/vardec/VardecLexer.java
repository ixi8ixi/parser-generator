package com.ix8oio8xi.vardec;
import com.ix8oio8xi.parser.common.*;
import java.util.regex.*;
import java.util.List;

public class VardecLexer {
    private String text;
    private VardecLexeme curLexeme;
    private static final Pattern SKIP = Pattern.compile("[ \\n\\r\\t]+");
    private final Matcher matcher;

    private static final List<Pair<VardecToken, Pattern>> TOKEN_LIST = List.of(new Pair<>(VardecToken.END, Pattern.compile("^$")), new Pair<>(VardecToken.SEMICOLON, Pattern.compile(";")), new Pair<>(VardecToken.COMMA, Pattern.compile(",")), new Pair<>(VardecToken.STAR, Pattern.compile("\\*")), new Pair<>(VardecToken.NAME, Pattern.compile("[a-zA-Z]+")), new Pair<>(VardecToken.LBR, Pattern.compile("\\[")), new Pair<>(VardecToken.RBR, Pattern.compile("\\]")));

    public VardecLexer(String text) {
        this.text = text;
        matcher = SKIP.matcher(text);
        next();
    }

    public void next() {
        skip();
        for (var token : TOKEN_LIST) {
            matcher.usePattern(token.value());
            if (matcher.lookingAt()) {
                curLexeme = new VardecLexeme(token.key(), text.substring(matcher.start(), matcher.end()));
                text = text.substring(matcher.end());
                matcher.reset(text);
                return;
            }
        }
        throw new ParseException(text);
    }

    public VardecLexeme lexeme() {
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
        return curLexeme.token() == VardecToken.END;
    }
}
