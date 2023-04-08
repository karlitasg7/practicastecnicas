package LinkedList.SwapNodesInPairs;

import LinkedList.Node;
import LinkedList.PrintLinkedList;

public class Main {

    public static void main(String[] args) {

        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        Node             list             = new Node(1);
        list.next                = new Node(2);
        list.next.next           = new Node(4);
        list.next.next.next      = new Node(6);
        list.next.next.next.next = new Node(8);

        PrintLinkedList.print(list);
        
        Node result = swapNodesInPairs.swapNodesInPairs(list);

        PrintLinkedList.print(result);

    }

}
