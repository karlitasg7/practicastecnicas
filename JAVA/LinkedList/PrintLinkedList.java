package LinkedList;

public class PrintLinkedList {

    public void print(Node head) {
        if (head == null) {
            System.out.println("END");
            return;
        }

        Node current = head;
        while (current.next != null) {
            System.out.println(current.value + " -> ");
            current = current.next;
        }
        System.out.println(current.value + " -> END");
    }

}
