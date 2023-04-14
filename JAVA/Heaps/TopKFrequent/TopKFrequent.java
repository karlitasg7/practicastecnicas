package Heaps.TopKFrequent;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*

    Given a set of elements and a K value, returns the K element more frequent
    It can be return in any order

 Example
   Input:
     nums = [1,1,1,2,2,3]
     k = 2

   Output:
     [1,2]

  Input:
     nums = [1,1,2,2,3,3,3]
     k = 1

   Output:
     [3]
 */
public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> (b.getValue() - a.getValue())
        );

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }

        return result;
    }

}
