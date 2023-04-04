package LeetCode__0013__RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {

        Map<String, Integer> mapValues = new HashMap<>();

        mapValues.put("I", 1);
        mapValues.put("V", 5);
        mapValues.put("X", 10);
        mapValues.put("L", 50);
        mapValues.put("C", 100);
        mapValues.put("D", 500);
        mapValues.put("M", 1000);

        Map<String, Integer> mapValuesSpecials = new HashMap<>();

        mapValuesSpecials.put("IV", 4);
        mapValuesSpecials.put("IX", 9);
        mapValuesSpecials.put("XL", 40);
        mapValuesSpecials.put("XC", 90);
        mapValuesSpecials.put("CD", 400);
        mapValuesSpecials.put("CM", 900);

        int finalResult = 0;
        
        for (String key : mapValuesSpecials.keySet()) {
            while (s.contains(key)) {
                finalResult += mapValuesSpecials.get(key);
                s = s.replaceFirst(key, mapValuesSpecials.get(key).toString());
            }
        }

        for (String key : mapValues.keySet()) {
            while (s.contains(key)) {
                finalResult += mapValues.get(key);
                s = s.replaceFirst(key, mapValues.get(key).toString());
            }
        }

        return finalResult;

    }

}
