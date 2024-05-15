package Day13.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverseExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Ravi");
        list.add("punith");
        list.add("karthik");
        list.add("Ravi");
        list.add("Minu");


        Iterator itr = list.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
