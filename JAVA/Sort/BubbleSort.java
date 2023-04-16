package Sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 4, 0, 3, 6, 1, 7, 19, 12, 2};

        int[] arrayCp = Arrays.copyOf(array, array.length);
        sort(arrayCp);
        System.out.println(Arrays.toString(arrayCp)); // {0, 1, 2, 3, 4, 6, 7, 8, 12, 19};
    }

}
