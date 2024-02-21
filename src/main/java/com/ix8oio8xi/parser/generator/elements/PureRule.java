package com.ix8oio8xi.parser.generator.elements;

import java.util.List;

public record PureRule(String nt, List<String> rule) {
    public static PureRule toPureRule(String name, List<Element> elements) {
        return new PureRule(name, elements.stream().filter(Element::pure).map(Element::name).toList());
    }
}
