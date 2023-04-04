import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_0001_TwoSum {

    public static void main(String[] args) {
        int[] test1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(test1, 9)));

        int[] test2 = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(test2, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] response = new int[2];

        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 1; i++) {

            int diff = target - nums[i];

            if (numbers.containsKey(diff) && i != numbers.get(diff)) {
                response[0] = i;
                response[1] = numbers.get(diff);
                break;
            }
        }
        return response;
    }

}
