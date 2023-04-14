package Heaps;

public class Main {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(20);
        minHeap.insert(5);
        minHeap.insert(10);
        minHeap.insert(12);
        minHeap.printHeap();
        minHeap.insert(3);
        minHeap.printHeap();
        minHeap.insert(9);
        minHeap.insert(15);
        minHeap.insert(1);
        minHeap.printHeap();

        System.out.println(minHeap.extractMin()); // 1
        System.out.println(minHeap.extractMin()); // 3
        System.out.println(minHeap.extractMin()); // 5
        System.out.println(minHeap.extractMin()); // 9
        System.out.println(minHeap.extractMin()); // 10
        System.out.println(minHeap.extractMin()); // 12
        System.out.println(minHeap.extractMin()); // 15
    }

}
