package LeetCode__0002__AddTwoNumbers;

public class Main {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode();
        listNode1.val  = 2;
        listNode1.next = new ListNode(4, new ListNode(3, null));

        ListNode listNode2 = new ListNode();
        listNode2.val  = 5;
        listNode2.next = new ListNode(6, new ListNode(4, null));

        Solution solution = new Solution();

        listNode1.printList();
        listNode2.printList();

        solution.addTwoNumbers(listNode1, listNode2).printList();

    }

}
