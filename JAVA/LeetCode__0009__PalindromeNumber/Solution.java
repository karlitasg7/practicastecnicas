package LeetCode__0009__PalindromeNumber;

public class Solution {

    public boolean isPalindrome(int x) {

        String numberAsString        = String.valueOf(x);
        String reverseNumberAsString = new StringBuilder(numberAsString).reverse().toString();

        return numberAsString.equals(reverseNumberAsString);

    }

}
