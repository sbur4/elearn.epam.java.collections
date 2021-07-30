import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

class Main4 {
    public static void main(String[] args) {
        queueShow();
        dequeShow();
    }

    public static void queueShow() {

        // Java Queue interface orders the element in FIFO(First In First Out) manner.

        PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
        pQ.add(1);
        pQ.add(3);
        pQ.add(5);
        System.out.println(pQ);
        System.out.println(pQ.size());

    }

    public static void dequeShow() {

        // Unlike Queue, we can add or remove elements from both sides.
        // Null elements are not allowed in the ArrayDeque.
        // ArrayDeque is not thread safe, in the absence of external synchronization.
        // ArrayDeque has no capacity restrictions.
        // ArrayDeque is faster than LinkedList and Stack.

        Deque<Integer> Deq = new ArrayDeque<Integer>();
        Deq.addFirst(7);
        Deq.add(9);
        Deq.addLast(8);
        System.out.println(Deq);

    }

}
