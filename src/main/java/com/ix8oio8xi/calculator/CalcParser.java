package com.ix8oio8xi.calculator;

import com.ix8oio8xi.parser.common.*;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalcParser {

public static int pow(int x, int base) {
    return (int) (Math.pow(x, base));
}
    private final CalcLexer lexer;

    public CalcParser(String text) {
        this.lexer = new CalcLexer(text);
    }

    public void ensure(CalcToken token) {
        if (token != lexer.lexeme().token()) {
            throw new ParseException("Unexpected input: " + lexer.lexeme().text());
        }
    }

    public static class SYNTexpr implements Tree {
        private final List<Tree> children = new ArrayList<>();
        public int res;

        @Override
        public String name() {
            return "expr";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTexprsh implements Tree {
        private final List<Tree> children = new ArrayList<>();
        public int res;

        @Override
        public String name() {
            return "exprsh";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTterm implements Tree {
        private final List<Tree> children = new ArrayList<>();
        public int res;

        @Override
        public String name() {
            return "term";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTtermsh implements Tree {
        private final List<Tree> children = new ArrayList<>();
        public int res;

        @Override
        public String name() {
            return "termsh";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTfactor implements Tree {
        private final List<Tree> children = new ArrayList<>();
        public int res;

        @Override
        public String name() {
            return "factor";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public SYNTexpr expr() {
        SYNTexpr expr0 = new SYNTexpr();
        switch (lexer.lexeme().token()) {
    
            case LP:
            case NUM:
            {
                SYNTterm term1 = term();
                expr0.children.add(term1);

                SYNTexprsh exprsh2 = exprsh(term1.res);
                expr0.children.add(exprsh2);

                 expr0.res = exprsh2.res; 

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return expr0;
    }

    public SYNTexprsh exprsh(int acc) {
        SYNTexprsh exprsh0 = new SYNTexprsh();
        switch (lexer.lexeme().token()) {
    
            case PLUS:
            {
                exprsh0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(CalcToken.PLUS);
                String PLUS1 = lexer.lexeme().text();
                lexer.next();

                SYNTterm term2 = term();
                exprsh0.children.add(term2);

                 exprsh0.res = acc + term2.res; 

                SYNTexprsh exprsh4 = exprsh(exprsh0.res);
                exprsh0.children.add(exprsh4);

                 exprsh0.res = exprsh4.res; 

                break;
            }
            case END:
            case RP:
            {
                

                 exprsh0.res = acc; 

                break;
            }
            case MINUS:
            {
                exprsh0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(CalcToken.MINUS);
                String MINUS1 = lexer.lexeme().text();
                lexer.next();

                SYNTterm term2 = term();
                exprsh0.children.add(term2);

                 exprsh0.res = acc - term2.res; 

                SYNTexprsh exprsh4 = exprsh(exprsh0.res);
                exprsh0.children.add(exprsh4);

                 exprsh0.res = exprsh4.res; 

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return exprsh0;
    }

    public SYNTterm term() {
        SYNTterm term0 = new SYNTterm();
        switch (lexer.lexeme().token()) {
    
            case LP:
            case NUM:
            {
                SYNTfactor factor1 = factor();
                term0.children.add(factor1);

                SYNTtermsh termsh2 = termsh(factor1.res);
                term0.children.add(termsh2);

                 term0.res = termsh2.res; 

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return term0;
    }

    public SYNTtermsh termsh(int acc) {
        SYNTtermsh termsh0 = new SYNTtermsh();
        switch (lexer.lexeme().token()) {
    
            case END:
            case RP:
            case PLUS:
            case MINUS:
            {
                

                 termsh0.res = acc; 

                break;
            }
            case MUL:
            {
                termsh0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(CalcToken.MUL);
                String MUL1 = lexer.lexeme().text();
                lexer.next();

                SYNTfactor factor2 = factor();
                termsh0.children.add(factor2);

                 termsh0.res = acc * factor2.res; 

                SYNTtermsh termsh4 = termsh(termsh0.res);
                termsh0.children.add(termsh4);

                 termsh0.res = termsh4.res; 

                break;
            }
            case DIV:
            {
                termsh0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(CalcToken.DIV);
                String DIV1 = lexer.lexeme().text();
                lexer.next();

                SYNTfactor factor2 = factor();
                termsh0.children.add(factor2);

                 termsh0.res = acc / factor2.res; 

                SYNTtermsh termsh4 = termsh(termsh0.res);
                termsh0.children.add(termsh4);

                 termsh0.res = termsh4.res; 

                break;
            }
            case POW:
            {
                termsh0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(CalcToken.POW);
                String POW1 = lexer.lexeme().text();
                lexer.next();

                SYNTfactor factor2 = factor();
                termsh0.children.add(factor2);

                SYNTtermsh termsh3 = termsh(factor2.res);
                termsh0.children.add(termsh3);

                 termsh0.res = pow(acc, termsh3.res); 

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return termsh0;
    }

    public SYNTfactor factor() {
        SYNTfactor factor0 = new SYNTfactor();
        switch (lexer.lexeme().token()) {
    
            case NUM:
            {
                factor0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(CalcToken.NUM);
                String NUM1 = lexer.lexeme().text();
                lexer.next();

                 factor0.res = Integer.parseInt(NUM1); 

                break;
            }
            case LP:
            {
                factor0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(CalcToken.LP);
                String LP1 = lexer.lexeme().text();
                lexer.next();

                SYNTexpr expr2 = expr();
                factor0.children.add(expr2);

                factor0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(CalcToken.RP);
                String RP3 = lexer.lexeme().text();
                lexer.next();

                 factor0.res = expr2.res; 

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return factor0;
    }

    public SYNTexpr parse() {
        var result = expr();
        if (!lexer.end()) {
            throw new ParseException("End of input expected");
        }
        return result;
    }
}
