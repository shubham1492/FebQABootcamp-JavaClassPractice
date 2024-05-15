package Day13.linkedlist;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Ravi");
        list.add("punith");
        list.add("karthik");
        list.add("Ravi");
        list.add("Minu");

        System.out.println(list);

        for(String str: list){
            System.out.println(str);
        }

        list.add(1,"gaurav");

        System.out.println(list);

        LinkedList<String> l2 = new LinkedList<>();
        l2.add("usha");
        l2.add("Ramesh");

        list.addAll(l2);

        System.out.println(list);

        list.addFirst("Lokesh");
        list.addLast("harsh");

        System.out.println(list);

    }
}
