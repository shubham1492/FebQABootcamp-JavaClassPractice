package Day14.map;

import java.util.HashMap;
import java.util.Map;

public class HashmapComparingExample {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"amit");
        map.put(105,"vijay");
        map.put(100,"rahul");

        map.entrySet()
                .stream().sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("-------------------");

        map.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


    }
}
