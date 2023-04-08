package Stacks_Queues.StackMin;

public class Main {

    public static void main(String[] args) {

        StackMin stackMin = new StackMin();

        stackMin.push(3);
        stackMin.push(1);
        stackMin.push(2);

        System.out.println(stackMin.min());
        stackMin.pop();
        System.out.println(stackMin.min());
        stackMin.pop();
        System.out.println(stackMin.min());
        stackMin.push(0);
        System.out.println(stackMin.min());
    }

}
