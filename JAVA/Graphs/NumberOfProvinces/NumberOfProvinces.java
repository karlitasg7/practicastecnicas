package Graphs.NumberOfProvinces;

/*

Given N cities, calculate the number of provinces
A province is composed by all connected cities

 Example
   Input:

      a b c
    a 1 1 0
    b 1 1 0
    c 0 0 1

   Output: 2
 */
public class NumberOfProvinces {

    public int numberOfProvinces(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int       count   = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        for (int other = 0; other < isConnected.length; other++) {
            if (other != city && isConnected[city][other] == 1 && !visited[other]) {
                visited[other] = true;
                dfs(isConnected, visited, other);
            }
        }
    }

}
