package Day14.hasset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(3);

        System.out.println(treeSet);

        Iterator<Integer> itr = treeSet.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Lowest Value "+ treeSet.pollFirst());
        System.out.println("Highest Value "+ treeSet.pollLast());


    }
}
