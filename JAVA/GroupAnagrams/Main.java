package GroupAnagrams;

public class Main {

    /*
    Given an array of words, return an array with subarray with the anagrams words

     */
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.groupAnagrams(new String[]{"saco", "arresto", "programa", "rastreo", "caso"}));

        System.out.println(solution.groupAnagrams(new String[]{}));
    }

}
