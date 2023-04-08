package LinkedList;

public class Main {

    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.print();
        singleLinkedList.appendToTail(1);
        singleLinkedList.appendToTail(2);
        singleLinkedList.appendToTail(3);
        singleLinkedList.print();
        singleLinkedList.appendToTail(4);
        singleLinkedList.appendToTail(5);
        singleLinkedList.print();
        singleLinkedList.deleteNode(1);
        singleLinkedList.print();
        singleLinkedList.deleteNode(3);
        singleLinkedList.print();

    }

}
