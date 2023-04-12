package Graphs;

public class Main {

    public static void main(String[] args) {
        Graph family = new Graph();
        family.addEdge("daniel", "maria");
        family.addEdge("daniel", "pedro");
        family.addEdge("maria", "javier");
        family.addEdge("lucia", "javier");

        System.out.println(searchTest(family, "daniel"));
        System.out.println(searchTest(family, "maria"));
        System.out.println(searchTest(family, "pedro"));
        System.out.println(searchTest(family, "javier"));
        System.out.println(searchTest(family, "lucia"));

        System.out.println(searchTest(family, "juan"));
    }

    private static boolean searchTest(Graph graph, String target) {
        Boolean dfs = DepthFirstSearch.depthFirstSearch(graph, target);
        resetNodes(graph);
        Boolean bfs = DepthFirstSearch.depthFirstSearch(graph, target);
        resetNodes(graph);
        return dfs && bfs && dfs == bfs;
    }

    private static void resetNodes(Graph graph) {
        for (GraphNode node : graph.nodes.values()) {
            node.status = GraphNodeStatus.Unvisited;
        }
    }

}
