package LinkedList.NthNodeToLast;

import LinkedList.Node;
import LinkedList.PrintLinkedList;

public class Main {

    public static void main(String[] args) {
        NthNodeToLast nthNodeToLast = new NthNodeToLast();

        Node list = new Node(1);
        list.next           = new Node(2);
        list.next.next      = new Node(4);
        list.next.next.next = new Node(6);

        Node result = nthNodeToLast.nthNodeToLast(list, 2);

        PrintLinkedList.print(result);

        Node result10 = nthNodeToLast.nthNodeToLast(list, 10);
        PrintLinkedList.print(result10);

    }

}
