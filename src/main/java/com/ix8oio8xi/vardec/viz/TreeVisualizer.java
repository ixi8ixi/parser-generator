package com.ix8oio8xi.vardec.viz;

import com.ix8oio8xi.parser.common.Tree;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.model.Factory;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

public class TreeVisualizer {
    private TreeVisualizer() {
        throw new AssertionError();
    }

    public static MutableGraph toGraph(Tree tree) {
        MutableGraph graph = Factory.mutGraph().setDirected(true);
        Numerator numerator = new Numerator();
        graph.add(addVx(tree, numerator));
        return graph;
    }

    private static MutableNode addVx(Tree tree, Numerator numerator) {
        MutableNode curNode = Factory.mutNode(numerator.getNum()).add(Label.of(tree.name()));
        for (Tree child : tree.children()) {
            curNode.addLink(addVx(child, numerator));
        }
        return curNode;
    }
}
