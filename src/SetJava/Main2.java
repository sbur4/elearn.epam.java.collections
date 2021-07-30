import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Main2 {
    public static void main(String[] args) {
        hashSetShow();
        linkedHashSetShow();
        treeSetShow();

    }

    public static void hashSetShow() {

        // HashSet stores the elements by using a mechanism called hashing.
        // HashSet contains unique elements only.
        // HashSet allows null value.
        // HashSet class is non synchronized.
        // HashSet doesn't maintain the insertion order. Here, elements are inserted on
        // the basis of their hashcode.
        // HashSet is the best approach for search operations.
        // The initial default capacity of HashSet is 16, and the load factor is 0.75.

        HashSet<String> HashS = new HashSet<String>();
        HashS.add("Kex");
        HashS.add("Boston");
        HashS.add("Ju");
        System.out.println(HashS);
        System.out.println(HashS.size());
    }

    public static void linkedHashSetShow() {

        // Java LinkedHashSet class contains unique elements only like HashSet.
        // Java LinkedHashSet class provides all optional set operation and permits null
        // elements.
        // Java LinkedHashSet class is non synchronized.
        // Java LinkedHashSet class maintains insertion order.

        LinkedHashSet<Boolean> LinHashS = new LinkedHashSet<Boolean>();
        LinHashS.add(true);
        LinHashS.add(false);
        System.out.println(LinHashS);
        System.out.println(LinHashS.size());
    }

    public static void treeSetShow() {

        // Java TreeSet class contains unique elements only like HashSet.
        // Java TreeSet class access and retrieval times are quiet fast.
        // Java TreeSet class doesn't allow null element.
        // Java TreeSet class is non synchronized.
        // Java TreeSet class maintains ascending order.

        TreeSet<String> TreeS = new TreeSet<String>();
        TreeS.add("NaN");
        TreeS.add("null");
        System.out.println(TreeS);
        System.out.println(TreeS.size());
        System.out.println(TreeS.first());
        System.out.println(TreeS.pollLast());
    }

}
