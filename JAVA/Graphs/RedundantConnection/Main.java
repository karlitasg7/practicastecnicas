package Graphs.RedundantConnection;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        RedundantConnection redundantConnection = new RedundantConnection();

        int[][] first = {{1, 2}, {1, 3}, {2, 3}};
        System.out.println(Arrays.toString(redundantConnection.findRedundantConnection(first))); // new int[] {2, 3}

        int[][] second = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        System.out.println(Arrays.toString(redundantConnection.findRedundantConnection(second))); // new int[] {1, 4}
    }

}
