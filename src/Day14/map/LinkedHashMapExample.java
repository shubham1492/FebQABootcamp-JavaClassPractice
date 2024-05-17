package Day14.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        map.put(101,"amit");
        map.put(105,"vijay");
        map.put(100,"rahul");

        System.out.println(map);

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

        map.remove(105);
        System.out.println(map.entrySet());

    }
}
