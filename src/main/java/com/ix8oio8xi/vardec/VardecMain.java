package com.ix8oio8xi.vardec;

import com.ix8oio8xi.vardec.viz.TreeVisualizer;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;

import java.io.File;
import java.io.IOException;

public class VardecMain {
    public static void main(String[] args) throws IOException {
        VardecParser parser = new VardecParser("int ** b; char hello; long * l; int tt;");

        MutableGraph g = TreeVisualizer.toGraph(parser.s());
        Graphviz.fromGraph(g).width(1000).render(Format.PNG).toFile(new File("example/ex1m.png"));
    }
}
