package com.ix8oio8xi.parser.generator.elements;

import com.ix8oio8xi.parser.generator.util.FirstFollowMaker;
import com.ix8oio8xi.parser.generator.util.PackageHandler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NonTerminalMethod {
    private final String nonTerminalName;
    private final String inherited;
    private final String synthesized;

    private final Set<List<Element>> rules;

    public NonTerminalMethod(String nonTerminalName, String inherited, String synthesized) {
        this.nonTerminalName = nonTerminalName;
        this.inherited = inherited;
        this.synthesized = synthesized;
        this.rules = new HashSet<>();
    }

    public void addRule(List<Element> rule) {
        rules.add(rule);
    }

    public String buildSyntClass() {
        return """
                    public static class %s implements Tree {
                        private final List<Tree> children = new ArrayList<>();
                        %s
                        
                        @Override
                        public String name() {
                            return "%s";
                        }
                                    
                        @Override
                        public List<Tree> children() {
                            return children;
                        }
                        
                    }
                """.formatted(NonTerminal.NT_RETURN_CLASS_PREFIX + nonTerminalName,
                generateSyntFields(),
                nonTerminalName);
    }

    private String generateSyntFields() {
        return !synthesized.trim().isEmpty() ?
                Arrays.stream(synthesized.split(",")).map(s -> "public " + s + ";")
                .collect(Collectors.joining(System.lineSeparator())) : "";
    }

    public String buildMethod(PackageHandler packageHandler, FirstFollowMaker firstFollowMaker) {
        String returnType = NonTerminal.NT_RETURN_CLASS_PREFIX + nonTerminalName;
        String resultName = nonTerminalName + "0";

        return """
                    public %s %s {
                        %s
                        %s
                        
                        return %s;
                    }
                """.formatted(returnType, nonTerminalName + inherited,
                returnType + " " + resultName + " = new " + returnType + "();",
                buildBody(packageHandler, firstFollowMaker), resultName);
    }

    private String buildBody(PackageHandler packageHandler, FirstFollowMaker firstFollowMaker) {
        Set<String> usedTerminals = firstFollowMaker.terminals();


        StringBuilder sb = new StringBuilder().append(System.lineSeparator());
        rules.forEach(rule -> buildProduction(packageHandler, rule, firstFollowMaker, sb, usedTerminals));
        return """
                switch (lexer.lexeme().token()) {
                    %s
                    
                            default: throw new ParseException("Unexpected token: " + lexer.lexeme().token());
                        }
                """.formatted(sb.toString());
    }

    public void buildProduction(PackageHandler packageHandler, List<Element> rule,
                                FirstFollowMaker firstFollowMaker, StringBuilder sb, Set<String> used) {
        PureRule pureRule = PureRule.toPureRule(nonTerminalName, rule);
        Set<String> first1 = firstFollowMaker.first1(pureRule);

        int caseCounter = 0;
        for (String token : first1) {
            if (used.remove(token)) {
                sb.append("            ").append("case ").append(token).append(":").append(System.lineSeparator());
                caseCounter++;
            }
        }
        if (caseCounter > 0) {
            sb.append("            {").append(System.lineSeparator());
            rule.forEach(element -> sb.append(addTub(element.java(packageHandler, nonTerminalName), 4))
                    .append(System.lineSeparator().repeat(2)));
            sb.append("                break;").append(System.lineSeparator()).append("            }")
                    .append(System.lineSeparator());
        }
    }

    private String addTub(String txt, int tab) {
        String[] splitted = txt.split("\r\n|\n\r|\n|\r");
        int finalTab = tab * 4;
        return Arrays.stream(splitted).map(str -> " ".repeat(finalTab) + str)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    public String nonTerminalName() {
        return nonTerminalName;
    }
}
