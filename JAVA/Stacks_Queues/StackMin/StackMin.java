package Stacks_Queues.StackMin;

import java.util.ArrayDeque;
import java.util.Deque;

/*
design a stack with a min function, additional to push and pop
 */
public class StackMin {

    private Deque<Integer> valuesStack = new ArrayDeque<>();
    private Deque<Integer> minStack    = new ArrayDeque<>();

    public void push(Integer data) {
        valuesStack.push(data);

        if (minStack.isEmpty() || data <= minStack.peek()) {
            minStack.push(data);
        }
    }

    public int pop() {
        int value = valuesStack.pop();

        if (!minStack.isEmpty() && value == minStack.peek()) {
            minStack.pop();
        }

        return value;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return 0;
        }
        return minStack.peek();
    }

}
