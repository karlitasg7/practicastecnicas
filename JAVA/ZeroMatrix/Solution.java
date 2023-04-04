package ZeroMatrix;

public class Solution {

    public void zeroMatrix(int[][] matrix) {
        boolean firstRowHasZero = hasFirstRowAnyZeroes(matrix);
        boolean firstColHasZero = hasFirstColAnyZeroes(matrix);

        checkForZeroes(matrix);

        processRows(matrix);
        processColumns(matrix);

        if (firstRowHasZero) {
            setRowToZero(matrix, 0);
        }

        if (firstColHasZero) {
            setColToZero(matrix, 0);
        }
    }

    private boolean hasFirstRowAnyZeroes(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean hasFirstColAnyZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                return true;
            }
        }
        return false;
    }

    private void checkForZeroes(int[][] matrix) {
        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
    }

    private void processRows(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                setRowToZero(matrix, row);
            }
        }
    }

    private void setRowToZero(int[][] matrix, int row) {
        for (int col = 0; col < matrix[0].length; col++) {
            matrix[row][col] = 0;
        }
    }

    private void processColumns(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[0][col] == 0) {
                setColToZero(matrix, col);
            }
        }
    }

    private void setColToZero(int[][] matrix, int col) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row][col] = 0;
        }
    }

}
