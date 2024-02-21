package com.ix8oio8xi.vardec;

import com.ix8oio8xi.parser.common.*;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VardecParser {
    private final VardecLexer lexer;

    public VardecParser(String text) {
        this.lexer = new VardecLexer(text);
    }

    public void ensure(VardecToken token) {
        if (token != lexer.lexeme().token()) {
            throw new ParseException("Unexpected input: " + lexer.lexeme().text());
        }
    }

    public static class SYNTs implements Tree {
        private final List<Tree> children = new ArrayList<>();
        

        @Override
        public String name() {
            return "s";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTsh implements Tree {
        private final List<Tree> children = new ArrayList<>();
        

        @Override
        public String name() {
            return "sh";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTl implements Tree {
        private final List<Tree> children = new ArrayList<>();
        

        @Override
        public String name() {
            return "l";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTv implements Tree {
        private final List<Tree> children = new ArrayList<>();
        

        @Override
        public String name() {
            return "v";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTvs implements Tree {
        private final List<Tree> children = new ArrayList<>();
        

        @Override
        public String name() {
            return "vs";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTf implements Tree {
        private final List<Tree> children = new ArrayList<>();
        

        @Override
        public String name() {
            return "f";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public static class SYNTk implements Tree {
        private final List<Tree> children = new ArrayList<>();
        

        @Override
        public String name() {
            return "k";
        }

        @Override
        public List<Tree> children() {
            return children;
        }

    }

    public SYNTs s() {
        SYNTs s0 = new SYNTs();
        switch (lexer.lexeme().token()) {
    
            case NAME:
            {
                SYNTk k1 = k();
                s0.children.add(k1);

                SYNTsh sh2 = sh();
                s0.children.add(sh2);

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return s0;
    }

    public SYNTsh sh() {
        SYNTsh sh0 = new SYNTsh();
        switch (lexer.lexeme().token()) {
    
            case STAR:
            case NAME:
            {
                SYNTv v1 = v();
                sh0.children.add(v1);

                sh0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(VardecToken.SEMICOLON);
                String SEMICOLON2 = lexer.lexeme().text();
                lexer.next();

                SYNTl l3 = l();
                sh0.children.add(l3);

                break;
            }
            case SEMICOLON:
            {
                sh0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(VardecToken.SEMICOLON);
                String SEMICOLON1 = lexer.lexeme().text();
                lexer.next();

                SYNTl l2 = l();
                sh0.children.add(l2);

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return sh0;
    }

    public SYNTl l() {
        SYNTl l0 = new SYNTl();
        switch (lexer.lexeme().token()) {
    
            case NAME:
            {
                SYNTk k1 = k();
                l0.children.add(k1);

                SYNTsh sh2 = sh();
                l0.children.add(sh2);

                break;
            }
            case END:
            {
                

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return l0;
    }

    public SYNTv v() {
        SYNTv v0 = new SYNTv();
        switch (lexer.lexeme().token()) {
    
            case STAR:
            case NAME:
            {
                SYNTf f1 = f();
                v0.children.add(f1);

                SYNTvs vs2 = vs();
                v0.children.add(vs2);

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return v0;
    }

    public SYNTvs vs() {
        SYNTvs vs0 = new SYNTvs();
        switch (lexer.lexeme().token()) {
    
            case SEMICOLON:
            {
                

                break;
            }
            case COMMA:
            {
                vs0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(VardecToken.COMMA);
                String COMMA1 = lexer.lexeme().text();
                lexer.next();

                SYNTvs vs2 = vs();
                vs0.children.add(vs2);

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return vs0;
    }

    public SYNTf f() {
        SYNTf f0 = new SYNTf();
        switch (lexer.lexeme().token()) {
    
            case NAME:
            {
                SYNTk k1 = k();
                f0.children.add(k1);

                break;
            }
            case STAR:
            {
                f0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(VardecToken.STAR);
                String STAR1 = lexer.lexeme().text();
                lexer.next();

                SYNTf f2 = f();
                f0.children.add(f2);

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return f0;
    }

    public SYNTk k() {
        SYNTk k0 = new SYNTk();
        switch (lexer.lexeme().token()) {
    
            case NAME:
            {
                k0.children.add(new TerminalLeaf(lexer.lexeme().text()));
                ensure(VardecToken.NAME);
                String NAME1 = lexer.lexeme().text();
                lexer.next();

                break;
            }


            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
        }


        return k0;
    }

    public SYNTs parse() {
        var result = s();
        if (!lexer.end()) {
            throw new ParseException("End of input expected");
        }
        return result;
    }
}
