package LinkedList;

public class PrintLinkedList {

    public static void print(Node head) {
        if (head == null) {
            System.out.println("END");
            return;
        }

        Node current = head;
        while (current.next != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println(current.value + " -> END");
    }

}
