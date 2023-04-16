package Searching;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, 0, array.length - 1, target);
    }

    private static int binarySearch(int[] array, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // Elemento presente en el elemento central del array.
            if (array[mid] == target) return mid;

            // Si el elemento es menor que el central, se debe encontrar a su izquierda.
            if (array[mid] > target) return binarySearch(array, left, mid - 1, target);

            // En caso contrario solo puede encontrarse en la mitad derecha.
            return binarySearch(array, mid + 1, right, target);
        }

        // Element not found
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 7, 8, 9, 12, 15, 24, 35, 95};

        System.out.println(binarySearch(array, 1)); // 0
        System.out.println(binarySearch(array, 4)); // 2
        System.out.println(binarySearch(array, 12)); // 6
        System.out.println(binarySearch(array, 95)); // 10

        System.out.println(binarySearch(array, 0)); // -1
        System.out.println(binarySearch(array, 6)); // -1
        System.out.println(binarySearch(array, 13)); // -1
        System.out.println(binarySearch(array, 100)); // -1
    }

}
