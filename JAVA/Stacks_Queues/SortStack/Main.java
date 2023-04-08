package Stacks_Queues.SortStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {

        SortStack sortStack = new SortStack();

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        Deque<Integer> sortedStack = sortStack.sort(stack);

        System.out.println(sortedStack.pop());
        System.out.println(sortedStack.pop());
        System.out.println(sortedStack.pop());
        System.out.println(sortedStack.pop());

    }

}
