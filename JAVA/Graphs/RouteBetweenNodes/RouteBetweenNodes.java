package Graphs.RouteBetweenNodes;

import Graphs.Graph;
import Graphs.GraphNode;
import Graphs.GraphNodeStatus;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a managed graph and two nodes, check if exist a road start-end

Example: (Adjacent matrix):

        0 1 2 3 4

   0	 0 0 0 0 0
   1	 0 0 0 0 0
   2	 0 1 0 0 0
   3	 0 0 1 0 0
   4	 0 1 0 1 0

  isRouteBetween(2, 4) = false
  isRouteBetween(3, 1) = true
  isRouteBetween(0, 1) = false
  isRouteBetween(0, 0) = true

 */
public class RouteBetweenNodes {

    public boolean isRouteBetween(Graph g, GraphNode start, GraphNode end) {
        if (start == end) return true;

        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            GraphNode next = queue.remove();

            if (end == next) return true;

            for (GraphNode n : next.adjacents.values()) {
                if (!n.status.equals(GraphNodeStatus.Visited)) {
                    queue.add(n);
                    n.status = GraphNodeStatus.Visited;
                }
            }

        }

        return false;
    }

}
