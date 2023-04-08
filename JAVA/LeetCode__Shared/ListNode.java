package LeetCode__Shared;

public class ListNode {

    public int      val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
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
