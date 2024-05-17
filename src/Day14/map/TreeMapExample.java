package Day14.map;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(1,"Ravi");
        treeMap.put(6,"Ramesh");
        treeMap.put(4,"Mohen");
        treeMap.put(3,"Harish");
        treeMap.put(2,"Aman");
        treeMap.put(8,"Krati");

        System.out.println(treeMap);

        System.out.println(treeMap.headMap(3));
        System.out.println(treeMap.tailMap(3));
        System.out.println(treeMap.subMap(1,4));

        System.out.println(treeMap.getOrDefault(4,"Not Found"));

    }
}
