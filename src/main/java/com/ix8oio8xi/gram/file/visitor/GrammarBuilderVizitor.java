package com.ix8oio8xi.gram.file.visitor;

import com.ix8oio8xi.gram.file.antlr.GramparserBaseVisitor;
import com.ix8oio8xi.gram.file.antlr.GramparserParser;
import com.ix8oio8xi.parser.common.Pair;
import com.ix8oio8xi.parser.generator.util.FirstFollowMaker;
import com.ix8oio8xi.gram.file.util.GramException;
import com.ix8oio8xi.parser.generator.elements.PureRule;
import com.ix8oio8xi.parser.generator.elements.CodeBlock;
import com.ix8oio8xi.parser.generator.elements.Element;
import com.ix8oio8xi.parser.generator.elements.NonTerminal;
import com.ix8oio8xi.parser.generator.elements.NonTerminalMethod;
import com.ix8oio8xi.parser.generator.elements.Terminal;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class GrammarBuilderVizitor extends GramparserBaseVisitor<String> {
    private static final String EMPTY_PATTERN = "^$";
    private String skipPattern = EMPTY_PATTERN;
    private final List<Pair<String, String>> terminalToPattern;
    private final List<PureRule> nonTerminalRules;
    private final List<NonTerminalMethod> nonTerminalMethods;
    private String grammarName;
    private String importBlock;
    private String initBlock;

    public GrammarBuilderVizitor() {
        this.terminalToPattern = new ArrayList<>();
        terminalToPattern.add(new Pair<>("END", "^$"));
        nonTerminalRules = new ArrayList<>();
        nonTerminalMethods = new ArrayList<>();
    }

    @Override
    public String visitGramname(GramparserParser.GramnameContext ctx) {
        grammarName = ctx.GRAMNAME().getText();
        return super.visitGramname(ctx);
    }

    @Override
    public String visitImportblock(GramparserParser.ImportblockContext ctx) {
        importBlock = trim(ctx.getText(), 9, ctx.getText().length() - 2);
        return super.visitImportblock(ctx);
    }

    @Override
    public String visitInitblock(GramparserParser.InitblockContext ctx) {
        initBlock = trim(ctx.getText(), 7, ctx.getText().length() - 2);
        return super.visitInitblock(ctx);
    }

    @Override
    public String visitTerminalLine(GramparserParser.TerminalLineContext ctx) {
        terminalToPattern.add(new Pair<>(ctx.TNAME().getText(), trim(ctx.REGEXP().getText())));
        return super.visitTerminalLine(ctx);
    }

    @Override
    public String visitNonTerminalLine(GramparserParser.NonTerminalLineContext ctx) {
        String ntName = ctx.NTNAME().getText();
        String inherited = ctx.inherited().getText();
        String synthesized = trim(ctx.synthesized().getText());
        NonTerminalMethod method = new NonTerminalMethod(ntName, inherited, synthesized);
        var ruleList = ctx.rulesList().rule_();
        for (var rule : ruleList) {
            var ruleParts = rule.rulepart();
            List<Element> genRule = toGenRule(ruleParts);
            method.addRule(genRule);
            nonTerminalRules.add(PureRule.toPureRule(ntName, genRule));
        }
        nonTerminalMethods.add(method);
        return super.visitNonTerminalLine(ctx);
    }

    private static List<Element> toGenRule(List<GramparserParser.RulepartContext> ruleParts) {
        List<Element> genRule = new ArrayList<>();
        for (int i = 0; i < ruleParts.size(); i++) {
            var curPart = ruleParts.get(i);
            var terminal = curPart.TNAME();
            if (terminal != null) {
                genRule.add(new Terminal(terminal.getText(), i + 1));
                continue;
            }

            var codeBlock = curPart.CODE();
            if (codeBlock != null) {
                genRule.add(new CodeBlock(trim(codeBlock.getText())));
                continue;
            }

            String nonTerminal = curPart.NTNAME().getText();
            String args = curPart.inherited().getText();
            genRule.add(new NonTerminal(nonTerminal, args, i + 1));
        }
        return genRule;
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return node.getText();
    }

    @Override
    public String visitSkipline(GramparserParser.SkiplineContext ctx) {
        if (!skipPattern.equals(EMPTY_PATTERN)) {
            throw new GramException("There should be only one skip expression in gram.");
        }
        String reg = ctx.REGEXP().getText();
        skipPattern = reg.substring(1, reg.length() - 1);
        return super.visitSkipline(ctx);
    }

    private static String trim(String str) {
        return trim(str, 1, str.length() - 1);
    }

    private static String trim(String str, int from, int to) {
        return str.substring(from, to);
    }

    public List<Pair<String, String>> terminalToPattern() {
        return terminalToPattern;
    }

    public String skipPattern() {
        return skipPattern;
    }

    public FirstFollowMaker firstFollow() {
        return new FirstFollowMaker(terminalToPattern, nonTerminalRules);
    }

    public List<NonTerminalMethod> getNtMethods() {
        return nonTerminalMethods;
    }

    public String getGrammarName() {
        return grammarName;
    }

    public String importBlock() {
        return importBlock;
    }

    public String initBlock() {
        return initBlock;
    }
}
