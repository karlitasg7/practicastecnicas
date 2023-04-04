package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    /*
    O(n) * O(c)
   */
    public List<List<String>> groupAnagrams(String[] words) {

        if (words == null || words.length == 0) {
            return Collections.emptyList();
        }

        Map<String, List<String>> anagramMap = buildAnagramMap(words);
        return new ArrayList<>(anagramMap.values());

    }

    private Map<String, List<String>> buildAnagramMap(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            String hash = getHasAnagram(word);

            if (!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }

            map.get(hash).add(word);

        }

        return map;
    }

    private String getHasAnagram(String s) {
        int[] letterCount = new int[26];

        for (int c : s.toCharArray()) {
            letterCount[c - 'a']++;
        }

        return Arrays.toString(letterCount);

    }

}
