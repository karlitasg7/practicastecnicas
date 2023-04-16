package Sort;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int low, int high) {
        if (low < high) {
            // Índice de partition, arr[p] se encuentra ahora en la posición correcta.
            int index = partition(array, low, high);

            // Ordenamos los elementos antes y después de la partición de forma separada.
            sort(array, low, index - 1);
            sort(array, index + 1, high);
        }
    }

    /*
     * Esta función toma el último elemento como pivote, lo coloca en su posición correcta y
     * posiciona los elementos menores que él a su izquierda y los mayores a la derecha.
     */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];

        // Índice del menor elemento. Indica la posición correcta del pivote hasta el momento.
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                // Incrementamos el índice del menor elemento si el actual es menor que el pivote.
                i++;
                SortUtils.swap(array, i, j);
            }
        }

        // Movemos el pivote a la posición correcta.
        SortUtils.swap(array, i + 1, high);
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 4, 0, 3, 6, 1, 7, 19, 12, 2};

        int[] arrayCp = Arrays.copyOf(array, array.length);
        sort(arrayCp);
        System.out.println(Arrays.toString(arrayCp)); // {0, 1, 2, 3, 4, 6, 7, 8, 12, 19};
    }

}
