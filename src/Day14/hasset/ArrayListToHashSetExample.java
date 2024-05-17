package Day14.hasset;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToHashSetExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("Watermealon");
        list.add("Grapes");
        list.add("Apple");

        System.out.println(list);

        HashSet<String> set = new HashSet<>(list);

        System.out.println(set);


    }
}
