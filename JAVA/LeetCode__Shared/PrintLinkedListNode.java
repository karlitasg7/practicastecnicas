package LeetCode__Shared;

public class PrintLinkedListNode {

    public static void print(ListNode head) {
        if (head == null) {
            System.out.println("END");
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println(current.val + " -> END");
    }

}
