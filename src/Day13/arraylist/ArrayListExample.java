package Day13.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println("ArrayList :"+ list.isEmpty());
        list.add("Mango");
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");

        System.out.println(list);
        System.out.println("Array list after adding data: "+ list.isEmpty());

        // Using iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("---------------------------------");

        for(String fruit: list){
            System.out.println(fruit);
        }

        Collections.sort(list);
        System.out.println("---------------------------------");
        System.out.println(list);
    }
}
