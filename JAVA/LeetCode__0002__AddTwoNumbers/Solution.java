package LeetCode__0002__AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result  = new ListNode(0);
        ListNode current = result;

        ListNode currentNodeList1 = l1;
        ListNode currentNodeList2 = l2;
        int      additionalNumber = 0;

        while (currentNodeList1 != null || currentNodeList2 != null || additionalNumber > 0) {

            int num1 = 0;
            int num2 = 0;

            if (currentNodeList1 != null) {
                num1             = currentNodeList1.val;
                currentNodeList1 = currentNodeList1.next;
            }

            if (currentNodeList2 != null) {
                num2             = currentNodeList2.val;
                currentNodeList2 = currentNodeList2.next;
            }

            int sum = num1 + num2 + additionalNumber;

            ListNode newNode = new ListNode();
            if (sum > 9) {
                additionalNumber = sum / 10;
            } else {
                additionalNumber = 0;
            }
            newNode.val = sum % 10;

            result.next = newNode;
            result      = result.next;

        }

        return current.next;
    }
}
