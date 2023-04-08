package LinkedList.MergeTwoSortedLists;

import LinkedList.Node;

/*

Given two simple linked lists sorted, merge it and return one linked list sorted

example
Input: 1->2->4->6, 2->3->5
Output: 1->2->2->3->4->5->6

O(n) - temporal
O(1) - spacial
 */
public class MergeTwoSortedLists {

    public Node mergeTwoLists(Node list1, Node list2) {

        Node aux     = new Node(-1);
        Node current = aux;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                current.next = list1;
                list1        = list1.next;
            } else {
                current.next = list2;
                list2        = list2.next;
            }
            current = current.next;
        }

        if (list1 == null) {
            current.next = list2;
        } else {
            current.next = list1;
        }

        return aux.next;

    }

}
