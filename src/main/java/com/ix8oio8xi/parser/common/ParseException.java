package com.ix8oio8xi.parser.common;

public class ParseException extends RuntimeException {
    public ParseException(String input) {
        super("Parse error on input: " + input);
    }
}
