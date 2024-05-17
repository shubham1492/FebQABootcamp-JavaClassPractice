package Day14.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String>  map = new HashMap<>();

        map.put(1,"Ravi");
        map.put(6,"Mohan");
        map.put(3,"ajay");
        map.put(5,"Ramesh");
        map.put(4,"minu");
        map.put(4,"karthik");

        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.entrySet());

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" :"+entry.getValue());
        }

    }
}
