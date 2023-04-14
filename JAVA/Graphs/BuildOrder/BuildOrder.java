package Graphs.BuildOrder;

import Graphs.Graph;
import Graphs.GraphNode;
import Graphs.GraphNodeStatus;

import java.util.ArrayList;
import java.util.Collections;

/*

Given a project list and the dependencies between them, return a valid compilation order for the projects

The dependencies list is a pair list of string (a,b) that means that project B depends on A

Example

Input
    projects: a, b, c, d
    dependencies: [(a, b), (a, c), (a, d), (c, b), (d, b), (d, c)]
Output: a, d, c, b

Input
    projects: a, b, c, d
    dependencies: [(a, b), (b, c), (c, d), (d, a)]
Output: throw an exception because it's a cycle

 */
public class BuildOrder {

    public ArrayList<String> buildOrder(String[] projects, String[][] dependencies) {
        Graph graph = buildDependencyGraph(projects, dependencies);

        ArrayList<String> sortedProjects = new ArrayList<>();

        for (GraphNode node : graph.nodes.values()) {
            depthFirstSearch1(node, sortedProjects);
        }

        Collections.reverse(sortedProjects);

        return sortedProjects;
    }

    private void depthFirstSearch1(GraphNode node, ArrayList<String> sortedProjects) {
        if (node == null) return;

        if (node.status == GraphNodeStatus.Unvisited) {

            node.status = GraphNodeStatus.Visiting;

            for (GraphNode n : node.adjacents.values()) {
                depthFirstSearch1(n, sortedProjects);
            }

            node.status = GraphNodeStatus.Visited;
            sortedProjects.add(node.value);
        } else if (node.status == GraphNodeStatus.Visiting) {
            throw new RuntimeException();
        }
    }

    private Graph buildDependencyGraph(String[] projects, String[][] dependencies) {
        Graph graph = new Graph();

        for (String p : projects) {
            graph.getOrCreateNode(p);
        }

        for (String[] dep : dependencies) {
            graph.addEdge(dep[0], dep[1]);
        }

        return graph;
    }

}
