package LinkedList.MergeKSortedLists;

import LinkedList.Node;

public class Main {

    public static void main(String[] args) {
        MergeKSortedLists mergeLists = new MergeKSortedLists();

        Node l1 = new Node(1);
        l1.next      = new Node(4);
        l1.next.next = new Node(5);

        Node l2 = new Node(1);
        l2.next      = new Node(3);
        l2.next.next = new Node(4);

        Node l3 = new Node(2);
        l3.next = new Node(6);

        Node mergedList = mergeLists.mergeKLists(new Node[]{l1, l2, l3});

        System.out.println(mergedList.value); // 1
        System.out.println(mergedList.next.value); // 1
        System.out.println(mergedList.next.next.value); // 2
        System.out.println(mergedList.next.next.next.value); // 3
        System.out.println(mergedList.next.next.next.next.value); // 4
        System.out.println(mergedList.next.next.next.next.next.value); // 4
        System.out.println(mergedList.next.next.next.next.next.next.value); // 5
        System.out.println(mergedList.next.next.next.next.next.next.next.value); // 6
    }

}
