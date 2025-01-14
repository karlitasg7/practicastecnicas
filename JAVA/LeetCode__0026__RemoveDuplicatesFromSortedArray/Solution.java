package LeetCode__0026__RemoveDuplicatesFromSortedArray;

public class Solution {

    public int removeDuplicates(int[] nums) {

        int k   = 1;
        int pos = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[pos] = nums[i];
                k++;
                pos++;
            }
        }

        return k;
    }

}
