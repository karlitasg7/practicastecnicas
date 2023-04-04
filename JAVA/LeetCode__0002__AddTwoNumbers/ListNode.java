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

        String textToPrint = "";

        ListNode currentNode = next;

        textToPrint += currentNode.val;

        while (currentNode.next != null) {
            currentNode = currentNode.next;

            textToPrint += "," + currentNode.val;

        }

        System.out.println(textToPrint);
    }

}
