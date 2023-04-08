package Stacks_Queues.QueueWithStacks;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Implement a queue using two stacks

 */
public class QueueWithStacks {

    Deque<Integer> firstStack  = new ArrayDeque<>();
    Deque<Integer> secondStack = new ArrayDeque<>();

    public void add(Integer value) {
        firstStack.push(value);
    }

    public Integer peek() {

        dumpElementsIntoSecondStack();

        return secondStack.peek();
    }

    public Integer remove() {
        dumpElementsIntoSecondStack();
        return secondStack.pop();
    }

    private void dumpElementsIntoSecondStack() {
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return firstStack.size() + secondStack.size();
    }

}
