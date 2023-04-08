package LinkedList.DeleteDuplicates;

import LinkedList.Node;
import LinkedList.PrintLinkedList;

public class Main {

    public static void main(String[] args) {

        RemoveDups removeDups = new RemoveDups();
        Node       head       = new Node(1);
        head.next                     = new Node(2);
        head.next.next                = new Node(2);
        head.next.next.next           = new Node(3);
        head.next.next.next.next      = new Node(4);
        head.next.next.next.next.next = new Node(1);

        PrintLinkedList.print(head);

        removeDups.remove(head);

        PrintLinkedList.print(head);

    }

}
