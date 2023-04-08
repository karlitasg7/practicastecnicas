package LinkedList.MergeTwoSortedLists;

import LinkedList.Node;
import LinkedList.PrintLinkedList;

public class Main {

    public static void main(String[] args) {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        Node list1 = new Node(1);
        list1.next           = new Node(2);
        list1.next.next      = new Node(4);
        list1.next.next.next = new Node(6);

        Node list2 = new Node(2);
        list2.next      = new Node(3);
        list2.next.next = new Node(5);

        PrintLinkedList.print(list1);
        PrintLinkedList.print(list2);
        
        Node result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        PrintLinkedList.print(result);

    }

}
