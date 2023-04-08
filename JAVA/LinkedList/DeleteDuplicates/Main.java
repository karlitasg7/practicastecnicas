package LinkedList.DeleteDuplicates;

import LinkedList.Node;
import LinkedList.PrintLinkedList;

public class Main {

    public static void main(String[] args) {

        PrintLinkedList printLinkedList = new PrintLinkedList();

        RemoveDups removeDups = new RemoveDups();
        Node       head       = new Node(1);
        head.next                     = new Node(2);
        head.next.next                = new Node(2);
        head.next.next.next           = new Node(3);
        head.next.next.next.next      = new Node(4);
        head.next.next.next.next.next = new Node(1);

        printLinkedList.print(head);

        removeDups.remove(head);

        printLinkedList.print(head);

    }

}
