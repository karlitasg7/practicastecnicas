package Stacks_Queues.SortStack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Given a stack, sort with the smaller elements at the top of the stack.
You can use another stack, but you can't use other data structure.

Example

Input 5->1->4->2
Output 1->2->4->5
 */
public class SortStack {

    public Deque<Integer> sort(Deque<Integer> stack) {

        Deque<Integer> sortedStack = new ArrayDeque<>();

        while (!stack.isEmpty()) {
            Integer element = stack.pop();

            while (!sortedStack.isEmpty() && element > sortedStack.peek()) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(element);
        }

        return sortedStack;

    }

}
