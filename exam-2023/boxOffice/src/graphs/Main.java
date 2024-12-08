package graphs;

public class Main {
    public static void main(String[] args) {
        GraphParser g = new GraphParser();
        Node[] n = g.parseGraph("3\n4\n1 2\n2 3\n3 2\n3 1");
        System.out.println(n);

        Node x = new Node(99);
        Node y = new Node(76);
        Edge e = new Edge(x, y);
        System.out.println(e.toString());

        GraphExplorer ge = new GraphExplorer();
        System.out.println(ge.listEdges(n));
    }
}
