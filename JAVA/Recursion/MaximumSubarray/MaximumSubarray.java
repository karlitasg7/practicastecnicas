package Recursion.MaximumSubarray;

/*
    Given a integer's array, find the subarray with the highest sum and return it

  Example 1:
   Input:
     [-2,1,-3,4,-1,2,1,-5,4]
   Output:
     6 (subarray [4,-1,2,1])

  Example 2:
   Input:
     [5,4,-1,7,8]
   Output:
     23 (subarray [5,4,-1,7,8], total array)

 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxSum     = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) currentSum = 0;

            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
