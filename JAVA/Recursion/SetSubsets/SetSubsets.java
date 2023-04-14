package Recursion.SetSubsets;

import java.util.ArrayList;
import java.util.List;

/*
  Implements a method to return all subsets of a set of integers
  Example:
   Input: [1,2,3]

   Output:
     [
       [1,2,3],
       [1,2],
       [1,3],
       [2,3],
       [1],
       [2],
       [3],
       []
     ]
 */
public class SetSubsets {

    public List<List<Integer>> subsets(List<Integer> set) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // The '0' subset

        for (Integer element : set) {
            duplicateSubsetsAddingElement(element, subsets);
        }

        return subsets;
    }

    private void duplicateSubsetsAddingElement(Integer element, List<List<Integer>> subsets) {
        int currentSize = subsets.size();
        for (int i = 0; i < currentSize; i++) {
            List<Integer> newSubset = new ArrayList<>(subsets.get(i));
            newSubset.add(element);
            subsets.add(newSubset);
        }
    }

}
