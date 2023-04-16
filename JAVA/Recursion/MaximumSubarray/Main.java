package Recursion.MaximumSubarray;

public class Main {

    public static void main(String[] args) {
        MaximumSubarray max = new MaximumSubarray();
        System.out.println(max.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); // 6
        System.out.println(max.maxSubArray(new int[]{5, 4, -1, 7, 8})); // 23
    }

}
