package com.ix8oio8xi.parser.generator.util;

import com.ix8oio8xi.gram.file.util.GramException;
import com.ix8oio8xi.parser.common.Pair;
import com.ix8oio8xi.parser.generator.elements.PureRule;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstFollowMaker {
    private static final String END = "END";
    private static final String EPS = "EPS";

    private final Map<String, String> terminalToPattern;
    private final List<PureRule> nonTerminalRules;
    private final Map<String, Set<String>> first;
    private final Map<String, Set<String>> follow;

    public FirstFollowMaker(List<Pair<String, String>> terminalToPattern, List<PureRule> nonTerminalRules) {
        this.terminalToPattern = toMap(terminalToPattern);
        this.nonTerminalRules = nonTerminalRules;
        this.first = buildFirst();
        this.follow = buildFollow();
    }

    private static Map<String, String> toMap(List<Pair<String, String>> terminalToPattern) {
        Map<String, String> result = new HashMap<>();
        for (var t : terminalToPattern) {
            result.put(t.key(), t.value());
        }
        return result;
    }

    /**
     * Возвращает множество FIRST1 для чистого правила r
     */
    public Set<String> first1(PureRule r) {
        Set<String> result = firstByRule(r.rule());
        if (result.contains(EPS)) {
            result.remove(EPS);
            result.addAll(follow.get(r.nt()));
        }
        return result;
    }

    private Map<String, Set<String>> buildFirst() {
        Map<String, Set<String>> result = makeEmptyFirstMap();
        boolean change = true;
        while (change) {
            change = false;
            for (PureRule r : nonTerminalRules) {
                Set<String> addition = extractFirst(result, r);
                change = change || result.get(r.nt()).addAll(addition);
            }
        }
        return result;
    }

    private Map<String, Set<String>> makeEmptyFirstMap() {
        Map<String, Set<String>> first = new HashMap<>();
        nonTerminalRules.forEach(r -> first.putIfAbsent(r.nt(), new HashSet<>()));
        return first;
    }

    private Set<String> extractFirst(Map<String, Set<String>> first, PureRule r) {
        List<String> ruleSeq = r.rule();
        if (ruleSeq.isEmpty()) {
            throw new GramException("Nonterminal rule must to be not empty");
        }

        String prem = ruleSeq.get(0);
        if (terminalToPattern.containsKey(prem) || prem.equals(EPS)) {
            return Set.of(prem);
        }
        return first.get(prem);
    }

    private Set<String> firstByRule(List<String> ruleSlice) {
        if (first == null) {
            throw new GramException("First set hasn't built yet");
        }

        if (ruleSlice.isEmpty()) {
            return new HashSet<>(Set.of(EPS));
        }

        String head = ruleSlice.get(0);
        if (isTerminal(head)) {
            return new HashSet<>(Set.of(head));
        }

        Set<String> res = new HashSet<>(first.get(head));
        if (res.contains(EPS)) {
            res.remove(EPS);
            res.addAll(firstByRule(ruleSlice.subList(1, ruleSlice.size())));
        }

        return res;
    }

    private Map<String, Set<String>> buildFollow() {
        if (nonTerminalRules.isEmpty()) {
            throw new GramException("The grammar must contain at least one nonterminal");
        }
        Map<String, Set<String>> follow = makeEmptyFirstMap();
        follow.get(nonTerminalRules.get(0).nt()).add(END);

        boolean change = true;
        while (change) {
            change = false;
            for (PureRule r : nonTerminalRules) {
                List<String> rlist = r.rule();
                for (int i = 0; i < rlist.size(); i++) {
                    String cur = rlist.get(i);
                    if (!isTerminal(cur)) {
                        Set<String> addition = firstByRule(rlist.subList(i + 1, rlist.size()));
                        if (addition.contains(EPS)) {
                            addition.remove(EPS);
                            addition.addAll(follow.get(r.nt()));
                        }

                        change = change || follow.get(cur).addAll(addition);
                    }
                }
            }
        }

        return follow;
    }

    public boolean isTerminal(String t) {
        return terminalToPattern.containsKey(t) || t.equals(EPS);
    }

    public Set<String> terminals() {
        var result = new HashSet<>(terminalToPattern.keySet());
        result.add(EPS);
        result.add(END);
        return result;
    }
}
