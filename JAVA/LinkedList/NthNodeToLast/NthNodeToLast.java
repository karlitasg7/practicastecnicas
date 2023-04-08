package LinkedList.NthNodeToLast;

import LinkedList.Node;

/*
Given a linked list simple and a value N, return the node N starts by the end

example
Input: 1->2->4->6, 2
Output: 4
 */

public class NthNodeToLast {

    public Node nthNodeToLast(Node head, int n) {

        Node position1 = head;
        Node position2 = head;

        for (int i = 0; i < n; i++) {
            if (position1 == null) return null;
            position1 = position1.next;
        }

        while (position1 != null) {
            position1 = position1.next;
            position2 = position2.next;
        }

        return position2;

    }

}
