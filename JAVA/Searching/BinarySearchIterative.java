package Searching;

public class BinarySearchIterative {

    public static int binarySearch(int[] array, int target) {
        int left  = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (array[mid] == target) return mid;

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

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
