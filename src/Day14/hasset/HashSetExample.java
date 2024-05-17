package Day14.hasset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("four");
        set.add("six");
        set.add("seven");

        System.out.println(set);

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        set.remove("five");
        System.out.println(set);

        HashSet<String> set1 = new HashSet<>();
        set.add("five");
        set.add("Eight");

        set.addAll(set1);
        System.out.println(set);

        set.removeAll(set1);
        System.out.println(set);

        set.removeIf( str -> str.contains("one"));
        System.out.println(set);

        set.clear();
        System.out.println(set);

    }
}
