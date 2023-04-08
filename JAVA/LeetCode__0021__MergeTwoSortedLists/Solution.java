package LeetCode__0021__MergeTwoSortedLists;

import LeetCode__Shared.ListNode;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode aux     = new ListNode(-1);
        ListNode current = aux;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
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
