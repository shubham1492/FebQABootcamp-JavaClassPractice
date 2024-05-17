package Day14.hasset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

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
    }
}
