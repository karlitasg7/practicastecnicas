package LeetCode__0026__RemoveDuplicatesFromSortedArray;

public class Main {

    public static void main(String[] args) {

        LeetCode__0026__RemoveDuplicatesFromSortedArray.Solution solution = new Solution();

        int[] test1 = {1, 1, 2};
        System.out.println(solution.removeDuplicates(test1));

        int[] test2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(solution.removeDuplicates(test2));
    }

}
