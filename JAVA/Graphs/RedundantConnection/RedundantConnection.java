package Graphs.RedundantConnection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*

Given a graph with an additional edge, return the edge that can be deleted
If exists multiple solutions, return the last in the output

 Example 1:
   Input: [[1,2],[1,3],[2,3]]
   Output: [2,3]

 Example 2:
   Input: [[1,2],[2,3],[3,4],[1,4],[1,5]]
   Output: [1,4]

 */
public class RedundantConnection {

    public int[] findRedundantConnection(int[][] edges) {
        List<Set<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            adjList.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            int first  = edge[0];
            int second = edge[1];
            if (dfs(first, second, -1, adjList)) {
                return edge;
            } else {
                adjList.get(first).add(second);
                adjList.get(second).add(first);
            }
        }
        return null;
    }

    private boolean dfs(int first, int second, int previous, List<Set<Integer>> adjList) {
        if (first == second) return true;
        for (int other : adjList.get(first)) {
            if (other == previous) continue;
            if (dfs(other, second, first, adjList)) return true;
        }
        return false;
    }

}
