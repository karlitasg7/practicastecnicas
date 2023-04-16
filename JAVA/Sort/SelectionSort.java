package Sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = findMinimumElementIndex(array, i);
            SortUtils.swap(array, i, minIndex);
        }
    }

    private static int findMinimumElementIndex(int[] array, int start) {
        int minIndex = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) minIndex = i;
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] array   = new int[]{8, 4, 0, 3, 6, 1, 7, 19, 12, 2};
        int[] arrayCp = Arrays.copyOf(array, array.length);
        sort(arrayCp);
        System.out.println(Arrays.toString(arrayCp)); // {0, 1, 2, 3, 4, 6, 7, 8, 12, 19};
    }

}
