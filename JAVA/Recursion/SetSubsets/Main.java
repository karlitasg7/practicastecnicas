package Recursion.SetSubsets;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SetSubsets setSubsets = new SetSubsets();

        List<Integer>       set    = new ArrayList<>(List.of(1, 2, 3));
        List<List<Integer>> result = setSubsets.subsets(set);

        System.out.println(result);

        System.out.println(result.contains(List.of(1, 2, 3))); // true
        System.out.println(result.contains(List.of(1, 2))); // true
        System.out.println(result.contains(List.of(1, 3))); // true
        System.out.println(result.contains(List.of(2, 3))); // true
        System.out.println(result.contains(List.of(1))); // true
        System.out.println(result.contains(List.of(2))); // true
        System.out.println(result.contains(List.of(3))); // true
        System.out.println(result.contains(List.of())); // true
        System.out.println(result.size()); // 8
    }

}
