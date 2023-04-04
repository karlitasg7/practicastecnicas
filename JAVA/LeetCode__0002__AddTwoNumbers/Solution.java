package LeetCode__0002__AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNodeList1 = l1;
        ListNode currentNodeList2 = l2;
        ListNode lastItem         = currentNodeList1;

        int additionalNumber = 0;
        while (currentNodeList2 != null) {

            if (currentNodeList1 == null) { //when list 2 is biggest

                String sumOfValues = String.valueOf(currentNodeList2.val + additionalNumber);

                if (sumOfValues.length() > 1) {
                    lastItem.next    = new ListNode(Integer.parseInt(sumOfValues.substring(1)));
                    additionalNumber = 1;
                } else {
                    additionalNumber = 0;
                    lastItem.next    = new ListNode(Integer.parseInt(sumOfValues));
                }

                lastItem         = lastItem.next;
                currentNodeList2 = currentNodeList2.next;

            } else {

                String sumOfValues = String.valueOf(currentNodeList1.val + currentNodeList2.val + additionalNumber);

                if (sumOfValues.length() > 1) {
                    currentNodeList1.val = Integer.parseInt(sumOfValues.substring(1));
                    additionalNumber     = 1;
                } else {
                    additionalNumber     = 0;
                    currentNodeList1.val = Integer.parseInt(sumOfValues);
                }

                lastItem         = currentNodeList1;
                currentNodeList1 = currentNodeList1.next;
                currentNodeList2 = currentNodeList2.next;
            }

        }

        while (currentNodeList1 != null) {
            String sumOfValues = String.valueOf(currentNodeList1.val + additionalNumber);

            if (sumOfValues.length() > 1) {
                currentNodeList1.val = Integer.parseInt(sumOfValues.substring(1));
                additionalNumber     = 1;
            } else {
                additionalNumber     = 0;
                currentNodeList1.val = Integer.parseInt(sumOfValues);
            }

            lastItem         = currentNodeList1;
            currentNodeList1 = currentNodeList1.next;
        }

        if (additionalNumber > 0) {
            lastItem.next = new ListNode(additionalNumber, null);
        }

        return l1;
    }
}
