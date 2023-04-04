package LeetCode__0002__AddTwoNumbers;

public class ListNode {

    int      val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val  = val;
        this.next = next;
    }

    public void printList() {

        System.out.println("Print List.... >>>>>");

        StringBuilder textToPrint = new StringBuilder(val + ",");

        ListNode currentNode = next;

        textToPrint.append(currentNode.val);

        while (currentNode.next != null) {
            currentNode = currentNode.next;

            textToPrint.append(",").append(currentNode.val);

        }

        System.out.println(textToPrint);
    }

}
