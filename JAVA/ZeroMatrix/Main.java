package ZeroMatrix;

import java.util.Arrays;

public class Main {

    /*
     * Given a bi-dimensional array, write an algorithm to set zeros on the row F and column C if exists a 0 in F:C
     *
     *
     * Example:
     *  Input: 2 1 3 0 2
     *         7 4 1 3 8
     *         4 0 1 2 1
     *         9 3 4 1 9
     *
     *  Output: 0 0 0 0 0
     *          7 0 1 0 8
     *          0 0 0 0 0
     *          9 0 4 0 9
     */

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] matrix = {
                {2, 1, 3, 0, 2},
                {7, 4, 1, 3, 8},
                {4, 0, 1, 2, 1},
                {9, 3, 4, 1, 9}
        };
        int[][] zeroedMatrix = {{0, 0, 0, 0, 0}, {7, 0, 1, 0, 8}, {0, 0, 0, 0, 0}, {9, 0, 4, 0, 9}};

        solution.zeroMatrix(matrix);

        System.out.println(Arrays.deepEquals(zeroedMatrix, matrix));

    }

}
