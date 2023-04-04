package LeetCode__0001__TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[]    test1    = {2, 7, 11, 15};
        System.out.println(Arrays.toString(solution.twoSum(test1, 9)));

        int[] test2 = {3, 2, 4};
        System.out.println(Arrays.toString(solution.twoSum(test2, 6)));
    }

}
