package LeetCode__0020__ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' ||
                    c == '{' ||
                    c == '['
            ) {
                stack.push(getOpposite(c));
            } else {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }

        return stack.isEmpty();

    }

    private Character getOpposite(char c) {
        if (c == '(') return ')';
        if (c == '{') return '}';
        if (c == '[') return ']';
        return '0';
    }

}
