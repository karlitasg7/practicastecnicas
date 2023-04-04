package LeetCode__0001__TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2) return null;

        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (numbers.containsKey(nums[i])) {
                return new int[]{i, numbers.get(nums[i])};
            }

            int diff = target - nums[i];

            numbers.put(diff, i);
        }
        return null;
    }

}
