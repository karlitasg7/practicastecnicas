package Stacks_Queues.QueueWithStacks;

public class Main {

    public static void main(String[] args) {

        QueueWithStacks queueWithStacks = new QueueWithStacks();

        System.out.println(queueWithStacks.size());

        queueWithStacks.add(1);
        queueWithStacks.add(2);
        queueWithStacks.add(3);

        System.out.println(queueWithStacks.remove());
        System.out.println(queueWithStacks.peek());
        System.out.println(queueWithStacks.size());

        queueWithStacks.add(4);
        System.out.println(queueWithStacks.isEmpty());
        System.out.println(queueWithStacks.remove());
        System.out.println(queueWithStacks.remove());
        System.out.println(queueWithStacks.remove());
        System.out.println(queueWithStacks.isEmpty());

    }

}
