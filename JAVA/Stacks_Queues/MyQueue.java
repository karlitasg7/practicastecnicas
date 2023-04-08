package Stacks_Queues;

import LinkedList.Node;

public class MyQueue {

    private Node first;
    private Node last;

    public void add(int value) {
        Node newLast = new Node(value);
        if (last != null) {
            last.next = newLast;
        }

        last = newLast;

        if (first == null) {
            first = last;
        }
    }

    public int remove() {

        int firstValue = peek();
        first = first.next;

        if (first == null) {
            last = null;
        }

        return firstValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new MyEmptyQueueException();
        }

        return first.value;
    }

    public boolean isEmpty() {
        return first == null;
    }

}
