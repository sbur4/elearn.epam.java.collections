import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Main3 {
    public static void main(String[] args) {
        hashMapShow();
        linkedHashMapShow();
        treeMapShow();
        hashtableShow();
    }

    public static void hashMapShow() {

        // Java HashMap contains values based on the key.
        // Java HashMap contains only unique keys.
        // Java HashMap may have one null key and multiple null values.
        // ava HashMap is non synchronized.
        // Java HashMap maintains no order.
        // The initial default capacity of Java HashMap class is 16 with a load factor
        // of 0.75.

        HashMap<Integer, String> HashM = new HashMap<Integer, String>();
        HashM.put(0, "FG DJ RADIO PARIS");
        HashM.put(1, "FG BELGIQUE");
        System.out.println(HashM);
        System.out.println(HashM.size());
        System.out.println(HashM.keySet());
        System.out.println(HashM.values());
        System.out.println(HashM.get(1));
    }

    public static void treeMapShow() {

        // Java LinkedHashMap contains values based on the key.
        // Java LinkedHashMap contains unique elements.
        // Java LinkedHashMap may have one null key and multiple null values.
        // Java LinkedHashMap is non synchronized.
        // Java LinkedHashMap maintains insertion order.
        // The initial default capacity of Java HashMap class is 16 with a load factor
        // of 0.75.

        TreeMap<Character, Integer> TreeM = new TreeMap<Character, Integer>();
        TreeM.put('a', 1);
        TreeM.put('b', 3);
        TreeM.put('c', 5);
        System.out.println(TreeM);
        System.out.println(TreeM.size());
        System.out.println(TreeM.keySet());
        System.out.println(TreeM.values());
        System.out.println(TreeM.get('c'));
    }

    public static void hashtableShow() {

        // A Hashtable is an array of a list. Each list is known as a bucket. The
        // position of the bucket is identified by calling the hashcode() method. A
        // Hashtable contains values based on the key.
        // Java Hashtable class contains unique elements.
        // Java Hashtable class doesn't allow null key or value.
        // Java Hashtable class is synchronized.
        // The initial default capacity of Hashtable class is 11 whereas loadFactor is
        // 0.75.

        Hashtable<String, String> Hasht = new Hashtable<String, String>();
        Hasht.put("yes", "java");
        Hasht.put("no", "script");
        System.out.println(Hasht);
        System.out.println(Hasht.size());
        System.out.println(Hasht.keySet());
        System.out.println(Hasht.values());
        System.out.println(Hasht.get("no"));

        // HashMap - non synchronized / allows one null key and multiple null values /
        // new class introduced in JDK 1.2 / fast / We can make the HashMap as
        // synchronized by calling this code
        // Map m = Collections.synchronizedMap(hashMap); / traversed by Iterator /
        // Iterator in HashMap is fail-fast / inherits AbstractMap class.
        // Hashtable - synchronized / doesn't allow any null key or value / legacy class
        // / slow /
        // / Hashtable is internally synchronized and can't be unsynchronized/ traversed
        // by Enumerator and Iterator / not fail-fast / Hashtable inherits Dictionary
        // class.
    }

    public static void linkedHashMapShow() {

        // Java TreeMap contains values based on the key. It implements the NavigableMap
        // interface and extends AbstractMap class.
        // Java TreeMap contains only unique elements.
        // Java TreeMap cannot have a null key but can have multiple null values.
        // Java TreeMap is non synchronized.
        // Java TreeMap maintains ascending order.

        LinkedHashMap<Integer, Integer> LinHashM = new LinkedHashMap<Integer, Integer>();
        LinHashM.put(0, 3);
        LinHashM.put(1, 5);
        System.out.println(LinHashM);
        System.out.println(LinHashM.size());
        System.out.println(LinHashM.keySet());
        System.out.println(LinHashM.values());
        System.out.println(LinHashM.get(1));
    }

}
