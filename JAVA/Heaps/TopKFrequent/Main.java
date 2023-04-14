package Heaps.TopKFrequent;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TopKFrequent topKFrequent = new TopKFrequent();

        int[] firstResult = topKFrequent.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(firstResult);

        System.out.println(Arrays.toString(firstResult)); // new int[]{1, 2}
        System.out.println(Arrays.toString(topKFrequent.topKFrequent(new int[]{1, 1, 2, 3, 3, 3}, 1))); // new int[]{3}
    }

}
