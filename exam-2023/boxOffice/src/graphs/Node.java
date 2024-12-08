package graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int label;
    private List<Node> neighbours;

    public Node(int label) {
        this.label = label;
        this.neighbours = new ArrayList<Node>();
    }

    public void addNeighbour(Node node) {
        this.neighbours.add(node);
    }

    public List<Node> getNeighbours() {
        return this.neighbours;
    }

    public int getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return "Label: " + this.label;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Node))
            return false;
        Node other = (Node) o;
        boolean labelEqual = this.label == other.label;
        return labelEqual;
    }
}
