package LinkedList.DeleteDuplicates;

import LinkedList.Node;

import java.util.HashSet;

/*
 Remove duplicates in a linked list

 EX:

 Input: 1->2->2->3->4->1
 Output: 1->2->3->4

 */

public class RemoveDups {

    // O(n) in time and space
    public void remove(Node head) {

        if (head == null) return;

        HashSet<Integer> foundValues = new HashSet<>();

        Node current = head;

        foundValues.add(current.value);

        while (current != null && current.next != null) {
            if (!foundValues.add(current.next.value)) {
                current.next = current.next.next;
            }
            current = current.next;
        }

    }

}
