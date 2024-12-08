package graphs;

public class Edge {
    private Node startNode;
    private Node endNode;

    public Edge(Node startNode, Node endNode) {
        this.startNode = startNode;
        this.endNode = endNode;
    }

    @Override
    public String toString() {
        return "(" + this.startNode.getLabel() + ", " + this.endNode.getLabel() + ")";
    }
}
