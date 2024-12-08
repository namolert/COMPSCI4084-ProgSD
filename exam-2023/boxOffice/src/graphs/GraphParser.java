package graphs;

public class GraphParser {
    public static Node[] parseGraph(String spec) {
        String[] specList = spec.split("\n");
        int nodeCount = Integer.valueOf(specList[0]);
        Node[] nodeArray = new Node[nodeCount];
        for (int i = 0; i < nodeCount; i++) {
            nodeArray[i] = new Node(i + 1);
        }
        for (int i = 2; i < specList.length; i++) {
            int firstLabel = Integer.valueOf(specList[i].split(" ")[0]);
            int secondLabel = Integer.valueOf(specList[i].split(" ")[1]);
            nodeArray[firstLabel - 1].addNeighbour(nodeArray[secondLabel - 1]);
            System.out.println(nodeArray[firstLabel - 1].getNeighbours());
        }
        return nodeArray;
    }
}
