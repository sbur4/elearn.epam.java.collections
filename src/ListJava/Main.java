
import java.util.ArrayList;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        arrayListShow();
        linkedListShow();

        // ArrayList - uses a dynamic array / slow / act as a list / better for storing
        // and accessing data.
        // LinkedList - idoubly linked list / faster/ act as a list queue / better for
        // manipulating data.
    }

    public static void arrayListShow() {

        // Java ArrayList class can contain duplicate elements.
        // Java ArrayList class maintains insertion order.
        // Java ArrayList class is non synchronized.
        // Java ArrayList allows random access because array works at the index basis.

        ArrayList<Integer> ArrL = new ArrayList<Integer>();
        ArrL.add(0, 1);
        ArrL.add(1, 3);
        ArrL.add(2, 2);
        System.out.println(ArrL);
        System.out.println(ArrL.size());
        System.out.println(ArrL.get(1));
        System.out.println(ArrL.remove(2));
        System.out.println(ArrL.set(0, 5));
        System.out.println(ArrL.hashCode());
        System.out.println(ArrL.toString());
        System.out.println(ArrL);
    }

    public static void linkedListShow() {

        // Java LinkedList class can contain duplicate elements.
        // Java LinkedList class maintains insertion order.
        // Java LinkedList class is non synchronized.
        // In Java LinkedList class, manipulation is fast because no shifting needs to
        // occur.
        // Java LinkedList class can be used as a list, stack or queue.

        LinkedList<Character> LinkL = new LinkedList<Character>();
        LinkL.add(0, 'a');
        LinkL.add(1, 'b');
        LinkL.add(2, 'c');
        LinkL.add(3, 'd');
        LinkL.add(4, 'e');
        System.out.println(LinkL);
        System.out.println(LinkL.size());
        System.out.println(LinkL.get(1));
        System.out.println(LinkL.remove(2));
        System.out.println(LinkL.set(0, 'v'));
        System.out.println(LinkL.hashCode());
        System.out.println(LinkL.toString());
        System.out.println(LinkL.peekFirst());
        System.out.println(LinkL.peek());
        System.out.println(LinkL.peekLast());
        System.out.println(LinkL.peek());
        // System.out.println(LinkL);
    }
}
