package graphs;

import java.util.Set;
import java.util.HashSet;

public class GraphExplorer {
    public static Set<Edge> listEdges(Node[] nodes) {
        Set<Edge> edgesSet = new HashSet<>();
        for (int i = 0; i < nodes.length; i++) {
            for (Node n : nodes[i].getNeighbours()) {
                edgesSet.add(new Edge(nodes[i], n));
            }
        }
        return edgesSet;
    }
}
